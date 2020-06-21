package org.hossein.model.repository;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.hossein.common.JDBC;
import org.hossein.model.entity.Uni;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UniDA implements AutoCloseable {
    private PreparedStatement preparedStatement;
    private Connection connection;

    public UniDA() throws SQLException {
        connection = JDBC.getConnection();
    }

    public void insert(Uni uni) throws Exception {
        preparedStatement = connection.prepareStatement("insert into uniweb (name,address,dateofestablished) values (?,?,?)");
        preparedStatement.setString(1, uni.getName());
        preparedStatement.setString(2, uni.getAddress());
        preparedStatement.setString(3, uni.getDateofestablished());
        preparedStatement.executeQuery();
    }

    public String select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from uniweb");
        ResultSet resultSet = preparedStatement.executeQuery();
        JSONArray jsonArray = new JSONArray();
        while (resultSet.next()) {
            JSONObject jsonObject = new JSONObject();

            jsonObject.put("name", resultSet.getString("NAME"));
            jsonObject.put("address", resultSet.getString("ADDRESS"));
            jsonObject.put("dateofestablished", resultSet.getString("DATEOFESTABLISHED"));
            jsonArray.add(jsonObject);

        }
        return jsonArray.toJSONString();

    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}

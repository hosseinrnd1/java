package org.hossein.model.repository;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.hossein.common.JDBC;
import org.hossein.model.entity.Person;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDA implements AutoCloseable {
    private PreparedStatement preparedStatement;
    private Connection connection;

    public PersonDA () throws SQLException {
        connection = JDBC.getConnection();
    }

    public void insert(Person person) throws Exception {
        preparedStatement = connection.prepareStatement("insert into personweb (id,name,family,grade) values (?,?,?,?)");
        preparedStatement.setLong(1, person.getId());
        preparedStatement.setString(2, person.getName());
        preparedStatement.setString(3, person.getFamily());
        preparedStatement.setDouble(4, person.getGrade());
        preparedStatement.executeQuery();
    }

    public String select() throws Exception {
        preparedStatement = connection.prepareStatement("select * from personweb");
        ResultSet resultSet = preparedStatement.executeQuery();
        JSONArray jsonArray = new JSONArray();
        while (resultSet.next()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", resultSet.getString("ID"));
            jsonObject.put("name", resultSet.getString("NAME"));
            jsonObject.put("family", resultSet.getString("FAMILY"));
            jsonObject.put("grade", resultSet.getString("GRADE"));
            jsonArray.add(jsonObject);

        }
        return jsonArray.toJSONString();

    }

    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}

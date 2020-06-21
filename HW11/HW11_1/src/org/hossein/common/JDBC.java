package org.hossein.common;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBC {
    private static BasicDataSource basicDataSource = new BasicDataSource();
    static
    {
        basicDataSource.setMaxTotal(10);
        basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        basicDataSource.setUsername("hossein");
        basicDataSource.setPassword("hossein7581");
        basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    }
     public static Connection getConnection() throws SQLException {
         return basicDataSource.getConnection();
     }
}

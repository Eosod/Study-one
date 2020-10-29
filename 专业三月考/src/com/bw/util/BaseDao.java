package com.bw.util;

import java.sql.*;

public class BaseDao {
    public static String driver = "com.mysql.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/ex";
    public static String name = "root";
    public static String password = "123";
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection connection()
    {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void close(ResultSet a , Connection b , Statement c)
    {
        try {
            if (a!=null)
            {
                a.close();
            }
            if (b!=null)
            {
                b.close();
            }
            if (c!=null)
            {
                c.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

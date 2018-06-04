package org.JavaHillel2.task40;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Databases {

    private final String url;
    private final String root;
    private final String password;

    public Databases(String url, String root, String password) {
        this.url = url;
        this.root = root;
        this.password = password;
    }

    private Connection makeConnectionWithDataBase()  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, root, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (connection != null) {
            System.out.println("Connection created successfully");

        } else {
            System.out.println("Problem with creating connection");
        }
        return connection;
    }

    public void autoByMark (String mark) throws SQLException {
        Connection con = makeConnectionWithDataBase();
        String st = "select * from cars where mark in ('MARKNAME');";
        st.replaceAll("MARKNAME", mark);
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(st);
        while (rs.next()){
            String markOfCar = rs.getString("mark");
            String model = rs.getString("model");
            String transmission = rs.getString("transmission");
            int year = rs.getInt("year");
            int price = rs.getInt("price");
            int stock = rs.getInt("stock");
            String country = rs.getString("country");
            System.out.print("Mark - " + markOfCar);
            System.out.print("Model - " + model);
            System.out.print("Transmission - " + transmission);
            System.out.print("Year - " + year);
            System.out.print("Price - " + price);
            System.out.print("Stock - " + stock);
            System.out.print("Country - " + country);
        }
        rs.close();
        statement.close();
    }

}

package com.example.javaeetest.mysql.business;

import java.sql.*;
import java.util.ArrayList;

public class JavaDB {

    private final static String url = "jdbc:mysql://localhost/java_ee_test";
    private final static String username = "root";
    private final static String password = "root";

    public static ArrayList<Massage> select() {

        ArrayList<Massage> massageList = new ArrayList<Massage>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM test_data");

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String description = resultSet.getString("descriptionText");
                    int someNumbers = resultSet.getInt("someNumber");
                    Massage massage = new Massage(id, description, someNumbers);
                    System.out.println(massage.getId());
                    massageList.add(massage);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return massageList;
    }

    public static Massage selectOne(int id) {

        Massage massage = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "SELECT * FROM java_ee_test WHERE id=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {

                        int massId = resultSet.getInt("id");
                        String description = resultSet.getString("descriptionText");
                        int someNumbers = resultSet.getInt("someNumber");
                        massage = new Massage(massId, description, someNumbers);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return massage;
    }

    public static int insert(Massage massage) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "INSERT INTO java_ee_test (descriptionText, someNumber) Values (?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, massage.getDescription());
                    preparedStatement.setInt(2, massage.getSomeNumber());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(Massage massage) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "UPDATE java_ee_test SET descriptionText = ?, someNumber = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, massage.getDescription());
                    preparedStatement.setInt(2, massage.getSomeNumber());
                    preparedStatement.setInt(3, massage.getId());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int delete(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "DELETE FROM java_ee_test WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }
}
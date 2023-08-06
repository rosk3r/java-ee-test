package com.example.javaeetest.mysql.business;

import java.sql.*;
import java.util.ArrayList;

public class JavaDB {

    private final static String url = "jdbc:mysql://localhost/java_ee_test";
    private final static String username = "root";
    private final static String password = "root";

    public static ArrayList<Message> select() {

        ArrayList<Message> messageList = new ArrayList<Message>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM test_data");

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String description = resultSet.getString("descriptionText");
                    int someNumbers = resultSet.getInt("someNumber");
                    Message message = new Message(id, description, someNumbers);
                    messageList.add(message);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return messageList;
    }

    public static Message selectOne(int id) {

        Message message = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "SELECT * FROM test_data WHERE id=?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if (resultSet.next()) {

                        int massId = resultSet.getInt("id");
                        String description = resultSet.getString("descriptionText");
                        int someNumbers = resultSet.getInt("someNumber");
                        message = new Message(massId, description, someNumbers);
                    }
                }
            }
        } catch (Exception ex) {

            System.out.println(ex);
        }
        return message;
    }

    public static void insert(Message message) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "INSERT INTO test_data (descriptionText, someNumber) Values (?, ?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, message.getDescription());
                    preparedStatement.setInt(2, message.getSomeNumber());

                    preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void update(Message message) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "UPDATE test_data SET descriptionText = ?, someNumber = ? WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, message.getDescription());
                    preparedStatement.setInt(2, message.getSomeNumber());
                    preparedStatement.setInt(3, message.getId());

                    preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {

            System.out.println(ex);
        }
    }

    public static void delete(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                String sql = "DELETE FROM test_data WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);

                    preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
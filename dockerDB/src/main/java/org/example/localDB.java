package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class localDB {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/soyerbugra";
        String username = "soyerbugra";
        String password = "Televole";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM account WHERE id = 1")) {

            preparedStatement.setInt(1, 1); // Replace 1 with the id you want to search for

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
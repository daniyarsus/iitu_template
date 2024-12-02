package week_12;

import java.sql.*;
import java.util.Scanner;

public class Auth {
    private static final String URL = "jdbc:mysql://localhost:3306/auth_iitu_mysql_db";
    private static final String USER = "admin";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            createUsersTableIfNotExists(connection);

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Register");
            System.out.println("2. Login");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                registerUser(connection, scanner);
            } else if (choice == 2) {
                loginUser(connection, scanner);
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createUsersTableIfNotExists(Connection connection) throws SQLException {
        String createTableSQL = """
                CREATE TABLE IF NOT EXISTS users (
                    id SERIAL PRIMARY KEY,
                    email VARCHAR(255) UNIQUE NOT NULL,
                    password VARCHAR(255) NOT NULL
                );
                """;
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            System.out.println("Table 'users' is ready.");
        }
    }

    private static void registerUser(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String insertUserSQL = "INSERT INTO users (email, password) VALUES (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertUserSQL)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            System.out.println("Registration successful!");
        } catch (SQLException e) {
            if (e.getSQLState().equals("23505")) {
                System.out.println("Email is already registered.");
            } else {
                throw e;
            }
        }
    }

    private static void loginUser(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String selectUserSQL = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(selectUserSQL)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("Login successful! Welcome " + email);
                } else {
                    System.out.println("Invalid email or password.");
                }
            }
        }
    }
}

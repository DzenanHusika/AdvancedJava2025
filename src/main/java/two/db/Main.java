package two.db;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/store";
        String user = "root";
        String password = "root";
        try(Connection connection = DriverManager.getConnection(url, user, password);){
            String sql = "SELECT * FROM products";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Integer quantity = resultSet.getInt("quantity_in_stock");
                System.out.println(name + " " + quantity);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}

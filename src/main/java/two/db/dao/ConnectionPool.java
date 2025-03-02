package two.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private List<Connection> availableConnections = new ArrayList<>(20);
    private List<Connection> inUseConnections = new ArrayList<>(20);

    private ConnectionPool(){
        System.out.println("Kreiram connection pool ili bazen");
        for (int i = 0; i < 20; i++){
            Connection connection = createConnection();
            availableConnections.add(connection);
        }
    }
    private Connection createConnection(){
        String url = "jdbc:mysql://localhost:3306/store";
        String user = "root";
        String password = "root";
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public Connection getConnection(){
        if (availableConnections.isEmpty()){
            throw new RuntimeException("Nema više konekcija..");
        }
        Connection connection = availableConnections.getLast();
        availableConnections.remove(connection);
        inUseConnections.add(connection);
        return  connection;
    }
    public void releaseConnection(Connection connection){
        availableConnections.add(connection);
        inUseConnections.remove(connection);
        ConnectionPool connectionPool = new ConnectionPool();
    }
    private static ConnectionPool elvisInstance = null;

    public static ConnectionPool instance(){
        if (elvisInstance == null){
            elvisInstance = new ConnectionPool();
        }
        return elvisInstance;
    }
}

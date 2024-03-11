import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "root"; // Default MySQL username
        String password = ""; // Default MySQL password (leave empty if not set)
        
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
}

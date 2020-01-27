package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectToMysql {
	private String url = "jdbc:mysql://localhost:3306/javabase";
	private String username = "java";
	private String password = "password";

//	System.out.println("Connecting database...");
//	System.out.println("Fuck Eclipse");

	try (Connection connection = DriverManager.getConnection(url, username, password)) {
	    System.out.println("Database connected!");
	} catch (SQLException e) {
	    throw new IllegalStateException("Cannot connect the database!", e);
	}
}

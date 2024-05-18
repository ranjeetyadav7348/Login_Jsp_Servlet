package user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {

    static String url= "jdbc:mysql://localhost:3306/users"; // table details
		static String username = "root"; // MySQL credentials
		static String password = "7348207455";
	//	String query= "delete from student where id=4"; // query to be run
	//	Class.forName("com.mysql.cj.jdbc.Driver");

    static{

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

    public static Connection gerConnection() throws SQLException
    {
        Connection con = DriverManager.getConnection(url, username, password);
        return con;

    }

  
    
}

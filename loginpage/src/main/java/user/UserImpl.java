package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserImpl {

    public boolean isValidUser(String username, String pass) {
       
        String query="select * from users where username=? and password=?";

        try
        {
            Connection connection=DButil.gerConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, pass);
            ResultSet resultSet=preparedStatement.executeQuery();

            return resultSet.next();

        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addUser(user User) {
       
      String query="insert into users (username,email,password) values(?,?,?)";

      try {

        Connection connection=DButil.gerConnection();

        PreparedStatement preparedStatement=connection.prepareStatement(query);

        preparedStatement.setString(1, User.getUsername());
        preparedStatement.setString(2, User.getEmail());
        preparedStatement.setString(3, User.getPassword());


        int r=preparedStatement.executeUpdate();


        return r>0;
        




        
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("nhi hua update");
        return false;
      }

    }
    
}

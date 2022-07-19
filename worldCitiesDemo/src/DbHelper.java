import java.sql.*;

public class DbHelper {
    
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/world";
    
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exc){
        System.out.println("Error: "+exc.getMessage());
        System.out.println("Error Code: "+exc.getErrorCode());
    }
    
}

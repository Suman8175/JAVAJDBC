import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Learning0 {

    private static Connection con;

    public static Connection getConn(){

        try{
            if (con==null){
                String url="jdbc:sqlserver://localhost;database=suman;username=sa;password=password;encrypt=true;trustServerCertificate=true;";
                con= DriverManager.getConnection(url);
            }
        }
        catch (Exception e){
            System.out.println("Error has occured....");
            System.out.println(e.getMessage());
        }
       return con;
    }

}

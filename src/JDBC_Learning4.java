import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

//Insert into table using prepared statement
public class JDBC_Learning4 {
    public static void main(String[] args) {
        String url="jdbc:sqlserver://localhost;database=suman;username=sa;password=password;encrypt=true;trustServerCertificate=true;";
        String query="INSERT INTO room(RoomName,RoomSize) values (?,?)";
        try{
        Connection con= DriverManager.getConnection(url);
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,"Tester");
            preparedStatement.setInt(2,33);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            con.close();
            System.out.println("Data added successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

import java.sql.*;

//Creating table in sql using jdbc

public class JDBC_Learning3 {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost;database=suman;username=sa;password=password;encrypt=true;trustServerCertificate=true;";
        String query = "CREATE TABLE javatable2(javaid int primary key Identity(1,1),javafield varchar(50))";
        try {
            Connection con = DriverManager.getConnection(url);
            if (con.isClosed()) {
                System.out.println("Connection is closed");
            } else {
                System.out.println("Connection is being made");
                Statement stmt = con.createStatement();
                stmt.executeUpdate(query);
                System.out.println("Table created sucessfully");
                con.close();
            }
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    }


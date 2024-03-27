import java.sql.*;

public class JDBC_Learning1 {
    public static void main(String[] args)  {
        try {
//           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost;databaseName=suman;user=sa;password=password;encrypt=true;trustServerCertificate=true;";
           Connection con = DriverManager.getConnection(url);
            String query="select * from Room";
//            String query="insert into Room values ('NotOk',21)";
            Statement st= con.createStatement();
             ResultSet rs=st.executeQuery(query);
           while (rs.next()){
               System.out.print(rs.getString("RoomName"));
               System.out.print("   ");
               System.out.print(rs.getInt("RoomSize"));
               System.out.println();

           }
           con.close();
        } catch (Exception e){
System.err.println(e.getMessage());
        }

    }
}

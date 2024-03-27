import java.sql.*;

public class JDBC_Learning2 {
    public static void main(String[] args) throws SQLException {

        String query="select * from room";
        Connection con=JDBC_Learning0.getConn();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            System.out.print(resultSet.getInt("RoomId")+" ");
            System.out.print(resultSet.getString("RoomName")+" ");
            System.out.print(resultSet.getInt("RoomSize")+" ");
            System.out.println();
        }
        con.close();
    }
}

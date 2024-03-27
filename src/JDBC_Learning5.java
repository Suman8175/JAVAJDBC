import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBC_Learning5 {
    public static void main(String[] args) {
        String query="Update room set RoomName=? where RoomId=?";
        try( Connection con=JDBC_Learning0.getConn();
             PreparedStatement pmt=con.prepareStatement(query);){
            pmt.setString(1,"Jhola");
            pmt.setInt(2,4);
            pmt.executeUpdate();
            System.out.println("Done");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

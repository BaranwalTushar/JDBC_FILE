import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class updatejdbc {
    
    public static void main(String[] args) {
        try {
            Connection c = connectionprovider.getconnection();
            String q = "update table1 set tname=?,tcity=? where tid=?";

            BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter new name :");
            String name = b.readLine();

            System.out.println("Enter new city:");
            String city = b.readLine();

            System.out.println("Enter student id :");
            int id = Integer.parseInt(b.readLine());

            PreparedStatement pstmt = c.prepareStatement(q);
            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.setInt(3, id);

           pstmt.executeUpdate();
           System.out.println("Done....");

           c.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }


    }
    
}

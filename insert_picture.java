import java.sql.*;
import java.io.*;
public class insert_picture {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Tushar123@";
            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into images(pic) values(?)";
            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("C:\\Users\\tushar baranwal\\Desktop\\TUSHAR.jpg");
            pstmt.setBinaryStream(1, fis,fis.available());
            pstmt.executeUpdate();
            System.out.println("images inserted...");

        }
        catch(Exception e){
            System.out.println("Error shows...");
        }
    }
    
}

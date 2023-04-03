import java.sql.*;
import java.io.*;
public class insert_prepared_statement {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Tushar123@";

            Connection con = DriverManager.getConnection(url, username, password);

            String q = "insert into table1(tname,tcity) values (?,?)";
            //get the prepared statement object

            PreparedStatement pstmt = con.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name : ");
            String name = br.readLine();

            System.out.println("Enter the City : ");
            String city = br.readLine();


            //set the values to query
            
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.executeUpdate();

            System.out.println("Inserted Successfully");
            con.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

import java.sql.*;
public class insertjdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Tushar123@";

          Connection con = DriverManager.getConnection(url, username, password);
          
          String q = "create table table1(tid int(20) primary key auto_increment,tname varchar(255) not null,tcity varchar(255))";
          Statement stmt = con.createStatement();
          stmt.executeUpdate(q);
          System.out.println("table created in database..");
          con.close();
 
        }
        catch(Exception e){
            e.printStackTrace();

        }
        
        
    } 
}

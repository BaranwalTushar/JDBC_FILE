import java.sql.*;
public class createjdbc {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url ="jdbc:mysql://localhost:3306/office";
            //  String databasename = "My_DB";
            String username = "root";
            String password  = "Tushar123@";

            Connection con  = DriverManager.getConnection(url, username,password);

            if(con.isClosed()){
                System.out.println("Connection  is closed");
            }
            else{
                System.out.println("Connection created");
            }

        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
    
}

import java.sql.Connection;
import java.sql.DriverManager;

public class connectionprovider {
    private static Connection con;

    public static Connection getconnection(){
        try {
            if(con == null){
                Class.forName("com.mysql.cj.jdbc.Driver");

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "Tushar123@");

            }

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return con;
    }

    
}

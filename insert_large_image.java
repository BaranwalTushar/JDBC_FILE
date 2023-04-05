import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import com.mysql.cj.protocol.PacketSentTimeHolder;

public class insert_large_image {
    public static void main(String[] args) {
        try {
            Connection c = connectionprovider.getconnection();
            String q = "insert into images(pic) values(?)";
            PreparedStatement pstmt = c.prepareStatement(q);
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();

            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1, fis,fis.available());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "success");

            
        } catch (Exception e) {
            
        }
    }
}

  
    
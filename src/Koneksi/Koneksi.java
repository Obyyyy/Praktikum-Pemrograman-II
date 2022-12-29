
package Koneksi;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection connectionmysql;
    public static Connection koneksi_DB() throws SQLException{
        if(connectionmysql==null){
            try{
                String DB = "jdbc:mysql://localhost:3306/efm";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connectionmysql = (Connection) DriverManager.getConnection(DB, user, password);
//                JOptionPane.showMessageDialog(null, "Connection Success");
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Connection Failed");
            }
        }
        return connectionmysql;
    }
}

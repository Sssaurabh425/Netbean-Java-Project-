
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class databaseConnection {
    final static String JDBC_DRIVER="org.postgresql.Driver";
    final static String DB_URL="jdbc:postgresql://localhost:5432/student";
    final static String USER="postgres";
    final static String PASS="1234";
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            Connection conn=DriverManager.getConnection(DB_URL,USER, PASS);
            return conn;
        
        }
        catch(ClassNotFoundException | SQLException e)
        {JOptionPane.showMessageDialog(null,e);
        return null;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import java.sql.*;
/**
 *
 * @author acer
 */
public class ConnectionProvider {
    public static Connection getConn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            return conn;
        }
        catch(Exception e){
            return null;
        }
    }
}

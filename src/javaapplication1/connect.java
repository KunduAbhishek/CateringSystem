/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;

public class connect {
    
    public static Connection getConnection()
{
    Connection conn = null;
    try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","kundu");
            System.out.println("Successfully connected!");
            return conn;
                    
        }
        catch(Exception ex)
        {
            System.out.println("nc"+ex.getMessage());
            
        }
        return null;
        
        
    }
    public static void main(String[] args)
    {
        getConnection();
        
    }
}
    
    
    
    
    


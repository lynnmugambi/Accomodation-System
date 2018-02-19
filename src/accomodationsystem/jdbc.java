/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationsystem;

import java.sql.*;
import javax.swing.*;
//singleton pattern
class jdbc {
    
private static jdbc instance;
private static Connection conn = null;

    private jdbc() {
        
    }

public static jdbc getInstance(){
	{
		if (instance == null)
			instance = new jdbc();
        }
		return instance;
	}
 
public Connection sqlite(){
try{

    Class.forName("org.sqlite.JDBC");
    Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\db\\Accomodation");
    System.out.println("Connection Established");
    return conn;   
}

catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
}

return null;
}
}

/*public static void main(String args[])
{
    jdbc.sqlite();
}

}
*/

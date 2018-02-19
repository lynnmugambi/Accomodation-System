/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationsystem;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Mwendwa Mugambi
 */

//concrete base class
public class NormalMeter implements Meter {
    Connection conn ;
    PreparedStatement pst;
    ResultSet rs;

    public NormalMeter() {
         this.conn = jdbc.getInstance().sqlite();
    }
    
    
    
    @Override
    public void addMeter (int num,String name, String type){
        try {
            String sql = " Insert into Meters (MeterNum,Name,Type,eUsage,Cost,Status) values (?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, num);
            pst.setString(2, name);
            pst.setString(3, type);
            
            String initialstatus = "active";
            pst.setString(6,initialstatus);
            
            int init = 0;
            pst.setInt(4, init);
            pst.setInt(5, init);
            
            pst.execute();
            System.out.println("post-pay functions added");
            pst.close();
            JOptionPane.showMessageDialog(null, "Saved!");
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();

        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }

    }
    
   
}

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
//creates meter with extended functions

public class PrepayMeter extends MeterDecorator {
    Connection conn= jdbc.getInstance().sqlite();
    PreparedStatement pst;
    ResultSet rs;
    

    public PrepayMeter(Meter meterref) {
        super(meterref);
    }
    
    @Override
    public void addMeter(int num,String name, String type){
         super.addMeter(num,name,type);
         prepaid(num);
    }
    
    private void prepaid(int num){
        try {
            String sql = "Update Meters set Credit=? where MeterNum=?";
            pst = conn.prepareStatement(sql);

            int initial = 0;           
            pst.setInt(1,initial);
            
            pst.setInt(2, num);
            
            System.out.println("Pre-paid functions added");
            
            pst.execute();
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

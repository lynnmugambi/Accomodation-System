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
public class AccomodationSystem extends meter_values {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public AccomodationSystem() {
        this.conn = jdbc.getInstance().sqlite();
    }
    
    private String NameField;
    private String PasswordField;

   
    public String getNameField() {
        return NameField;
    }

    public void setNameField(String NameField) {
        this.NameField = NameField;
    }

    public String getPasswordField() {
        return PasswordField;
    }

    public void setPasswordField(String PasswordField) {
        this.PasswordField = PasswordField;
    }

    
      
     public void adminLogin(){
          
        try{
           
        String sql ="select * from AdminLogin where Username=? and Password=?";
        
        
        pst = conn.prepareStatement(sql);
        pst.setString(1,getNameField());
        pst.setString(2,getPasswordField());
     
        rs = pst.executeQuery();
        
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Login Succcessful");
            
            pst.close();
            new ManagementPanel().setVisible(true);
            new AdminLoginFrame().dispose();
            }
        else {
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "One of the fields is empty!");
            e.printStackTrace();
        } 
         finally{
                try{
                pst.close();
                
                }
                catch(Exception e ){
                }
                }
    }  
    

      public void tenantLogin(){
    String sql ="select * from TenantLogin where Username=? and Password=?";
        try{
        pst = conn.prepareStatement(sql);
        pst.setString(1,NameField);
        pst.setString(2,PasswordField);
     
        rs = pst.executeQuery();
        if(rs.next()){
            JOptionPane.showMessageDialog(null, "Login Succcessful");
            new TenantPanel().setVisible(true);
            new TenantLoginFrame().dispose();
            pst.close();
                
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         finally{
                try{
                pst.close();
                
                }
                catch(Exception e ){
                }
                }
    }
      
     
    //updates the cost to the database
    public void setcost(String metertype){
        
        if("Post-pay".equals(metertype)){
            try {
            String sql = "Update Meters set Cost = ? where MeterNum = ?";

            pst = conn.prepareStatement(sql);
            int metercost = postpaycost(elecusage);
            
            pst.setInt(1,metercost);
            pst.setInt(2, meternum);
            
            pst.executeUpdate();
            pst.close();

        } catch (SQLException | HeadlessException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
            
        }
        else{
            try {
            String sql = "Update Meters set Cost = ? where Meternum = ?";

            pst = conn.prepareStatement(sql);

            int metercost = prepaycost(elecusage);
            pst.setInt(1,metercost);
            pst.setInt(2,meternum);
            
            pst.execute();
            pst.close();

        } catch (SQLException | HeadlessException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
            
        }
        
    }
    
    //sets costs incurred for post-pay accounts to label from database
    public void getpostcost(){      
        try {
            String sql = "select Cost from Meters where MeterNum = ?";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, meternum);
            System.out.println("meter number");
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("meter found");

                setCost(rs.getInt("Cost"));
                System.out.println("cost found");
               
                pst.close();

            }
        } catch (SQLException err) {
            err.printStackTrace();
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
        
    }
    //sets balance for prepay acc.
        public void getprecost(int meternum,String metertype){
            try {
            int credit = getcredit(meternum);
            
            String sql = "select Cost from Meters where MeterNum = ?";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, meternum);
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("meter found");
                
               int icost = (rs.getInt("Cost"));
               System.out.println("cost found");
               
               int finalcost = (int)(credit - icost);
               
               setCost(finalcost);
               
               pst.close();

            }
        } catch (SQLException err) {
            err.printStackTrace();
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
            
        }
        
    
  //cost calculations
        
    public int postpaycost(int elecusage) {
        int e = elecusage - 200;
        if (elecusage > 200) {
            int cost = (int) (0.5 * e);
            return cost;
        }

        return 0;
    }

    public int prepaycost(int elecusage) {
        int cost = (int) (elecusage * 0.5);
        if (elecusage > 0) {
            return cost;
        }
        return 0;
    }

    //gets credit from db
    public int getcredit(int meternum) {

        try {

            String query = "select Credit from Meters where MeterNum = ?";

            pst = conn.prepareStatement(query);
            pst.setInt(1, meternum);

            rs = pst.executeQuery();

            while (rs.next()) {

                int credit = rs.getInt("Credit");
                System.out.println(credit);

                pst.close();
                return credit;
            }
        } catch (SQLException err) {
            err.printStackTrace();
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
        return 0;
    }
   
    public void suspend(int meternum) {

        try {
            String sql = "Update Meters set Status = 'Suspended' where MeterNum=?";

            pst = conn.prepareStatement(sql);

            pst.setInt(1, meternum);

            pst.executeUpdate();
            pst.close();

            JOptionPane.showMessageDialog(null, "Account Suspended! Please contact management office for enquiries and support!");
        } catch (SQLException | HeadlessException ex) {
            ex.printStackTrace();
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }

    }

   

}

    

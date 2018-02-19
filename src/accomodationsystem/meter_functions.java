/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationsystem;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.Timer;

/**
 *
 * @author Mwendwa Mugambi
 */
public class meter_functions extends meter_values {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    Timer timer;
    JTable table;

    public meter_functions() {
        this.conn = jdbc.getInstance().sqlite();
        //this.timer = new Timer(2000,new TimerListener());
        //timer.start();
    }

   //loads all meters and their values to the table as records
    
    public void viewallmeters(JTable metertable) {
        DefaultTableModel model = (DefaultTableModel) metertable.getModel();
        model.setRowCount(0);
        try {
            String sql = "Select * from Meters ";

            pst = conn.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next()) {

                metertable.setModel(model);

                model.addRow(new Object[]{
                    rs.getString("MeterNum"),
                    rs.getString("Name"),
                    rs.getString("Type"),
                    rs.getString("eUsage"),
                    rs.getString("Status")});

            }

            pst.execute();
            pst.close();

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Data not found!");
        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
    }
    
    //Loads meter values for a specific meter
    public void searchmeter(int meternum) {
        try {
            String sql = "select * from Meters where MeterNum = ?";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, meternum);
            
            rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("meter found");

                setMetername(rs.getString("Name"));
                System.out.println("name found");
                setMetertype(rs.getString("Type"));
                System.out.println("type found");
                setElecusage(rs.getInt("eUsage"));
                System.out.println("usage found");
                setStatus(rs.getString("Status"));
                System.out.println("status found");

                pst.close();

            }
        } catch (SQLException err) {
            err.printStackTrace();
        } catch (NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Meter Number Field is empty!");

        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }
    }

    //updates meter usage when changes are detected
    public void saveusage() {
        try {
            String sql = "Update Meters set eUsage =? where MeterNum = ?";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, elecusage);
            pst.setInt(2, meternum);

            pst.executeUpdate();
            pst.close();
            //System.out.println("saved");
            //JOptionPane.showMessageDialog(null, "Saved!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }

    }
    
    //updates any changes in  meter details to the db
    public void savemeter() {
        try {
            String sql = " Update Meters set Name=?,Type=?,eUsage=?,Status=? where MeterNum=?";
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, metername);
            pst.setString(2, metertype);
            pst.setInt(3, elecusage);
            pst.setString(4, status);
            pst.setInt(5, meternum);

            pst.executeUpdate();
            pst.close();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }

    }

    //loads meter values for credit loads
    public void loadmeter(int meternum) {
        try {
            String sql = "select * from Meters where MeterNum = ?";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, meternum);
            rs = pst.executeQuery();

            if (rs.next()) {

                setMetername(rs.getString("Name"));
                setMetertype(rs.getString("Type"));

                pst.execute();
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
    
    //saves credt to database
    public void saveload(int meternum) {
        try {
            if (!"Pre-pay".equals(metertype)) {
                JOptionPane.showMessageDialog(null, "This is not a Pre-pay account! Credit cannot be loaded!");
            } else {
                String sql = "Update Meters set Credit = ? where MeterNum =?";
                pst = conn.prepareStatement(sql);

                pst.setInt(1, credit);
                pst.setInt(2, meternum);

                pst.executeUpdate();
                pst.close();
                
                JOptionPane.showMessageDialog(null, "Saved!");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }

    }
    
    //saves new meter details to the database
    public void addmeter() {
        try {
            String sql = " Insert into Meters (MeterNum,Name,Type,Credit,Status) values (?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            
            pst.setInt(1, meternum);
            pst.setString(2, metername);
            pst.setString(3, metertype);
            
            String initialstatus = "active";
            pst.setString(5,initialstatus);
            
     
            if(metertype == "Pre-pay"){
                int initial = 0;
            
            pst.setInt(4,initial);
            }
           
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Saved!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        } finally {
            try {
                pst.close();

            } catch (Exception e) {
            }
        }

    }
   

}

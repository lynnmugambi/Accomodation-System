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

//concrete class for prepay state
public class PrePay extends meter_values implements TypeSwitch {

    Connection conn = jdbc.getInstance().sqlite();
    PreparedStatement pst;
    ResultSet rs;

    PrePay(int meternum) {
        this.meternum = meternum;
    }

    @Override
    public void switchtype(int meternum) {
        try {

            System.out.println("state is pre-pay... making post-pay");

            String sql = "Update Meters set Type = 'Post-pay' where MeterNum =?";
            pst = conn.prepareStatement(sql);

            pst.setInt(1, meternum);
            System.out.println(meternum);

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

}

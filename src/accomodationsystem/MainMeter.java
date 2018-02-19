/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accomodationsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mwendwa Mugambi
 */
public class MainMeter extends javax.swing.JFrame {

    meter_functions mf = new meter_functions();
    final JTable table;
    Timer timer;
    public int value;
    Mtype mt = new Mtype();
    TypeSwitch post;
    TypeSwitch pre;
    JLabel totallbl;
    

    /**
     * Creates new form MeterPanel
     */
    public MainMeter() {

        initComponents();
        table = metertable;
        this.timer = new Timer(3000, new TimerListener());
        timer.start();
        totallbl = totalusagelbl;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        metertable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        totalusagelbl = new javax.swing.JLabel();
        addmeterbtn = new javax.swing.JButton();
        stopbtn = new javax.swing.JButton();
        restartbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        meternumtxt = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();
        meternametxt = new javax.swing.JTextField();
        usagelbl = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        accstatus = new javax.swing.JLabel();
        metertypelbl = new javax.swing.JLabel();
        switchbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        meternumtxt1 = new javax.swing.JTextField();
        searchbtn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        preloadtxt = new javax.swing.JTextField();
        cancelbtn = new javax.swing.JButton();
        savebtn2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        typelbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        metertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meter No.", "Meter Name", "Meter Type", "Electricity Usage", "Account Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        metertable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                metertablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(metertable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 749, 156));

        jLabel12.setText("Total Electricity Usage:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 23));

        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, 23));
        jPanel1.add(totalusagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 116, 23));

        addmeterbtn.setText("Add Meter");
        addmeterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmeterbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addmeterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 110, -1));

        stopbtn.setText("Stop Meter");
        stopbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopbtnActionPerformed(evt);
            }
        });
        jPanel1.add(stopbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 23));

        restartbtn.setText("Restart Meter");
        restartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartbtnActionPerformed(evt);
            }
        });
        jPanel1.add(restartbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, 23));

        resetbtn.setText("Reset Meter");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });
        jPanel1.add(resetbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, -1, 23));

        jTabbedPane1.addTab("Main Meter", jPanel1);

        jLabel1.setText("Enter Meter Number :");

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Meter Name: ");

        jLabel3.setText("Meter Type:");

        jLabel4.setText("Electricity Usage:");

        savebtn.setText("Save Changes");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        meternametxt.setText(" ");

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Account Status:");

        metertypelbl.setText(" ");

        switchbtn.setText("Switch Type");
        switchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(meternumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(searchbtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(metertypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(switchbtn))
                            .addComponent(meternametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(savebtn)
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addGap(83, 83, 83))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(meternumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchbtn))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(meternametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(metertypelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(switchbtn))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(usagelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(accstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(savebtn)
                .addGap(9, 9, 9)
                .addComponent(backbtn)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Meter Settings", jPanel2);

        jLabel6.setText("Enter Meter Number :");

        searchbtn1.setText("Search");
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Meter Name: ");

        jLabel8.setText("Enter Amount to Preload:");

        preloadtxt.setEnabled(false);
        preloadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preloadtxtActionPerformed(evt);
            }
        });

        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        savebtn2.setText("Save");
        savebtn2.setEnabled(false);
        savebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtn2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Meter Type:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(typelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addComponent(meternumtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(preloadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cancelbtn)
                        .addGap(35, 35, 35)
                        .addComponent(savebtn2))
                    .addComponent(searchbtn1))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(meternumtxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn1))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(typelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelbtn)
                            .addComponent(savebtn2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(preloadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(106, 106, 106))
        );

        jTabbedPane1.addTab("Pre-load Meter", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:\
        mf.setMeternum(Integer.parseInt(meternumtxt.getText()));
        mf.setMetername(meternametxt.getText());
        mf.setMetertype(metertypelbl.getText());
        mf.setElecusage(Integer.parseInt(usagelbl.getText()));
        mf.setStatus(accstatus.getText());

        mf.savemeter();

    }//GEN-LAST:event_savebtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        mf.viewallmeters(table);
        setrandom();
        
        //Concrete Object method for TableModelListener interface
         //Observes Form and updates db values once changes are detected on the table

        table.getModel().addTableModelListener(new TableModelListener() {
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            @Override
            public void tableChanged(TableModelEvent e) {
                //System.out.println(e);

                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    int newusage = Integer.parseInt((String) model.getValueAt(i, 3));
                    mf.setElecusage(newusage);
                    mf.setMeternum(i + 1);

                    mf.saveusage();

                }
            }
        }
        );

    }//GEN-LAST:event_formWindowOpened

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        mf.searchmeter(Integer.parseInt(meternumtxt.getText()));

        meternametxt.setText(mf.getMetername());
        metertypelbl.setText(mf.getMetertype());
        usagelbl.setText(Integer.toString(mf.getElecusage()));
        accstatus.setText(mf.getStatus());

    }//GEN-LAST:event_searchbtnActionPerformed

    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed
        // TODO add your handling code here:
        mf.loadmeter(Integer.parseInt(meternumtxt1.getText()));
        namelbl.setText(mf.getMetername());
        typelbl.setText(mf.getMetertype());

        if ((typelbl.getText()).equals("Pre-pay")) {

            preloadtxt.setEnabled(true);
            savebtn2.setEnabled(true);

        }
    }//GEN-LAST:event_searchbtn1ActionPerformed

    private void savebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtn2ActionPerformed
        // TODO add your handling code here:
        mf.setMetertype(typelbl.getText());
        mf.setCredit(Integer.parseInt(preloadtxt.getText()));
        mf.saveload(Integer.parseInt(meternumtxt1.getText()));

    }//GEN-LAST:event_savebtn2ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:

        new MainMeter().setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        new ManagementPanel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        new MainMeter().setVisible(true);
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void metertablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_metertablePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_metertablePropertyChange

    private void switchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchbtnActionPerformed
        // TODO add your handling code here:
        this.post = new PostPay(Integer.parseInt(meternumtxt.getText()));
        this.pre = new PrePay(Integer.parseInt(meternumtxt.getText()));

        if ("Post-pay".equals(metertypelbl.getText())) {
            System.out.println(Integer.parseInt(meternumtxt.getText()));
            mt.setState(post);
            mt.switchtype(Integer.parseInt(meternumtxt.getText()));
            

        } else {
            System.out.println(Integer.parseInt(meternumtxt.getText()));
            mt.setState(pre);
            mt.switchtype(Integer.parseInt(meternumtxt.getText()));

        }

    }//GEN-LAST:event_switchbtnActionPerformed

    private void preloadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preloadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preloadtxtActionPerformed

    private void addmeterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmeterbtnActionPerformed
        // TODO add your handling code here:
        new AddMeter().setVisible(true);
    }//GEN-LAST:event_addmeterbtnActionPerformed

    private void stopbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopbtnActionPerformed
        // TODO add your handling code here:
        timer.stop();

    }//GEN-LAST:event_stopbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();

        String newvalue = Integer.toString(0);

        model.setValueAt(newvalue, row, 3);
    }//GEN-LAST:event_resetbtnActionPerformed

    private void restartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartbtnActionPerformed
        // TODO add your handling code here:
        timer.restart();
    }//GEN-LAST:event_restartbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMeter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMeter().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accstatus;
    private javax.swing.JButton addmeterbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cancelbtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField meternametxt;
    private javax.swing.JTextField meternumtxt;
    private javax.swing.JTextField meternumtxt1;
    private javax.swing.JTable metertable;
    private javax.swing.JLabel metertypelbl;
    private javax.swing.JLabel namelbl;
    private javax.swing.JTextField preloadtxt;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton restartbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton savebtn2;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton searchbtn1;
    private javax.swing.JButton stopbtn;
    private javax.swing.JButton switchbtn;
    private javax.swing.JLabel totalusagelbl;
    private javax.swing.JLabel typelbl;
    private javax.swing.JLabel usagelbl;
    // End of variables declaration//GEN-END:variables

    public void setrandom() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int totalmeter = 0;
        for (int x = model.getRowCount() - 1; x >= 0; x--) {
            Random rand = new Random();
            value = rand.nextInt(100);
            String ivalue = Integer.toString(value);

            model.setValueAt(ivalue, x, 3);
        }

    }
    //concrete Observer class that implements from interface ActionListener.
    //Observes Form and updates column values every 3 milliseconds
    private class TimerListener implements ActionListener {

        int totalmeter = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                int ival = (Integer.parseInt((String) model.getValueAt(i, 3)));
                int newvalue = 5 + ival;
                String ivalue = Integer.toString(newvalue);
                model.setValueAt(ivalue, i, 3);

                int amount = Integer.parseInt(model.getValueAt(i, 3) + "");
                totalmeter += amount;

            }
            totallbl.setText(Integer.toString(totalmeter));

        }
    }

    
    
}
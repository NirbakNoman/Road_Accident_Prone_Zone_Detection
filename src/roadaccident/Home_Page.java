
package roadaccident;

import java.awt.Color;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;

/**
 *
 * @author Noman
 */
public class Home_Page extends javax.swing.JFrame {

   ArrayList list;
    public Home_Page() throws InterruptedException {
   initComponents();
   setTitle("Black Spots of Bangladesh");
       
       getContentPane().setBackground(new Color(255,255,255));
                   Accident_Prone_Zone1 zones = new Accident_Prone_Zone1("location_name"); 
                 list = new ArrayList(zones.getData().keySet());        
            //AutoCompleteDecorator.decorate(tx1, list, false);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
     
     
    
    
   /*  
     JTable table=new JTable(sortedMap.size(),2);
            int row=0;
      for(Map.Entry<String,Integer> entry: map.entrySet())
 {
      table.setValueAt(entry.getKey(),row,0);
      table.setValueAt(entry.getValue(),row,1);
      row++;
 }
 
 */
     
     
        

     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sta_bt = new javax.swing.JButton();
        a_p_z_b = new javax.swing.JButton();
        p_v_b = new javax.swing.JButton();
        s_p_m_b = new javax.swing.JButton();
        bt_apm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(800, 697));

        sta_bt.setBackground(new java.awt.Color(255, 255, 153));
        sta_bt.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        sta_bt.setForeground(new java.awt.Color(0, 102, 102));
        sta_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/123.jpg"))); // NOI18N
        sta_bt.setMaximumSize(new java.awt.Dimension(235, 211));
        sta_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sta_btActionPerformed(evt);
            }
        });

        a_p_z_b.setBackground(new java.awt.Color(255, 255, 204));
        a_p_z_b.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        a_p_z_b.setForeground(new java.awt.Color(0, 204, 102));
        a_p_z_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/0.png"))); // NOI18N
        a_p_z_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_p_z_bActionPerformed(evt);
            }
        });

        p_v_b.setBackground(new java.awt.Color(204, 255, 204));
        p_v_b.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        p_v_b.setForeground(new java.awt.Color(255, 51, 102));
        p_v_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/1234_2.jpg"))); // NOI18N
        p_v_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_v_bActionPerformed(evt);
            }
        });

        s_p_m_b.setBackground(new java.awt.Color(255, 255, 255));
        s_p_m_b.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        s_p_m_b.setForeground(new java.awt.Color(102, 102, 255));
        s_p_m_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/121.png"))); // NOI18N
        s_p_m_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_p_m_bActionPerformed(evt);
            }
        });

        bt_apm.setBackground(new java.awt.Color(255, 204, 204));
        bt_apm.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bt_apm.setForeground(new java.awt.Color(0, 153, 153));
        bt_apm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/1_1.jpg"))); // NOI18N
        bt_apm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_apmActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("  Are You in Prone Zone?");

        tx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("Find");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s_p_m_b, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_v_b, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addComponent(sta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(41, 41, 41))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_apm, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a_p_z_b, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(a_p_z_b, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sta_bt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_apm)
                    .addComponent(p_v_b))
                .addGap(18, 18, 18)
                .addComponent(s_p_m_b)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a_p_z_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_p_z_bActionPerformed
        // TODO add your handling code here:
        
   Accident_Prone_Zone1 ap;
        try {
            ap = new Accident_Prone_Zone1("location_name");
             ap.showChart();
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Home_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        //ap.setVisible(true);
             //setVisible(true);
        
        
    
    
        
    }//GEN-LAST:event_a_p_z_bActionPerformed

    
     
    
    private void sta_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sta_btActionPerformed
        
        
        setVisible(false);
        S_info s=new S_info();
        s.setVisible(true);
        
        
        
    }//GEN-LAST:event_sta_btActionPerformed

    private void p_v_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_v_bActionPerformed
        // TODO add your handling code here:
        
          //setVisible(false);
        Accident_Prone_Vehicle1 ap=new Accident_Prone_Vehicle1();
       // ap.setVisible(true);

       
        
        
    }//GEN-LAST:event_p_v_bActionPerformed

    private void s_p_m_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_p_m_bActionPerformed
        // TODO add your handling code here:
        
         setVisible(false);
   Suggested_Preventive_Methods spm=new Suggested_Preventive_Methods();
        spm.setVisible(true);
        
    }//GEN-LAST:event_s_p_m_bActionPerformed

    private void bt_apmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_apmActionPerformed
        // TODO add your handling code here:
        GoogleMapsDemo g=new GoogleMapsDemo();
        
    }//GEN-LAST:event_bt_apmActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        Login l=new Login();
        l.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void tx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tx1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String text = tx1.getText();
        if(text.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Invalid locataion Name!!");
        }
        else
        {
            Iterator it = list.iterator();
            int count = 0;
            boolean elementFound = false, elementBlackZone = false;
            while(it.hasNext())
            {

                if(text.equals(it.next()) )
                {
                    if(count<5)
                    {
                        elementFound = true;
                        elementBlackZone =  true;
                        break;
                    }
                    else {
                        elementFound = true;
                        break;
                    }
                }
                else
                count++;

            }
            if(elementFound)
            {
                if(elementBlackZone)
                {
                    JOptionPane.showMessageDialog(null,text+" is Prone Zone Area! Please be Alert!");
                }
                else
                JOptionPane.showMessageDialog(null,"You are in Safe Zone! "+text+" is not a Prone Zone!");
            }
            else
            JOptionPane.showMessageDialog(null,"Sorry! Location "+text+" is not found!");
        }
        tx1.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home_Page().setVisible(true);
                    //setDefaultCloseOperation(EXIT_ON_CLOSE);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Home_Page.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
       
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a_p_z_b;
    private javax.swing.JButton bt_apm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton p_v_b;
    private javax.swing.JButton s_p_m_b;
    private javax.swing.JButton sta_bt;
    private javax.swing.JTextField tx1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import com.sun.org.apache.xpath.internal.operations.String;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Noman
 */
public class S_info extends javax.swing.JFrame {

    /**
     * Creates new form S_info
     */
    public S_info() {
        initComponents();
          setTitle("Black Spots of Bangladesh");
         getContentPane().setBackground(new Color(255,255,255));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        y_b = new javax.swing.JButton();
        t_b = new javax.swing.JButton();
        v_b = new javax.swing.JButton();
        p_v = new javax.swing.JButton();
        bt_season = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        y_b.setBackground(new java.awt.Color(255, 255, 255));
        y_b.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        y_b.setForeground(new java.awt.Color(51, 153, 255));
        y_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/2_3.png"))); // NOI18N
        y_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                y_bActionPerformed(evt);
            }
        });

        t_b.setBackground(new java.awt.Color(255, 255, 255));
        t_b.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        t_b.setForeground(new java.awt.Color(51, 153, 255));
        t_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/5_5.jpg"))); // NOI18N
        t_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_bActionPerformed(evt);
            }
        });

        v_b.setBackground(new java.awt.Color(255, 255, 255));
        v_b.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        v_b.setForeground(new java.awt.Color(51, 153, 255));
        v_b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/1_5.jpg"))); // NOI18N
        v_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_bActionPerformed(evt);
            }
        });

        p_v.setBackground(new java.awt.Color(255, 255, 255));
        p_v.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        p_v.setForeground(new java.awt.Color(51, 153, 255));
        p_v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/4_1.jpg"))); // NOI18N
        p_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_vActionPerformed(evt);
            }
        });

        bt_season.setBackground(new java.awt.Color(255, 255, 255));
        bt_season.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roadaccident/6_2.jpg"))); // NOI18N
        bt_season.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seasonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText(" Statistical Information");

        jMenu2.setText("File");

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Detail");

        jMenuItem1.setText("vehicle");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(y_b, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(t_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_v, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                            .addComponent(v_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_season, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(v_b, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(p_v, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(bt_season, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_bActionPerformed
        // TODO add your handling code here:
      setVisible(true);
        LineChart_Time s=new LineChart_Time("Black Spots Of Bangladesh");
         s.pack();
        RefineryUtilities.centerFrameOnScreen(s);
        s.setVisible(true);
        
       
    }//GEN-LAST:event_t_bActionPerformed

    private void y_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_y_bActionPerformed
        // TODO add your handling code here:
        setVisible(true);
        
//        Year_Table y=new Year_Table();
//        y.setVisible(true);
      CreateBar cc = new CreateBar("Statistical Information Of Road Accident", "Road Accident");
       cc.pack();
       //setDefaultCloseOperation(ApplicationFrame.DISPOSE_ON_CLOSE);
       RefineryUtilities.centerFrameOnScreen(cc);
       cc.setVisible(true);
    }//GEN-LAST:event_y_bActionPerformed

    private void p_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_vActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        S_info_place_table sp=new S_info_place_table();
        sp.setVisible(true);
        
    }//GEN-LAST:event_p_vActionPerformed

    private void v_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v_bActionPerformed
        // TODO add your handling code here:
        
        setVisible(true);
        LineChart_Vehicle demo = new LineChart_Vehicle("Black Spots of Bangladesh");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        
    }//GEN-LAST:event_v_bActionPerformed

    private void bt_seasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seasonActionPerformed
        // TODO add your handling code here:
        
        setVisible(true);
        LineChart_Season demo = new LineChart_Season("Black Spots of Bangladesh");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        
    }//GEN-LAST:event_bt_seasonActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        S_info_vehicle_table v=new S_info_vehicle_table();
        v.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
      setVisible(false);
        Home_Page h;
        try {
            h = new Home_Page();
             h.setVisible(true);
        } catch (InterruptedException ex) {
            Logger.getLogger(S_info.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(S_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S_info().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_season;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton p_v;
    private javax.swing.JButton t_b;
    private javax.swing.JButton v_b;
    private javax.swing.JButton y_b;
    // End of variables declaration//GEN-END:variables
}
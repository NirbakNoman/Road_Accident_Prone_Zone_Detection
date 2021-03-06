/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package roadaccident;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Noman
 */
public class S_info_vehicle_table extends javax.swing.JFrame {

    /**
     * Creates new form S_info_vehicle_table
     */
    public S_info_vehicle_table() {
        initComponents();
        setTitle("Black Spots of Bangladesh");
        
        
        
        int i;
        int start_year=2007;
        Calendar now = Calendar.getInstance();   
         int current_year = now.get(Calendar.YEAR);
         
         
        
        try{
            
        String url="jdbc:mysql://localhost:3306/road_accident";
        String user="root";
        String pass="";
        
        Connection conn=(Connection)DriverManager.getConnection(url, user, pass);
        
        
        DefaultTableModel model=(DefaultTableModel)s_info_vehicle_table.getModel();
        
        
        
        
        String query="Select count(type_id) as total_vehicle  from  vehicle_type";
        PreparedStatement prepareStm=conn.prepareStatement(query);
        prepareStm.execute();
        ResultSet rs2=prepareStm.getResultSet();
        int no_of_vehicle = 0;
        
        while(rs2.next())
        {
            no_of_vehicle = rs2.getInt("total_vehicle");
        
        }
        
        
        
         for(int j = 1; j<=no_of_vehicle;j++ )
        
        for(i=start_year;i<current_year;i++)
             {
                 
        String query1="Select a.vehicle_name , count(b.accident_no) as total_accident from vehicle_type a left join  accident b on a.type_id=b.type_id  where b.type_id='"+j+"' and date like'"+i+"%'";
        
        
            prepareStm=conn.prepareStatement(query1);
           prepareStm.execute();
           rs2=prepareStm.getResultSet();
           
        
            while(rs2.next())
                {
                    model.addRow(new Object[]{i,rs2.getString("a.vehicle_name"),rs2.getString("total_accident")});
        
                }
        
           }
        }
        
        
        
        
        
        
        catch(SQLException |HeadlessException e)
        {
        System.out.println(e);
        }
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        s_info_vehicle_table = new javax.swing.JTable();
        back_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        s_info_vehicle_table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        s_info_vehicle_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Year", "Vehicle Name", "Number Of Total  Accident"
            }
        ));
        jScrollPane1.setViewportView(s_info_vehicle_table);

        back_b.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_b.setText("Back");
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(back_b)
                .addGap(0, 437, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        S_info s=new S_info();
        s.setVisible(true);
        
        
    }//GEN-LAST:event_back_bActionPerformed

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
            java.util.logging.Logger.getLogger(S_info_vehicle_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_info_vehicle_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_info_vehicle_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_info_vehicle_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S_info_vehicle_table().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_b;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable s_info_vehicle_table;
    // End of variables declaration//GEN-END:variables
}

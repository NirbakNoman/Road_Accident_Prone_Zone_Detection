package roadaccident;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Location extends javax.swing.JFrame {

    public Location() {
        initComponents();
        setTitle("Black Spots of Bangladesh");
        //getContentPane().setBackground(new Color(204, 204, 255));
        getContentPane().setBackground(new Color(255, 255, 255));
        Fillcombo();
    }

    private void Fillcombo() {
        try {
            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String pass = "";


            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
            String query = "select * from location";
            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.execute();
            ResultSet rs1 = preparedStmt.getResultSet();



            while (rs1.next()) {
                String l_name = rs1.getString("location_name");
                l_com1.addItem(l_name);
                l_com2.addItem(l_name);

            }




            conn.close();
        } catch (SQLException | HeadlessException e) {
            System.out.println(e);
        }
    }

    /*private void Fillcombo()
     {
     try
     {
    
     String url="jdbc:mysql://localhost:3306/road_accident";
     String username="root";
     String password="";
    
     Connection conn=(Connection)DriverManager.getConnection(url, url, password);
    
     String query="select * from location";
     PreparedStatement preparedStm=conn.prepareStatement(query);
     preparedStm.execute();
     ResultSet rs=preparedStm.getResultSet();
    
     while(rs.next())
     {
     String l_name=rs.getString("location_name");
     l_com1.addItem(l_name);
     l_com2.addItem(l_name);
    
     }
    
    
     conn.close();
    
     }
     catch(SQLException|HeadlessException e)
     {
     System.out.println();
    
     }
    
    
     }
    
    
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        l_bt7 = new javax.swing.JButton();
        l_bt8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        l_bt1 = new javax.swing.JButton();
        l_tx2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l_tx3 = new javax.swing.JTextField();
        l_tx4 = new javax.swing.JTextField();
        l_bt2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        l_tx1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        l_bt3 = new javax.swing.JButton();
        l_com1 = new javax.swing.JComboBox();
        l_bt4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        l_bt5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        l_bt6 = new javax.swing.JButton();
        l_com2 = new javax.swing.JComboBox();
        l_tx5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TABLE NAME : LOCATION");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("For Information Removing");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("For Information Updating");

        l_bt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt7.setText("Back");
        l_bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt7ActionPerformed(evt);
            }
        });

        l_bt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt8.setText("Back To Main Page");
        l_bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt8ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        l_bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt1.setText("STORE");
        l_bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt1ActionPerformed(evt);
            }
        });

        l_tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_tx2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Lon");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Location Id");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Location Name");

        l_bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt2.setText("VIEW DATA");
        l_bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Lat");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_tx3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_tx4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(l_bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_bt2)))
                .addGap(131, 131, 131))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(l_tx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l_tx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(l_tx3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(l_tx4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_bt1)
                    .addComponent(l_bt2))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Select Location Name");

        l_bt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt3.setText("REMOVE");
        l_bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt3ActionPerformed(evt);
            }
        });

        l_com1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_com1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Location" }));

        l_bt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt4.setText("VIEW DATA");
        l_bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_com1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_bt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(128, 128, 128))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(l_com1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_bt3)
                    .addComponent(l_bt4))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("New Location Name");

        l_bt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt5.setText("UPDATE");
        l_bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Select Location Name");

        l_bt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bt6.setText("VIEW DATA");
        l_bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l_bt6ActionPerformed(evt);
            }
        });

        l_com2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_com2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Location" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_com2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_tx5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(l_bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_bt6, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(l_com2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(l_tx5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_bt5)
                    .addComponent(l_bt6))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("For Information Storing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l_bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(142, 142, 142)
                                    .addComponent(l_bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_bt8)
                    .addComponent(l_bt7))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l_tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l_tx2ActionPerformed

    private void l_bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt1ActionPerformed
        // TODO add your handling code here:
        String l_str1, l_str2, l_str3, l_str4;

        l_str1 = l_tx1.getText();
        l_str2 = l_tx2.getText();
        l_str3 = l_tx3.getText();
        l_str4 = l_tx4.getText();


        try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password);
            String query = "insert into location(location_id,location_name,lat,lon)" + "values('" + l_str1 + "','" + l_str2 + "', '" + l_str3 + "','" + l_str4 + "')";
            PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();


            l_tx1.setText("");
            l_tx2.setText("");
            l_tx3.setText("");
            l_tx4.setText("");


            conn.close();

            //  Fillcombo();




        } catch (SQLException | HeadlessException e) {

            System.out.println("" + e);
        }



    }//GEN-LAST:event_l_bt1ActionPerformed

    private void l_bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt3ActionPerformed
        // TODO add your handling code here:
        // Fillcombo();
        int d = JOptionPane.showConfirmDialog(null, "Do You Really Want To Remove This Item ", "Remove", JOptionPane.YES_NO_OPTION);

        if (d == 0) {
            try {

                String lo_name = l_com1.getSelectedItem().toString();
                String url = "jdbc:mysql://localhost:3306/road_accident";
                String user = "root";
                String password = "";
                Connection conn = (Connection) DriverManager.getConnection(url, user, password);
                String query = " delete from location where location_name='" + lo_name + "' ";
                PreparedStatement preparedStm = conn.prepareStatement(query);
                preparedStm.execute();
                l_com1.setSelectedIndex(0);

                //Fillcombo();
                conn.close();





            } catch (SQLException | HeadlessException e) {

                System.out.println("" + e);
            }
        }


    }//GEN-LAST:event_l_bt3ActionPerformed

    private void l_bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt5ActionPerformed
        // TODO add your handling code here:

        String l_str5, l_str6;
        l_str5 = l_tx5.getText();
        l_str6 = l_com2.getSelectedItem().toString();

        try {

            String url = "jdbc:mysql://localhost:3306/road_accident";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password);
            String query = "update location set location_name='" + l_str5 + "' where location_name='" + l_str6 + "'";
            PreparedStatement preparedStm = conn.prepareStatement(query);
            preparedStm.execute();

            l_tx5.setText("");
            l_com2.setSelectedIndex(0);

            conn.close();

        } catch (SQLException | HeadlessException e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_l_bt5ActionPerformed

    private void l_bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Admin1 a = new Admin1();
        a.setVisible(true);

    }//GEN-LAST:event_l_bt7ActionPerformed

    private void l_bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt8ActionPerformed
        // TODO add your handling code here:


        setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_l_bt8ActionPerformed

    private void l_bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt2ActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        Location_Table lt = new Location_Table();
        lt.setVisible(true);


    }//GEN-LAST:event_l_bt2ActionPerformed

    private void l_bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt4ActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        Location_Table lt = new Location_Table();
        lt.setVisible(true);


    }//GEN-LAST:event_l_bt4ActionPerformed

    private void l_bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l_bt6ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Location_Table lt = new Location_Table();
        lt.setVisible(true);



    }//GEN-LAST:event_l_bt6ActionPerformed

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
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Location.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Location().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JButton l_bt1;
    private javax.swing.JButton l_bt2;
    private javax.swing.JButton l_bt3;
    private javax.swing.JButton l_bt4;
    private javax.swing.JButton l_bt5;
    private javax.swing.JButton l_bt6;
    private javax.swing.JButton l_bt7;
    private javax.swing.JButton l_bt8;
    private javax.swing.JComboBox l_com1;
    private javax.swing.JComboBox l_com2;
    private javax.swing.JTextField l_tx1;
    private javax.swing.JTextField l_tx2;
    private javax.swing.JTextField l_tx3;
    private javax.swing.JTextField l_tx4;
    private javax.swing.JTextField l_tx5;
    // End of variables declaration//GEN-END:variables
}

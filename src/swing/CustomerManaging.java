package swing;

import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerManaging extends javax.swing.JFrame {

    public CustomerManaging() {
        initComponents();
        loadTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tableName = new javax.swing.JLabel();
        inputCustomer_Phone = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        inputAddress = new javax.swing.JTextField();
        inputCity = new javax.swing.JTextField();
        inputDateofBirth = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        labelCustomer_Phone = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelCity = new javax.swing.JLabel();
        labelDateofBirth = new javax.swing.JLabel();
        buttonFind = new javax.swing.JButton();
        inputCustomer_Finding_Phone = new javax.swing.JTextField();
        buttonRefresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableName.setText("Customer Managing");

        inputCustomer_Phone.setText("Enter Phone");
        inputCustomer_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCustomer_PhoneActionPerformed(evt);
            }
        });

        inputName.setText("Enter Name");

        inputAddress.setText("Enter Address");

        inputCity.setText("Enter City");

        inputDateofBirth.setText("Enter Date of Birth");
        inputDateofBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDateofBirthActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Delete");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Phone", "Name", "Address", "City", "Birth"
            }
        ));
        jScrollPane1.setViewportView(table);

        labelCustomer_Phone.setText("Customer Phone");

        labelName.setText("Name");

        labelAddress.setText("Address");

        labelCity.setText("City");

        labelDateofBirth.setText("Date of Birth");

        buttonFind.setText("Find");
        buttonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFindActionPerformed(evt);
            }
        });

        inputCustomer_Finding_Phone.setText("Input Customer Phone");
        inputCustomer_Finding_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCustomer_Finding_PhoneActionPerformed(evt);
            }
        });

        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        jButton1.setText("Not Customer?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputCustomer_Finding_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFind, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRefresh))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAdd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCustomer_Phone)
                                    .addComponent(labelName)
                                    .addComponent(labelAddress)
                                    .addComponent(labelCity)
                                    .addComponent(labelDateofBirth))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputCustomer_Phone)
                                    .addComponent(inputName)
                                    .addComponent(inputAddress)
                                    .addComponent(inputCity)
                                    .addComponent(inputDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(tableName)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tableName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCustomer_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustomer_Phone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDateofBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDateofBirth))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonEdit)
                    .addComponent(buttonDelete))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCustomer_Finding_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFind)
                    .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        
        if (!inputCustomer_Phone.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid Customer Phone. It should be numeric.");
            return;
        }

        if (!inputDateofBirth.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Invalid Date of Birth. Use the format YYYY-MM-DD.");
            return;
        }
        
        if ("Doesn't have to be filled in".equals(inputCustomer_Phone.getText())) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Customer Phone");
            model.addColumn("Name");
            model.addColumn("Address");
            model.addColumn("City");
            model.addColumn("Date of Birth");
            
            try {
                int add = 1;
                String sql = "select CUSTOMER_PHONE from customer order by CUSTOMER_PHONE desc limit 1;";            
                java.sql.Connection conn = (Connection) connectionDB.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    add = Integer.parseInt(res.getString(1)) + 1;
                }
                sql = "INSERT INTO customer VALUES ('" + add + "','" + inputName.getText() + "','" + inputAddress.getText() + "','" + inputCity.getText() + "','" + inputDateofBirth.getText() + "')";
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data saving Successful");
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
                }
                table.setModel(model);                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());   
            }
            loadTable();
            clear();
        }else {
        
            try {
                String sql = "INSERT INTO customer VALUES ('" + inputCustomer_Phone.getText() + "','" + inputName.getText() + "','" + inputAddress.getText() + "','" + inputCity.getText() + "','" + inputDateofBirth.getText() + "')";
                java.sql.Connection conn = (Connection) connectionDB.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Saving Successful");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                }
            loadTable();
            clear();
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        
        if (!inputCustomer_Phone.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid Customer Phone. It should be numeric.");
            return;
        }

        if (!inputDateofBirth.getText().matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(this, "Invalid Date of Birth. Use the format YYYY-MM-DD.");
            return;
        }
        try {
            String sql ="UPDATE customer SET CUSTOMER_PHONE = '"+inputCustomer_Phone.getText()+"', NAME = '"+inputName.getText()+"', ADDRESS = '"+inputAddress.getText()+"', CITY = '"+inputCity.getText()+"', DATEOFBIRTH= '"+inputDateofBirth.getText()+"' WHERE CUSTOMER_PHONE = '"+inputCustomer_Phone.getText()+"'";
            java.sql.Connection conn=(Connection)connectionDB.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data edited successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Change Failed"+e.getMessage());
        }
        loadTable();
        clear();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="delete from customer where CUSTOMER_PHONE='"+ inputCustomer_Phone.getText()+"'";
            java.sql.Connection conn=(Connection)connectionDB.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "deleted successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        loadTable();
        clear();
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFindActionPerformed
        // TODO add your handling code here:
        try {
            int no = 1;
            String sql = "SELECT * FROM customer WHERE name LIKE '" + inputCustomer_Finding_Phone.getText() + "'";
            java.sql.Connection conn=(Connection)connectionDB.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "found");
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Customer Phone");
            model.addColumn("Name");
            model.addColumn("Address");
            model.addColumn("City");
            model.addColumn("Date of Birth");

            // display database data into a table
            try {
                sql = "SELECT * FROM customer WHERE name LIKE '" + inputCustomer_Finding_Phone.getText() + "'";
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});                    
                }

                table.setModel(model);
            } catch (Exception e) {
                System.out.println(e);   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            loadTable();
        }
        clear();
    }//GEN-LAST:event_buttonFindActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
        // TODO add your handling code here:
        loadTable();
        clear();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void inputCustomer_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCustomer_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCustomer_PhoneActionPerformed

    private void inputCustomer_Finding_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCustomer_Finding_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCustomer_Finding_PhoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AdminLogin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputDateofBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDateofBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDateofBirthActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerManaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManaging.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerManaging().setVisible(true);
            }
        });
    }
    
    private void clear() {
        inputCustomer_Phone.setText("Enter Phone");
        inputName.setText("Enter Name");
        inputAddress.setText("Enter Address");
        inputCity.setText("Enter City");
        inputDateofBirth.setText("Enter Date of Birth");
        inputCustomer_Finding_Phone.setText("Find Phone");
    }
    
    public void loadTable() {
        // create a table model view
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Customer Phone");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("City");
        model.addColumn("Date of Birth");

        // display database data into a table
        try {
            int no = 1;
            String sql = "select * from customer";
            java.sql.Connection conn = (Connection) connectionDB.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
            }
            table.setModel(model);
        } catch (Exception e) {
            System.out.println(e);   
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonFind;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JTextField inputAddress;
    private javax.swing.JTextField inputCity;
    private javax.swing.JTextField inputCustomer_Finding_Phone;
    private javax.swing.JTextField inputCustomer_Phone;
    private javax.swing.JTextField inputDateofBirth;
    private javax.swing.JTextField inputName;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelCity;
    private javax.swing.JLabel labelCustomer_Phone;
    private javax.swing.JLabel labelDateofBirth;
    private javax.swing.JLabel labelName;
    private javax.swing.JTable table;
    private javax.swing.JLabel tableName;
    // End of variables declaration//GEN-END:variables
}

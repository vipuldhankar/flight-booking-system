import com.mysql.cj.xdevapi.Result;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class addcustomer extends javax.swing.JInternalFrame {

    /**  
     * Creates new form addcustomer
     */
    public addcustomer() {
        initComponents();
        autoID();
    }
    Connection con;
    PreparedStatement pst;


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPassportID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtCountry = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtFirstName1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtDOB = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        txtid = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        txtFirstName1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Passport ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("D.O.B");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Country");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Gender");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Contact");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addComponent(txtFirstName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtFirstName)
                        .addComponent(txtLastName)
                        .addComponent(txtPassportID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtFirstName1))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel10))
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(txtPassportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(jLabel9))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Customer ID ");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("CANCEL");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 102, 102));
        txtid.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(63, 63, 63)
                .addComponent(jToggleButton1)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)
                        .addComponent(txtid))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jToggleButton1))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    
    public void autoID(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
           
            java.sql.Statement s= con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(id) from customer");
            rs.next();
            rs.getString("MAX(id)");
            if(rs.getString("MAX(id)") == null){
                txtid.setText("CS001");
                
            }
            else {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
                id++;
                 txtid.setText("CS"+ String.format("%03d",id) );
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
      
  }
    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        String id=txtid.getText();
        String FirstName=txtFirstName.getText();
        String LastName= txtLastName.getText();
        String PassportID=txtPassportID.getText();
        String Country=txtCountry.getText();
        String Address=txtAddress.getText();
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String DOB= da.format(txtDOB.getDate());
        String Gender= txtGender.getText();
        String Contact=txtContact.getText();
     

        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
          pst =con.prepareStatement("insert into customer(id,FirstName,LastName,PassportID,Address,DOB,Country,Gender,Contact)values(?,?,?,?,?,?,?,?,?)");
        pst.setString(1,id);
        pst.setString(2, FirstName);
        pst.setString(3,LastName);
        pst.setString(4,PassportID);
       pst.setString(5,Address);
        pst.setString(6,DOB);
        pst.setString(7,Country);
        pst.setString(8,Gender);
        pst.setString(9,Contact);
        
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null,"Registration Created........");
 
} catch (ClassNotFoundException | SQLException ex) {
    Logger.getLogger(addcustomer.class.getName()).log(Level.SEVERE, null, ex);
} 

       
                
      
           
                         
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCountry;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JLabel txtFirstName1;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPassportID;
    private javax.swing.JLabel txtid;
    // End of variables declaration//GEN-END:variables
}
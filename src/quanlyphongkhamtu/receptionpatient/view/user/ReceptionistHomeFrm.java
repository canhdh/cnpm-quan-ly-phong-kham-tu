/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.view.user;


import javax.swing.JButton;
import javax.swing.JOptionPane;
import quanlyphongkhamtu.receptionpatient.model.User;
import quanlyphongkhamtu.receptionpatient.view.receptionist.PatientReceptionFrm;
/**
 *
 * @author tminh
 */
public class ReceptionistHomeFrm extends javax.swing.JFrame {
    
    private User user;

    /**
     * Creates new form ReceptionistHomeFrm
     */
    public ReceptionistHomeFrm(User user) {
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnReceptionistHome = new javax.swing.JPanel();
        lblReceptionistHomeName = new javax.swing.JLabel();
        btnReceptPatient = new javax.swing.JButton();
        btnMakePayment = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 60));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(480, 340));

        pnReceptionistHome.setPreferredSize(new java.awt.Dimension(480, 300));

        lblReceptionistHomeName.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblReceptionistHomeName.setText("Nhân viên lễ tân");

        btnReceptPatient.setText("Tiếp nhận bệnh nhân");
        btnReceptPatient.setPreferredSize(new java.awt.Dimension(145, 36));
        btnReceptPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceptPatientActionPerformed(evt);
            }
        });

        btnMakePayment.setText("Thanh toán cho bệnh nhân");
        btnMakePayment.setPreferredSize(new java.awt.Dimension(175, 36));
        btnMakePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymentActionPerformed(evt);
            }
        });

        btnLogout.setText("Đăng xuất");
        btnLogout.setPreferredSize(new java.awt.Dimension(83, 36));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblUserName.setText("Name");
        lblUserName.setText(user.getFullName());

        lblUsername.setText("Username");
        lblUsername.setText(user.getUsername());

        javax.swing.GroupLayout pnReceptionistHomeLayout = new javax.swing.GroupLayout(pnReceptionistHome);
        pnReceptionistHome.setLayout(pnReceptionistHomeLayout);
        pnReceptionistHomeLayout.setHorizontalGroup(
            pnReceptionistHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnReceptionistHomeLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(pnReceptionistHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReceptPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnReceptionistHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMakePayment, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(pnReceptionistHomeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblReceptionistHomeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnReceptionistHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(36, 36, 36))
        );
        pnReceptionistHomeLayout.setVerticalGroup(
            pnReceptionistHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnReceptionistHomeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnReceptionistHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnReceptionistHomeLayout.createSequentialGroup()
                        .addComponent(lblReceptionistHomeName)
                        .addGap(57, 57, 57)
                        .addComponent(btnReceptPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMakePayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnReceptionistHomeLayout.createSequentialGroup()
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnReceptionistHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnReceptionistHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMakePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymentActionPerformed
        // TODO add your handling code here:
        if ((evt.getSource() instanceof JButton) && (((JButton)evt.getSource()).equals(btnMakePayment))) {
            JOptionPane.showMessageDialog(this, "This function is under construction!",
                    "Cảnh báo", JOptionPane.WARNING_MESSAGE);
//            (new SearchPatientFrm(user)).setVisible(true);
//            this.dispose();
        }
    }//GEN-LAST:event_btnMakePaymentActionPerformed

    private void btnReceptPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceptPatientActionPerformed
        // TODO add your handling code here:
        if ((evt.getSource() instanceof JButton) && (((JButton)evt.getSource()).equals(btnReceptPatient))) {
            (new PatientReceptionFrm(user)).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnReceptPatientActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        if ((evt.getSource() instanceof JButton) && (((JButton)evt.getSource()).equals(btnLogout))) {
            (new LoginFrm()).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionistHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistHomeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMakePayment;
    private javax.swing.JButton btnReceptPatient;
    private javax.swing.JLabel lblReceptionistHomeName;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnReceptionistHome;
    // End of variables declaration//GEN-END:variables
}

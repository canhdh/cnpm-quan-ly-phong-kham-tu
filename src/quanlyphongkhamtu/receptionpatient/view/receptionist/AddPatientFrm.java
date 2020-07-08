/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyphongkhamtu.receptionpatient.view.receptionist;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import quanlyphongkhamtu.receptionpatient.dao.PatientDAO;
import quanlyphongkhamtu.receptionpatient.model.Patient;
import quanlyphongkhamtu.receptionpatient.model.User;
import quanlyphongkhamtu.receptionpatient.view.user.ReceptionistHomeFrm;

/**
 *
 * @author Dang Huu Canh
 */
public class AddPatientFrm extends javax.swing.JFrame {

    private User user;
    
    /**
     * Creates new form AddPatientFrm
     */
    public AddPatientFrm(User user) {
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

        jPanel1 = new javax.swing.JPanel();
        lblAddPatient = new javax.swing.JLabel();
        lblUserFullName = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblFullName = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtCitizenId = new javax.swing.JTextField();
        lblCitizenId = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm bệnh nhân mới");
        setLocation(new java.awt.Point(100, 60));

        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 500));

        lblAddPatient.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lblAddPatient.setText("Đăng ký thông tin cho bệnh nhân mới");

        lblUserFullName.setText("Name");
        lblUserFullName.setText(this.user.getName());

        lblUsername.setText("Username");
        lblUsername.setText(this.user.getUsername());

        txtname.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtname.setPreferredSize(new java.awt.Dimension(240, 36));

        lblFullName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblFullName.setText("Tên bệnh nhân:");

        txtAge.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtAge.setPreferredSize(new java.awt.Dimension(240, 36));

        lblAge.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblAge.setText("Tuổi:");

        txtAddress.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtAddress.setPreferredSize(new java.awt.Dimension(240, 36));

        lblAddress.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblAddress.setText("Địa chỉ:");

        txtCitizenId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtCitizenId.setPreferredSize(new java.awt.Dimension(240, 36));

        lblCitizenId.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblCitizenId.setText("Số CCCD:");

        txtPhone.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPhone.setPreferredSize(new java.awt.Dimension(240, 36));

        lblPhone.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblPhone.setText("Số điện thoại");

        btnAdd.setText("Thêm mới");
        btnAdd.setPreferredSize(new java.awt.Dimension(100, 36));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnBack.setText("Quay lại");
        btnBack.setPreferredSize(new java.awt.Dimension(100, 36));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(336, 336, 336))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblAddress)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblAge)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblFullName)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(72, 72, 72)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPhone)
                                .addComponent(lblCitizenId))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(txtCitizenId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblAddPatient)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUserFullName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAddPatient))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUserFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername)))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName)
                    .addComponent(txtCitizenId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCitizenId))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addGap(36, 36, 36)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        if ((evt.getSource() instanceof JButton) && (((JButton) evt.getSource()).equals(btnBack))) {
            (new PatientReceptionFrm(user)).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        JButton btnClicked = (JButton) evt.getSource();
        if (btnClicked.equals(btnAdd)) {
            Patient patient = new Patient();
            boolean validate = true;
            String message = "";
            if (txtname.getText() == null || txtname.getText().length() == 0) {
                message = message + "\nThiếu thông tin tên bệnh nhân!";
                validate = false;
            } else {
                patient.setName(txtname.getText());
                validate = true;
            }
            if (txtAge.getText() == null || txtAge.getText().length() == 0) {
                message = message + "\nThiếu thông tin tuổi!";
                validate = false;
            } else {
                patient.setAge(Integer.parseInt(txtAge.getText()));
                validate = true;
            }
            if (txtAddress.getText() == null || txtAddress.getText().length() == 0) {
                message = message + "\nThiếu thông tin địa chỉ!";
                validate = false;
            } else {
                patient.setAddress(txtAddress.getText());
                validate = true;
            }
            if (txtCitizenId.getText() != null && txtCitizenId.getText().length() == 0) {
                patient.setCitizenId(txtCitizenId.getText());
            }
            if (txtPhone.getText() == null || txtPhone.getText().length() == 0) {
                message = message + "\nThiếu thông tin số điện thoại!";
                validate = false;
            } else {
                patient.setPhone(txtPhone.getText());
                validate = true;
            }
            PatientDAO patientDAO = new PatientDAO();
            if (validate && patientDAO.addPatient(patient)) {
                JOptionPane.showMessageDialog(this, "Thêm bệnh nhân thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                (new ReceptionistHomeFrm(user)).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Thêm bệnh nhân không thành công!" + message,
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddPatient;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCitizenId;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblUserFullName;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCitizenId;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}

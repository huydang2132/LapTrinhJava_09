/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Utils.DataValidator;
import Utils.MessageDialog;
import Model.SinhVienDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.SinhVien;

/**
 *
 * @author Admin
 */
public class QuanLySinhVien extends javax.swing.JFrame {

    private DefaultTableModel tblModel;

    /**
     * Creates new form QuanLySinhVien
     */
    public QuanLySinhVien() {
        initComponents();
        setLocationRelativeTo(null);
        initTable();
        loadDataToTable();
    }

    public void initTable() {
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã sinh viên", "Họ tên", "Giới tính", "Ngày sinh", "Khoa"});
        tbSinhVien.setModel(tblModel);

    }

    public void loadDataToTable() {
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = dao.docFile();
            tblModel.setRowCount(0);
            for (SinhVien sv : list) {
                tblModel.addRow(new Object[]{
                    sv.getMaSV(), sv.getTenSV(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getKhoa()
                });

            }
            tblModel.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorMessage(this, e.getMessage(), "Lỗi");
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

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchMSV = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMSV = new javax.swing.JTextField();
        txtTenSV = new javax.swing.JTextField();
        txtKhoa = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnNhapMoi = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btnNam = new javax.swing.JRadioButton();
        btnNu = new javax.swing.JRadioButton();
        btnLuu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Tìm kiếm ");

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtSearchMSV, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearchMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim))
                .addContainerGap())
        );

        jLabel3.setText("Mã sinhviên");

        jLabel4.setText("Tên sinh viên ");

        jLabel5.setText("Khoa");

        jLabel6.setText("Ngày sinh");

        btnNhapMoi.setText("Nhập mới");
        btnNhapMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapMoiActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel7.setText("Giới tính");

        btnNam.setText("Nam");

        btnNu.setText("Nữ");

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbSinhVien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNhapMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLuu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNu))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMSV)
                                .addComponent(txtTenSV)
                                .addComponent(txtKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(txtDOB)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnNam)
                    .addComponent(btnNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnNhapMoi)
                    .addComponent(btnXoa)
                    .addComponent(btnLuu))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý Sinh Viên");

        btnBack.setText("Quay lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel1))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtSearchMSV, sb, "Mã sinh viên không được để trống");
        if (sb.length() > 0) {
            MessageDialog.showErrorMessage(this, sb.toString(), "Lỗi");
            return;
        }
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = dao.docFile();
            SinhVien tv = dao.getSVbyMaSV(txtSearchMSV.getText(), list);
            if (tv != null) {
                txtMSV.setText(tv.getMaSV());
                txtTenSV.setText(tv.getTenSV());
                txtDOB.setText(tv.getNgaySinh());
                txtKhoa.setText(tv.getKhoa());
                btnNam.setSelected(tv.getGioiTinh().equalsIgnoreCase("Nam") ? true : false);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnNhapMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapMoiActionPerformed
        txtMSV.setText("");
        txtTenSV.setText("");
        txtDOB.setText("");
        txtKhoa.setText("");
    }//GEN-LAST:event_btnNhapMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMSV, sb, "Mã sinh viên không được để trống");
        DataValidator.validateEmpty(txtTenSV, sb, "Tên sinh viên không được để trống");
        DataValidator.validateEmpty(txtDOB, sb, "Ngày sinh không được để trống");
        DataValidator.validateEmpty(txtKhoa, sb, "Tên khoa không được để trống");
        if (sb.length() > 0) {
            MessageDialog.showErrorMessage(this, sb.toString(), "Lỗi");
            return;
        }
        if (MessageDialog.showConfirm(this, "Bạn có muốn sửa sinh viên không", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = dao.docFile();
            SinhVien newSV = new SinhVien();
            newSV.setMaSV(txtMSV.getText());
            newSV.setTenSV(txtTenSV.getText());
            newSV.setGioiTinh(btnNam.isSelected() ? "Nam" : "Nữ");
            newSV.setKhoa(txtKhoa.getText());
            newSV.setNgaySinh(txtDOB.getText());
            if (dao.suaThanhVien(txtMSV.getText(), newSV, list)) {
                MessageDialog.showMessage(this, "Sinh viên đã được sửa", "Thông báo");
            } else {
                MessageDialog.showMessage(this, "Sinh viên chưa được sửa", "Cảnh báo");
            }
            dao.luuFile(list, false);
            loadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorMessage(this, e.getMessage(), "Lỗi");

        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMSV, sb, "Mã sinh viên không được để trống");
        if (sb.length() > 0) {
            MessageDialog.showErrorMessage(this, sb.toString(), "Lỗi");
            return;
        }
        if (MessageDialog.showConfirm(this, "Bạn có muốn xóa sinh viên không", "Hỏi") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = dao.docFile();

            if (dao.xoaThanhVien(txtMSV.getText(), list)) {
                MessageDialog.showMessage(this, "Thành vien  đã được xóa", "Thông báo");
            } else {
                MessageDialog.showMessage(this, "Sinh viên chưa được xóa", "Cảnh báo");
            }
            dao.luuFile(list, false);
            loadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorMessage(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMSV, sb, "Mã sinh viên không được để trống");
        DataValidator.validateEmpty(txtTenSV, sb, "Tên sinh viên không được để trống");
        DataValidator.validateEmpty(txtDOB, sb, "Ngày sinh không được để trống");
        DataValidator.validateEmpty(txtKhoa, sb, "Tên khoa không được để trống");
        if (sb.length() > 0) {
            MessageDialog.showErrorMessage(this, sb.toString(), "Lỗi");
            return;
        }
        try {
            SinhVienDAO dao = new SinhVienDAO();
            List<SinhVien> list = new ArrayList<>();
            SinhVien sv = new SinhVien(txtMSV.getText(), txtTenSV.getText(), txtKhoa.getText(), txtDOB.getText(), btnNam.isSelected() ? "Nam" : "Nữ");
            list.add(sv);
            dao.luuFile(list, true);
            MessageDialog.showMessage(this, "Sinh viên đã được lưu", "Thông báo");
            loadDataToTable();

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorMessage(this, e.getMessage(), "Lỗi");

        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        try {
            int row = tbSinhVien.getSelectedRow();
            if (row >= 0) {
                String id = (String) tbSinhVien.getValueAt(row, 0);
                SinhVienDAO dao = new SinhVienDAO();
                List<SinhVien> list = dao.docFile();
                SinhVien tv = dao.getSVbyMaSV(id, list);
                if (tv != null) {
                    txtMSV.setText(tv.getMaSV());
                    txtTenSV.setText(tv.getTenSV());
                    txtDOB.setText(tv.getNgaySinh());
                    txtKhoa.setText(tv.getKhoa());
                    btnNam.setSelected(tv.getGioiTinh().equalsIgnoreCase("Nam") ? true : false);
                    btnNu.setSelected(tv.getGioiTinh().equalsIgnoreCase("Nữ") ? true : false);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialog.showErrorMessage(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbSinhVienMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
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
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLuu;
    private javax.swing.JRadioButton btnNam;
    private javax.swing.JButton btnNhapMoi;
    private javax.swing.JRadioButton btnNu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtMSV;
    private javax.swing.JTextField txtSearchMSV;
    private javax.swing.JTextField txtTenSV;
    // End of variables declaration//GEN-END:variables

}

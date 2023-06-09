/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.DanhGiaSV.DANHGIASCREEN;
import GUI.QuanLyKTX.GUIQuanLyKyTucXa;
import GUI.QuanLyLichThi.QuanLyLichThi;
import GUI.ThongKe.ThongKe;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Đặng Huy
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    static String nameAdmin;

    public Home(String name) {
        initComponents();
        setLocationRelativeTo(null);
        this.nameAdmin = name;
        txtNameAdmin.setText("Xin chào, " + nameAdmin);
    }

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        txtNameAdmin.setText("Xin chào, " + nameAdmin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSinhVien = new javax.swing.JButton();
        btnLichThi = new javax.swing.JButton();
        btnKTX = new javax.swing.JButton();
        btnRenLuyen = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        txtNameAdmin = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Trang chủ hệ thống");

        btnSinhVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSinhVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-users-50.png"))); // NOI18N
        btnSinhVien.setText("SINH VIÊN");
        btnSinhVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSinhVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinhVienActionPerformed(evt);
            }
        });

        btnLichThi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLichThi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-schedule-50.png"))); // NOI18N
        btnLichThi.setText("LỊCH THI");
        btnLichThi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLichThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichThiActionPerformed(evt);
            }
        });

        btnKTX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKTX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-bunk-bed-50.png"))); // NOI18N
        btnKTX.setText("KÝ TÚC XÁ");
        btnKTX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKTX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKTXActionPerformed(evt);
            }
        });

        btnRenLuyen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRenLuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Danh_gia.png"))); // NOI18N
        btnRenLuyen.setText("ĐÁNH GIÁ RÈN LUYỆN");
        btnRenLuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRenLuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenLuyenActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-statistic-50.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        txtNameAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNameAdmin.setText("welcome");

        btnDangXuat.setBackground(new java.awt.Color(255, 0, 0));
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-exit-30.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRenLuyen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtNameAdmin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDangXuat))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnKTX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addComponent(btnLichThi, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameAdmin)
                    .addComponent(btnDangXuat))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLichThi, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(btnSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKTX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnRenLuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSinhVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinhVienActionPerformed
        new QuanLySinhVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSinhVienActionPerformed

    private void btnLichThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichThiActionPerformed
        new QuanLyLichThi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLichThiActionPerformed

    private void btnKTXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKTXActionPerformed
        try {
            new GUIQuanLyKyTucXa().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_btnKTXActionPerformed

    private void btnRenLuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenLuyenActionPerformed
        new DANHGIASCREEN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRenLuyenActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        new ThongKe().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKTX;
    private javax.swing.JButton btnLichThi;
    private javax.swing.JButton btnRenLuyen;
    private javax.swing.JButton btnSinhVien;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtNameAdmin;
    // End of variables declaration//GEN-END:variables
}

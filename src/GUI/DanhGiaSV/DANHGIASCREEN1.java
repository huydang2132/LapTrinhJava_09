package GUI.DanhGiaSV;


import GUI.DanhGiaSV.DANHGIASCREEN;
import Model.DANHGIASINHVIEN;
import Model.TrainingEvaluation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Sevice.SINHVIENDOC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Nguyen Hong Phong
 */
public class DANHGIASCREEN1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static String Masv;
    static String Hoten;
    static List<DANHGIASINHVIEN> DGList = new ArrayList<DANHGIASINHVIEN>();

    public DANHGIASCREEN1(DANHGIASINHVIEN dgsv, List<DANHGIASINHVIEN> listsv) {
        initComponents();
        setLocationRelativeTo(null);
        Masv = dgsv.getMaSV();
        Hoten = dgsv.getTenSV();
        DGList = listsv;
    }

    public DANHGIASCREEN1() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        TF3 = new javax.swing.JTextField();
        TF4 = new javax.swing.JTextField();
        TF5 = new javax.swing.JTextField();
        TF6 = new javax.swing.JTextField();
        TF7 = new javax.swing.JTextField();
        TF8 = new javax.swing.JTextField();
        TF9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TF11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TF14 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TF12 = new javax.swing.JTextField();
        TF13 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        LB1 = new javax.swing.JLabel();
        LB2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel18.setText("5. Đánh giá về ý thức tham gia công tác cán bộ lớp,tổ chức trong nhà trường hoặc Sinh viên đạt được thành tích xuất sắc (0-20đ)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("- Có bài đăng trên tạp chí khoa học(0-10đ)");

        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });

        TF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setText("- Chấp hành các quy định, các văn bản chỉ đạo được thực hiện trong trường(0-10đ)");

        TF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF10ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setText("- Chấp hành các nội quy, quy chế của nhà trường (0-10đ)");

        TF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF11ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setText("- Chấp hành các quy định khác được thực hiên trong trường(0-5đ)");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setText("2.Đánh giá về ý thức chấp hành nội quy quy chế của nhà trường.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("- Tham gia nghien cứu khoa học (0-5đ)");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("- Là thành viên các CLB (0-3đ)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("- Tham gia các cuộc thi học thuật(0-5đ)");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("3.Đánh giá về ý thức tham gia các hoạt động chính trị – xã hội, Văn hoá, Văn nghệ, Thể dục, Thể thao, phòng chống tội phạm và các tệ nạn xã hội");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đánh giá rèn luyện");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Đánh giá");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Quay lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("1.Đánh giá về ý thức, thái độ tham gia và kết quả học tập (Chỉ đánh giá những tiêu chí có thể tham gia)");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setText("- Tham gia các hoạt động rèn luyện về chính trị, xã hội, văn hóa, văn nghệ, thể thao(0-10đ)");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel15.setText("- Là thành viên và sinh hoạt định kỳ cùng các CLB nghệ thuật, TDTT (0-5đ)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("-Tham gia các lớp kỹ năng mềm,kỹ năng thực hành xã hội(0-8đ) ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel16.setText("- Tham gia phong trào phòng chống tội phạm và các tệ nạn xã hội(0-5đ)");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("- Tham gia các lớp hội thảo khoa học(0-4đ)");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel17.setText("4.Đánh giá về ý thức công dân trong quan hệ cộng đồng(0-25đ)");

        TF12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF12ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel13)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(TF14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TF9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TF8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(TF7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addComponent(TF6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(TF5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(TF4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(TF3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(TF2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(TF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(TF10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TF12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(TF13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(LB1)
                                .addGap(79, 79, 79)
                                .addComponent(LB2)
                                .addGap(102, 102, 102)
                                .addComponent(jButton1)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(TF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(TF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(TF10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TF11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TF12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TF13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(TF14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB1)
                    .addComponent(LB2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF10ActionPerformed

    private void TF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF11ActionPerformed

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

    private void TF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF2ActionPerformed

    private void TF12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int Tieuchi1 = 0, Tieuchi2 = 0, Tieuchi3 = 0, Tieuchi4 = 0, Tieuchi5 = 0;
        try {
            int Tf1 = Integer.parseInt(TF1.getText());
            if(Tf1<0||Tf1>5){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf2 = Integer.parseInt(TF2.getText());
            if(Tf2<0||Tf2>3){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf3 = Integer.parseInt(TF3.getText());
            if(Tf3<0||Tf3>5){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf4 = Integer.parseInt(TF4.getText());
            if(Tf4<0||Tf4>8){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf5 = Integer.parseInt(TF5.getText());
            if(Tf5<0||Tf5>4){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf6 = Integer.parseInt(TF6.getText());
            if(Tf6<0||Tf6>10){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf7 = Integer.parseInt(TF7.getText());
            if(Tf7<0||Tf7>10){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf8 = Integer.parseInt(TF8.getText());
            if(Tf8<0||Tf8>10){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf9 = Integer.parseInt(TF9.getText());
            if(Tf9<0||Tf9>5){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf10 = Integer.parseInt(TF10.getText());
            if(Tf10<0||Tf10>10){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf11 = Integer.parseInt(TF11.getText());
            if(Tf11<0||Tf11>5){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            int Tf12 = Integer.parseInt(TF12.getText());
            if(Tf12<0||Tf12>5){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            Tieuchi4 = Integer.parseInt(TF13.getText());
            if(Tieuchi4<0||Tieuchi4>25){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            Tieuchi5 = Integer.parseInt(TF14.getText());
            if(Tieuchi5<0||Tieuchi5>20){
                JOptionPane.showMessageDialog(this, "Nhập đúng trường điểm");
                return;
            }
            Tieuchi1 = Tf1 + Tf2 + Tf3 + Tf4 + Tf5 + Tf6;
            Tieuchi2 = Tf7 + Tf8 + Tf9;
            Tieuchi3 = Tf10 + Tf11 + Tf12;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Nhap sai, yêu cầu nhập lại!!");
            return;
        }
        TrainingEvaluation evaluation = new TrainingEvaluation(Tieuchi1, Tieuchi2, Tieuchi3, Tieuchi4, Tieuchi5);

        int DGScore = evaluation.calculateScore();
        String evaluationResult = evaluation.evaluateTraining();

        LB1.setText("Điểm đánh giá: " + DGScore);
        LB2.setText("Xếp loại: " + evaluationResult);
        for (DANHGIASINHVIEN danhgiasinhvien : DGList) {
            if (danhgiasinhvien.getMaSV().equals(Masv)) {
                danhgiasinhvien.setScore( DGScore);
                danhgiasinhvien.setXeploai(evaluationResult);
            }
        }
        SINHVIENDOC sinhviendoc = new SINHVIENDOC();
        sinhviendoc.ghifile(DGList);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DANHGIASCREEN n2 = new DANHGIASCREEN();
        n2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DANHGIASCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DANHGIASCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DANHGIASCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DANHGIASCREEN1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DANHGIASCREEN1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB1;
    private javax.swing.JLabel LB2;
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF10;
    private javax.swing.JTextField TF11;
    private javax.swing.JTextField TF12;
    private javax.swing.JTextField TF13;
    private javax.swing.JTextField TF14;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JTextField TF4;
    private javax.swing.JTextField TF5;
    private javax.swing.JTextField TF6;
    private javax.swing.JTextField TF7;
    private javax.swing.JTextField TF8;
    private javax.swing.JTextField TF9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

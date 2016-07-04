/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuhnpk00528;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10 Version 2
 */
public class frmRegister extends javax.swing.JFrame {

    /**
     * Creates new form frmRegister
     */
    public frmRegister() {
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

        jRadioButton1 = new javax.swing.JRadioButton();
        pnlRegisterInfo = new javax.swing.JPanel();
        lblRegisterTitle = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblRetypePassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRetypePassword = new javax.swing.JPasswordField();
        chkbAgree = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        pnlCopyright = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlRegisterInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));

        lblRegisterTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRegisterTitle.setForeground(new java.awt.Color(51, 102, 255));
        lblRegisterTitle.setText("ĐĂNG KÝ THÀNH VIÊN");

        lblUserName.setText("Tên đăng nhập");

        lblPassword.setText("Mật khẩu");

        lblRetypePassword.setText("Nhập lại mật khẩu");

        chkbAgree.setForeground(new java.awt.Color(102, 153, 255));
        chkbAgree.setText("Đồng ý các điều khoản");

        btnRegister.setForeground(new java.awt.Color(255, 153, 51));
        btnRegister.setText("Đăng ký");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegisterInfoLayout = new javax.swing.GroupLayout(pnlRegisterInfo);
        pnlRegisterInfo.setLayout(pnlRegisterInfoLayout);
        pnlRegisterInfoLayout.setHorizontalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRetypePassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(29, 29, 29)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                        .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegister)
                            .addComponent(chkbAgree))
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addComponent(txtPassword)
                    .addComponent(txtUserName)
                    .addComponent(txtRetypePassword))
                .addContainerGap())
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblRegisterTitle)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        pnlRegisterInfoLayout.setVerticalGroup(
            pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlRegisterInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRetypePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRetypePassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkbAgree)
                .addGap(12, 12, 12)
                .addComponent(btnRegister)
                .addContainerGap())
        );

        pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
        pnlCopyright.setLayout(pnlCopyrightLayout);
        pnlCopyrightLayout.setHorizontalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlCopyrightLayout.setVerticalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlRegisterInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
//        frmLoaiSanPham frm = new frmLoaiSanPham();
//        frm.show();
//        frmSanPham frm1 = new frmSanPham();
//        frm1.show();
//        this.dispose();
        
//        String strUsername = txtUserName.getText().trim();
//        String strPassword = String.valueOf(txtPassword.getPassword()).trim();
//    
//        if(strUsername.length() < 6 || strUsername.length() > 10){
//            ThongBao("Tên đăng nhập phải từ 6-10 ký tự", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
//        }else if(strPassword.length() < 6){
//            ThongBao("Mật khẩu phải nhập nhiều hơn 6 ký tự", "Lỗi đăng nhập", 2); 
//        }else if(!KiemTraChuaChuVaSo(strPassword)){
//            ThongBao("Chưa có chữ", "Thông báo", 2);
//        }else {
//            
//        }      
       String themtdn,mk,nhaplaimk;
       themtdn = txtUserName.getText();
       mk = String.valueOf(txtPassword.getPassword()).trim();
       nhaplaimk =String.valueOf(txtRetypePassword.getPassword()).trim();
       String cautruyvan = "insert into DangNhap(TenDangNhap,MatKhau)"
               + "values('"+themtdn+"','"+mk+"')" ;
       if(themtdn.equals("")&& mk.equals("") ){
            ThongBao("Bạn chưa nhập tên tài khoản hoặc mật khẩu", "Lỗi đăng nhập", 2);
       }else if(mk.length() <6){
            ThongBao("Mật khẩu phải lớn hơn 6 kí tự", "Lỗi đăng nhập", 2);
       }else if(!nhaplaimk.equals(mk)){
            ThongBao("Mật khẩu không trùng khớp", "Lỗi đăng nhập", 2);
       }else if(KiemTra(themtdn,mk)){
            ThongBao("Tài khoản đã được sử dụng", "Lỗi đăng nhập", 2);
       }else{
           BaiTapBuoi1.connection.ExcuteQueryUpdateDB(cautruyvan);
           ThongBao("Bạn đã đăng ký thành công", "Lỗi đăng nhập", 2);
           frmDangNhap frm = new frmDangNhap();
           frm.show();
           this.dispose();
       }      
      
    }//GEN-LAST:event_btnRegisterActionPerformed
    private boolean KiemTra(String themtdn, String mk) {    
        boolean kq = false;
       
        String cautruyvan = "select * from DangNhap where TenDangNhap= '" + themtdn+"'";
        System.out.println(cautruyvan);
        ResultSet rs = BaiTapBuoi1.connection.ExcuteQueryGetTable(cautruyvan);

        try {
            while (rs.next()) {
                if (rs.getString("TenDangNhap").equals(themtdn)) {
                    kq = true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("lỗi đăng ký tài khoản");
        }
       
        return kq;
    }
    private boolean KiemTraChuaChuVaSo(String chuoiCanKiemTra){
        boolean ketQua = false;
        
        Pattern p = Pattern.compile(".*[a-zA-Z].*");
        Matcher m = p.matcher(chuoiCanKiemTra);
        
        ketQua = m.find();
        
        return ketQua;
    }
    
    private void ThongBao(String noiDungThongBao,  String tieuDeThongBao, int icon ){
        JOptionPane.showMessageDialog( new JFrame(), noiDungThongBao,
                    tieuDeThongBao, icon );
    }
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
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox chkbAgree;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRegisterTitle;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JPanel pnlRegisterInfo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRetypePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

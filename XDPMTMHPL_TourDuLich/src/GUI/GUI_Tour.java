/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import GUI.Panel_KhachHang;
//import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Win 10
 */
public class GUI_Tour extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Tour
     */
    public GUI_Tour() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = screenSize.width - 850;
        int x1 = x / 2;
        this.setBounds(x1, 100, 850, 550);
        this.setResizable(false);
        this.setTitle("Quản Lý Tour Du Lịch");

        Image();
    }

    public void Image() {
//        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/bg.jpg"));
        ImageIcon img = new ImageIcon("src/Images/bg.jpg");
        // KÍCH THƯỚC HÌNH ẢNH LÀ 672,496 => kích thước panel cũng vậy
        lbl_Image.setIcon(img);
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
        btnKhHang = new javax.swing.JButton();
        btnKhSan = new javax.swing.JButton();
        btnPhTien = new javax.swing.JButton();
        btnTour = new javax.swing.JButton();
        btnVe = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnDangxuat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 530));

        btnKhHang.setText("Khách Hàng");
        btnKhHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhHangActionPerformed(evt);
            }
        });

        btnKhSan.setText("Khách Sạn");
        btnKhSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhSanActionPerformed(evt);
            }
        });

        btnPhTien.setText("Phương Tiện");
        btnPhTien.setToolTipText("");
        btnPhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhTienActionPerformed(evt);
            }
        });

        btnTour.setText("Tour");
        btnTour.setToolTipText("");
        btnTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourActionPerformed(evt);
            }
        });

        btnVe.setText("Vé");
        btnVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeActionPerformed(evt);
            }
        });

        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnDangxuat.setText("Đăng xuất");
        btnDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhSan, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnKhHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhTien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnDangxuat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKhHang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKhSan, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTour, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVe, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnDangxuat))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        lbl_Image.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Panel_NhanVien pnNV = new Panel_NhanVien();
    Panel_KhachHang pnKH = new Panel_KhachHang();
    Panel_KhachSan pnKS = new Panel_KhachSan();
    Panel_PhuongTien pnPT = new Panel_PhuongTien();
    Panel_Tour pnTour = new Panel_Tour();
    Panel_Ve pnVe = new Panel_Ve();


    private void btnKhHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhHangActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnKhHang) {
//            jPanel3.removeAll();
//            jPanel3.remove(pnKS);
//            jPanel3.remove(pnPT);
//            jPanel3.remove(pnTour);
//            jPanel3.remove(pnVe);
//            lbl_Image.setVisible(false);
//            jPanel3.setBackground(Color.red);
//            Panel_KhachHang pn_cn1 = new Panel_KhachHang();
//            jPanel3.add(pn_cn1);
//            pnKH.setVisible(true);
//            jPanel3.add(pnKH);
            jPanel3.removeAll();
            jPanel3.add(pnKH);
            jPanel3.repaint();
            pnKH.repaint();
            pnKH.revalidate();
        }
    }//GEN-LAST:event_btnKhHangActionPerformed

    private void btnKhSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhSanActionPerformed
        // TODO add your handling code here:

        if (evt.getSource() == btnKhSan) {
//            jPanel3.removeAll();
//            jPanel3.remove(pnKH);
//            jPanel3.remove(pnPT);
//            jPanel3.remove(pnTour);
//            jPanel3.remove(pnVe);
//            lbl_Image.setVisible(false);
//            jPanel3.setBackground(Color.yellow);
//            Panel_KhachSan pn_cn2 = new Panel_KhachSan();
//            jPanel3.add(pn_cn2);
//            pnKS.setVisible(true);
//            jPanel3.add(pnKS);
            jPanel3.removeAll();
            jPanel3.add(pnKS);
            jPanel3.repaint();
            pnKS.revalidate();
            pnKS.repaint();
        }
    }//GEN-LAST:event_btnKhSanActionPerformed

    private void btnPhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhTienActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnPhTien) {
//            jPanel3.removeAll();
//            jPanel3.remove(pnKH);
//            jPanel3.remove(pnKS);
//            jPanel3.remove(pnTour);
//            jPanel3.remove(pnVe);
//            lbl_Image.setVisible(false);
//            jPanel3.setBackground(Color.black);
//            Panel_PhuongTien pn_cn3 = new Panel_PhuongTien();
//            jPanel3.add(pn_cn3);
//            pnPT.setVisible(true);
//            jPanel3.add(pnPT);
            jPanel3.removeAll();
            jPanel3.add(pnPT);
            jPanel3.repaint();
            pnPT.revalidate();
            pnPT.repaint();
        }
    }//GEN-LAST:event_btnPhTienActionPerformed

    private void btnTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnTour) {
//            jPanel3.removeAll();
//            jPanel3.remove(pnKH);
//            jPanel3.remove(pnKS);
//            jPanel3.remove(pnPT);
//            jPanel3.remove(pnVe);
//            lbl_Image.setVisible(false);
//            jPanel3.setBackground(Color.black);
//            Panel_PhuongTien pn_cn3 = new Panel_PhuongTien();
//            jPanel3.add(pn_cn3);
//            pnTour.setVisible(true);
//            jPanel3.add(pnTour);
            jPanel3.removeAll();
            jPanel3.add(pnTour);
            jPanel3.repaint();
            pnTour.revalidate();
            pnTour.repaint();
        }
    }//GEN-LAST:event_btnTourActionPerformed

    private void btnVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnVe) {
//            jPanel3.removeAll();
//            jPanel3.remove(pnKH);
//            jPanel3.remove(pnKS);
//            jPanel3.remove(pnTour);
//            jPanel3.remove(pnPT);
//            lbl_Image.setVisible(false);
//            jPanel3.setBackground(Color.black);
//            Panel_PhuongTien pn_cn3 = new Panel_PhuongTien();
//            jPanel3.add(pn_cn3);
//            pnVe.setVisible(true);
//            jPanel3.add(pnVe);
            jPanel3.removeAll();
            jPanel3.add(pnVe);
            jPanel3.repaint();
            pnVe.revalidate();
            pnVe.repaint();
        }
    }//GEN-LAST:event_btnVeActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnNhanVien) {
//            jPanel3.removeAll();
//            jPanel3.add(lbl_Image);
//            jPanel3.repaint();
//            lbl_Image.setVisible(true);
//            jPanel3.add(lbl_Image);
            jPanel3.removeAll();
            jPanel3.add(pnNV);
            jPanel3.repaint();
            pnNV.revalidate();
            pnNV.repaint();
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangxuatActionPerformed
        // TODO add your handling code here:      
        new DangNhapFrm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangxuatActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Tour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Tour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangxuat;
    private javax.swing.JButton btnKhHang;
    private javax.swing.JButton btnKhSan;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhTien;
    private javax.swing.JButton btnTour;
    private javax.swing.JButton btnVe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Image;
    // End of variables declaration//GEN-END:variables
}

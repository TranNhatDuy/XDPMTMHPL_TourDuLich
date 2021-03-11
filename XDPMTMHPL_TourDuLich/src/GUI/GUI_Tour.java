/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
//import GUI.Panel_KhachHang;
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
        int x = screenSize.width - 950;
        int x1 = x / 2;
        this.setBounds(x1, 20, 950, 670);
        this.setResizable(false);
        this.setTitle("Quản Lý Tour Du Lịch");

        Image();
    }

    public void Image() {
//        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/bg.jpg"));
        ImageIcon img = new ImageIcon("src/Images/bg.jpg");
        // KÍCH THƯỚC HÌNH ẢNH LÀ 767,617 => kích thước panel cũng vậy
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
        btnTour = new javax.swing.JButton();
        btnGia = new javax.swing.JButton();
        btnDiaDiem = new javax.swing.JButton();
        btnDoan = new javax.swing.JButton();
        btnChiphi = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKhHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKhHang.setText("Khách Hàng");
        btnKhHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhHangActionPerformed(evt);
            }
        });

        btnTour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTour.setText("Tour");
        btnTour.setToolTipText("");
        btnTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourActionPerformed(evt);
            }
        });

        btnGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGia.setText("Giá");
        btnGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaActionPerformed(evt);
            }
        });

        btnDiaDiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDiaDiem.setText("Địa điểm");
        btnDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaDiemActionPerformed(evt);
            }
        });

        btnDoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoan.setText("Đoàn");
        btnDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanActionPerformed(evt);
            }
        });

        btnChiphi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChiphi.setText("Chi phí");
        btnChiphi.setToolTipText("");
        btnChiphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiphiActionPerformed(evt);
            }
        });

        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Đăng xuất");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnTour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDiaDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnChiphi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhHang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(btnTour, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnKhHang, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(786, 629));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Panel_NhanVien pnNV = new Panel_NhanVien();
    Panel_KhachHang pnKH = new Panel_KhachHang();
    Panel_ChiPhi pnCP = new Panel_ChiPhi();
    Panel_Gia pnGia = new Panel_Gia();
    Panel_Doan pnDoan = new Panel_Doan();
    Panel_Tour pnTour = new Panel_Tour();
    Panel_DiaDiem pnDd = new Panel_DiaDiem();


    private void btnKhHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhHangActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnKhHang) {
            jPanel3.removeAll();
            jPanel3.add(pnKH);
            jPanel3.repaint();
            pnKH.repaint();
            pnKH.revalidate();
        }
    }//GEN-LAST:event_btnKhHangActionPerformed

    private void btnTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTourActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnTour) {
            jPanel3.removeAll();
            jPanel3.add(pnTour);
            jPanel3.repaint();
            pnTour.revalidate();
            pnTour.repaint();
        }
    }//GEN-LAST:event_btnTourActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnNhanVien) {
            jPanel3.removeAll();
            jPanel3.add(pnNV);
            jPanel3.repaint();
            pnNV.revalidate();
            pnNV.repaint();
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaActionPerformed
        if (evt.getSource() == btnGia) {
            jPanel3.removeAll();
            jPanel3.add(pnGia);
            jPanel3.repaint();
            pnGia.revalidate();
            pnGia.repaint();
        }
    }//GEN-LAST:event_btnGiaActionPerformed

    private void btnDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaDiemActionPerformed
        if (evt.getSource() == btnDiaDiem) {
            jPanel3.removeAll();
            jPanel3.add(pnDd);
            jPanel3.repaint();
            pnDd.revalidate();
            pnGia.repaint();
        }
    }//GEN-LAST:event_btnDiaDiemActionPerformed

    private void btnDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanActionPerformed
        if (evt.getSource() == btnDoan) {
            jPanel3.removeAll();
            jPanel3.add(pnDoan);
            jPanel3.repaint();
            pnDoan.revalidate();
            pnDoan.repaint();
        }
    }//GEN-LAST:event_btnDoanActionPerformed

    private void btnChiphiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiphiActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnChiphi) {
            jPanel3.removeAll();
            jPanel3.add(pnCP);
            jPanel3.repaint();
            pnCP.revalidate();
            pnCP.repaint();
        }
    }//GEN-LAST:event_btnChiphiActionPerformed

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
    private javax.swing.JButton btnChiphi;
    private javax.swing.JButton btnDiaDiem;
    private javax.swing.JButton btnDoan;
    private javax.swing.JButton btnGia;
    private javax.swing.JButton btnKhHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnTour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Image;
    // End of variables declaration//GEN-END:variables
}

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
        int x = screenSize.width - 948;
        int x1 = x / 2;
        this.setBounds(x1, 20, 948, 661);
        this.setResizable(false);
        this.setTitle("Quản Lý Tour Du Lịch");

        ImageAndIcons();
    }

    public void ImageAndIcons() {
//        ImageIcon icon = new ImageIcon(getClass().getResource("/Images/bg.jpg"));
        ImageIcon img = new ImageIcon("src/Images/bg.jpg");
        lbl_Image.setIcon(img);

        ImageIcon tour = new ImageIcon("src/Images/icon_tour.png");
        ImageIcon price = new ImageIcon("src/Images/icon_price.png");
        ImageIcon location = new ImageIcon("src/Images/icon_location.png");
        ImageIcon group = new ImageIcon("src/Images/icons_group.png");
        ImageIcon cost = new ImageIcon("src/Images/icon_cost.png");
        ImageIcon customer = new ImageIcon("src/Images/icons_customer.png");
        ImageIcon staff = new ImageIcon("src/Images/icon_staff.png");
        ImageIcon statistics = new ImageIcon("src/Images/icon_statistics.png");

        btnTour.setIcon(tour);
        btnGia.setIcon(price);
        btnDiaDiem.setIcon(location);
        btnDoan.setIcon(group);
        btnChiphi.setIcon(cost);
        btnKhHang.setIcon(customer);
        btnNhanVien.setIcon(staff);
        btnThongKe.setIcon(statistics);
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
        btnDiaDiem = new javax.swing.JButton();
        btnChiphi = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnTour = new javax.swing.JButton();
        btnGia = new javax.swing.JButton();
        btnDoan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbl_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 247, 241));

        btnKhHang.setBackground(new java.awt.Color(255, 127, 174));
        btnKhHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKhHang.setText("Khách Hàng");
        btnKhHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhHangActionPerformed(evt);
            }
        });

        btnDiaDiem.setBackground(new java.awt.Color(255, 127, 174));
        btnDiaDiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDiaDiem.setText("Địa điểm");
        btnDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaDiemActionPerformed(evt);
            }
        });

        btnChiphi.setBackground(new java.awt.Color(255, 127, 174));
        btnChiphi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChiphi.setText("Chi phí");
        btnChiphi.setToolTipText("");
        btnChiphi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiphiActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(255, 127, 174));
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(255, 127, 174));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(131, 51, 233));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnTour.setBackground(new java.awt.Color(255, 127, 174));
        btnTour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTour.setText("Tour");
        btnTour.setToolTipText("");
        btnTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTourActionPerformed(evt);
            }
        });

        btnGia.setBackground(new java.awt.Color(255, 127, 174));
        btnGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGia.setText("Giá");
        btnGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaActionPerformed(evt);
            }
        });

        btnDoan.setBackground(new java.awt.Color(255, 127, 174));
        btnDoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoan.setText("Đoàn");
        btnDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDiaDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnChiphi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTour, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGia, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhHang, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnDangXuat)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(786, 629));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbl_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Image, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
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
    Panel_ThongKe pnTk = new Panel_ThongKe();


    private void btnKhHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhHangActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnKhHang) {
            jPanel3.removeAll();
            jPanel3.add(pnKH);
            jPanel3.repaint();
            pnKH.repaint();
            pnKH.revalidate();
            pnKH.ShowDoan();
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
            pnTour.showDiadiem();
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
            pnNV.showDoan();
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaActionPerformed
        if (evt.getSource() == btnGia) {
            jPanel3.removeAll();
            jPanel3.add(pnGia);
            jPanel3.repaint();
            pnGia.revalidate();
            pnGia.repaint();
            pnGia.ShowTour();
        }
    }//GEN-LAST:event_btnGiaActionPerformed

    private void btnDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaDiemActionPerformed
        if (evt.getSource() == btnDiaDiem) {
            jPanel3.removeAll();
            jPanel3.add(pnDd);
            jPanel3.repaint();
            pnDd.revalidate();
            pnDd.repaint();
        }
    }//GEN-LAST:event_btnDiaDiemActionPerformed

    private void btnDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanActionPerformed
        if (evt.getSource() == btnDoan) {
            jPanel3.removeAll();
            jPanel3.add(pnDoan);
            jPanel3.repaint();
            pnDoan.revalidate();
            pnDoan.repaint();
            pnDoan.showTour();
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
            pnCP.ShowDoan();
        }
    }//GEN-LAST:event_btnChiphiActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnThongKe) {
            jPanel3.removeAll();
            jPanel3.add(pnTk);
            jPanel3.repaint();
            pnTk.revalidate();
            pnTk.repaint();
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == btnDangXuat) {
            this.setVisible(false);
            new DangNhapFrm().setVisible(true);
        }
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
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDiaDiem;
    private javax.swing.JButton btnDoan;
    private javax.swing.JButton btnGia;
    private javax.swing.JButton btnKhHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTour;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Image;
    // End of variables declaration//GEN-END:variables
}

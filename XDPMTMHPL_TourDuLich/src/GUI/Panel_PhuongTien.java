
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.PhuongTienDAO;
import DTO.PhuongTienDTO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win 10
 */
public class Panel_PhuongTien extends javax.swing.JPanel {

    /**
     * Creates new form Panel_CN3
     */
    public static DefaultTableModel dtm;
    ArrayList<PhuongTienDTO> DSPhuongTien = new ArrayList<>();
    
    public Panel_PhuongTien() {
        initComponents();
        this.setSize(672,496);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        showPT();
    }
    
    private void showPT() {
        dtm = (DefaultTableModel) tblPhuongTien.getModel();      
        DSPhuongTien =  PhuongTienDAO.loadDataPhuongTien();      
        dtm.setRowCount(0);      
        DSPhuongTien.forEach((PhuongTienDTO) -> {
            dtm.addRow(new Object[] {PhuongTienDTO.getMapt(), PhuongTienDTO.getTenpt(), 
                PhuongTienDTO.getGia()});
        });
    }
    public void reset(){
        txtMaPT.setText("");
        txtTenPT.setText("");                  
        txtGia.setText("");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhuongTien = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        txtTenPT = new javax.swing.JTextField();
        txtMaPT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(550, 480));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("PHƯƠNG TIỆN");

        tblPhuongTien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã PT", "Tên PT", "Giá"
            }
        ));
        tblPhuongTien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhuongTienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPhuongTien);

        jLabel2.setText("Mã phương tiện:");

        jLabel3.setText("Tên phương tiện:");

        jLabel4.setText("Giá:");

        txtGia.setForeground(new java.awt.Color(153, 153, 153));
        txtGia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGiaMouseClicked(evt);
            }
        });

        txtTenPT.setForeground(new java.awt.Color(153, 153, 153));
        txtTenPT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTenPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenPTMouseClicked(evt);
            }
        });

        txtMaPT.setForeground(new java.awt.Color(153, 153, 153));
        txtMaPT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMaPT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaPTMouseClicked(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtTenPT, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(90, 90, 90)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtMaPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtTenPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGiaMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtGiaMouseClicked

    private void txtTenPTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenPTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenPTMouseClicked

    private void txtMaPTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaPTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPTMouseClicked

    private void tblPhuongTienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhuongTienMouseClicked
        // TODO add your handling code here:
        int selectedIndex = tblPhuongTien.getSelectedRow();
        PhuongTienDTO pt = DSPhuongTien.get(selectedIndex); 
        txtMaPT.setText(pt.getMapt());
        txtTenPT.setText(pt.getTenpt());                
        txtGia.setText(Integer.toString((int) pt.getGia()));
    }//GEN-LAST:event_tblPhuongTienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        String mapt = txtMaPT.getText();
        String tenpt = txtTenPT.getText();
        int gia = Integer.parseInt(txtGia.getText());
        

        PhuongTienDTO ptDTO = new PhuongTienDTO(mapt, tenpt, gia);       
        PhuongTienDAO.addPhuongTien(ptDTO);
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        showPT();
        reset();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblPhuongTien.getSelectedRow();
        if(selectedIndex >= 0) {
            PhuongTienDTO ptDTO = DSPhuongTien.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa?");
            if(option == 0) {               
                PhuongTienDAO.removePhuongTien(ptDTO.getMapt());
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                showPT(); 
                reset();
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String mapt = txtMaPT.getText();
        String tenpt = txtTenPT.getText();
        int gia = Integer.parseInt(txtGia.getText());    
        int indexPT = tblPhuongTien.getSelectedRow();
        String data = dtm.getValueAt(indexPT, 0).toString();
        PhuongTienDTO ptDTO = new PhuongTienDTO(mapt, tenpt, gia);     
        PhuongTienDAO.editPhuongTien(ptDTO, data);
        JOptionPane.showMessageDialog(null, "Sửa thành công");
        showPT();
        reset();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        String mapt = JOptionPane.showInputDialog(this, "Nhập mã pt cần tìm");
        if(mapt != null && mapt.length() > 0) {           
            DSPhuongTien =  PhuongTienDAO.searchPhuongTienMaPT(mapt);
            dtm.setRowCount(0);
            DSPhuongTien.forEach((PhuongTienDTO) -> {
                dtm.addRow(new Object[] {PhuongTienDTO.getMapt(), PhuongTienDTO.getTenpt(),PhuongTienDTO.getGia()});
            });
            reset();
        } else {
            showPT();
            reset();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnLamMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPhuongTien;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaPT;
    private javax.swing.JTextField txtTenPT;
    // End of variables declaration//GEN-END:variables
}

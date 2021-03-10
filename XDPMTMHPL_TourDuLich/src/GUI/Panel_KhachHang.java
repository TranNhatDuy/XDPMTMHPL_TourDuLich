/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.KhachHangDAL;
import DAL.MySQLConnect;
import DTO.KhachHangDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Win 10
 */
public class Panel_KhachHang extends javax.swing.JPanel {

    DefaultTableModel model;
    public Panel_KhachHang() {
       
        initComponents();
//        this.setSize(672,496);
        
        this.setBounds(0, 0, 767, 617);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        
        showKhachHang();
        
    }

/**
     * Creates new form Panel_CN1
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKH = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblMaKH = new javax.swing.JLabel();
        lblTenKH = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtTimkiem = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(800, 660));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tblKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ"
            }
        ));
        tblKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKH);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("KHÁCH HÀNG");

        lblMaKH.setText("Mã khách hàng:");

        lblTenKH.setText("Tên khách hàng:");

        lblSdt.setText("Số điện thoại:");

        lblDiaChi.setText("Địa chỉ:");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtMaKH.setForeground(new java.awt.Color(153, 153, 153));
        txtMaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtMaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMaKHMouseClicked(evt);
            }
        });

        txtTenKH.setForeground(new java.awt.Color(153, 153, 153));
        txtTenKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenKHMouseClicked(evt);
            }
        });

        txtSdt.setForeground(new java.awt.Color(153, 153, 153));
        txtSdt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSdtMouseClicked(evt);
            }
        });

        txtDiaChi.setForeground(new java.awt.Color(153, 153, 153));
        txtDiaChi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiaChiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaKH)
                                .addGap(22, 22, 22)
                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimKiem))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTenKH, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSdt)
                                    .addComponent(lblDiaChi))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnLamMoi))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 194, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblMaKH))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem)
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnLamMoi))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTenKH))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSdt))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChi)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        
        if(evt.getSource() == btnTimKiem){
//            JOptionPane.showInputDialog("Nhập Số CMND hoặc Tên hoặc số điện thoại");
            String st = JOptionPane.showInputDialog("Nhập Số CMND hoặc Tên hoặc số điện thoại");
            
            int size = tblKH.getRowCount();
            // Thứ tự cột: ID, Name, Class
            for (int i = 0; i< size; i++){
                    if (tblKH.getValueAt(i,1).toString().equals(st)){
                        // Làm j thì làm
                        
                        break;
                    }
                }
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtMaKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaKHMouseClicked
        // TODO add your handling code here:
        if(evt.getSource() == txtMaKH){
            txtMaKH.setText("");
        }
    }//GEN-LAST:event_txtMaKHMouseClicked

    private void txtTenKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenKHMouseClicked
        // TODO add your handling code here:
//        if(evt.getSource() == txtTenKH){
//            txtTenKH.setText("");
//        }
    }//GEN-LAST:event_txtTenKHMouseClicked

    private void txtSdtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSdtMouseClicked
        // TODO add your handling code here:
//        if(evt.getSource() == txtSdt){
//            txtSdt.setText("");
//        }
    }//GEN-LAST:event_txtSdtMouseClicked

    private void txtDiaChiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiaChiMouseClicked
        // TODO add your handling code here:
//        if(evt.getSource() == txtDiaChi){
//            txtDiaChi.setText("");
//        }
    }//GEN-LAST:event_txtDiaChiMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
//        KhachHangDTO kh = new KhachHangDTO();
//        kh.setMakh(txtMaKH.getText());
//        kh.setTenkh(txtTenKH.getText());
//        kh.setSdt(txtSdt.getText());
//        kh.setDiachi(txtDiaChi.getText());
//        if(evt.getSource() == btnThem){
//            KhachHangDAL addKH = new KhachHangDAL();
//            addKH.addKhachHang(kh);
//            showKhachHang();
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        // TODO add your handling code here:
//        KhachHangDTO kh = new KhachHangDTO(txtMaKH.getText(), txtTenKH.getText(), txtSdt.getText(), txtDiaChi.getText());
//        
//        if(evt.getSource() == btnXoa){
//            if(txtMaKH.getText() == ""){
//                JOptionPane.showMessageDialog(null,"Chưa chọn dữ liệu", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else{
//                KhachHangDAL removeKH = new KhachHangDAL();
//                removeKH.removeKhachHang(kh);
//                showKhachHang();
//            }
//            
//        }
//        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKHMouseClicked
        // TODO add your handling code here:
        int index = tblKH.getSelectedRow();
	txtMaKH.setText((String)(model.getValueAt(index,0)));
	txtTenKH.setText((String)(model.getValueAt(index,1))); 
	txtSdt.setText((String)(model.getValueAt(index,2)));
        txtDiaChi.setText((String)(model.getValueAt(index,3)));
        
    }//GEN-LAST:event_tblKHMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
//        KhachHangDTO khDTO = new KhachHangDTO();
//        khDTO.setMakh(txtMaKH.getText());
//        khDTO.setTenkh(txtTenKH.getText());
//        khDTO.setSdt(txtSdt.getText());
//        khDTO.setDiachi(txtDiaChi.getText());
//        if(evt.getSource() == btnSua){
//            KhachHangDAL kh = new KhachHangDAL();
//            kh.editKhachHang(khDTO);
//            System.out.println(khDTO.getMakh()+ " " + khDTO.getTenkh());
//            showKhachHang();
//        }
//        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == btnLamMoi){
            txtMaKH.setText("");
            txtTenKH.setText("");
            txtSdt.setText("");
            txtDiaChi.setText("");
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed
    private void showKhachHang(){
        model = (DefaultTableModel) tblKH.getModel();
        KhachHangDAL kh = new KhachHangDAL();
        kh.loadDataKhachHang();
        ArrayList<KhachHangDTO> ds = new ArrayList<>();
        ds = kh.loadDataKhachHang();
        model.setRowCount(0);
        ds.forEach((KhachHangDTO) -> {
//            model.addRow(new Object[] {KhachHangDTO.getMakh(), KhachHangDTO.getTenkh(), KhachHangDTO.getSdt(), KhachHangDTO.getDiachi()});
        }); 
        tblKH.setModel(model);
        
//        --------------Tìm kiếm-------------
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblKH.getModel());
        tblKH.setRowSorter(rowSorter);
        
        txtTimkiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String text = txtTimkiem.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                String text = txtTimkiem.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
//        --------------Tìm kiếm-------------
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblSdt;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JTable tblKH;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}

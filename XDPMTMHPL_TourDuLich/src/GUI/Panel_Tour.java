/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAL.TourDAL;
import DTO.TourDTO;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Win 10
 */
public class Panel_Tour extends javax.swing.JPanel {
    
    /**
     * Creates new form Panel_Tour
     */
    List<TourDTO> tour;
    DefaultTableModel dtmtour;
    DefaultTableModel dtmks;
    DefaultTableModel dtmpt;
    
    
    public Panel_Tour() {
        initComponents();
        this.setBounds(0, 0, 786, 629);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        
        dtmtour = (DefaultTableModel) tblTour.getModel();
//        dtmks = (DefaultTableModel) tblKS.getModel();
//        dtmpt = (DefaultTableModel) tblPT.getModel();
//        showTour();
//        ShowKhachSan();
//        ShowPhuongTien();
    }
    
//    private void showTour() {
//        List<TourDTO> tourList = new ArrayList<>();
//        tourList =  new TourDAL().loadDataTour();
//        
//        dtmtour.setRowCount(0);
//        
//        tourList.forEach((TourDTO) -> {
//            dtmtour.addRow(new Object[] {TourDTO.getMatour(), TourDTO.getTentour(), 
//                TourDTO.getNgaybd(), TourDTO.getNgaykt(),TourDTO.getGia(),
//                TourDTO.getSoluong(), TourDTO.getPhuongtien(), TourDTO.getKhachsan()
//                });
//        });
//    }
    
//    private void ShowKhachSan() {
//        List<KhachSanDTO> ksList = new ArrayList<>();
//        ksList =  new KhachSanDAL().loadDataKhachSan();
//        
//        dtmks.setRowCount(0);
//        
//        ksList.forEach((KhachSanDTO) -> {
//            dtmks.addRow(new Object[] {KhachSanDTO.getMaks(), KhachSanDTO.getTenks() 
//                });
//        });
//    }
    
//    private void ShowPhuongTien() {
//        List<PhuongTienDTO> ptList = new ArrayList<>();
//        ptList =  new PhuongTienDAL().loadDataPhuongTien();
//        
//        dtmpt.setRowCount(0);
//        
//        ptList.forEach((PhuongTienDTO) -> {
//            dtmpt.addRow(new Object[] {PhuongTienDTO.getMapt(), PhuongTienDTO.getTenpt()
//                });
//        });
//    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTour = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTenTour = new javax.swing.JTextField();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setPreferredSize(new java.awt.Dimension(672, 496));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ TOUR");

        tblTour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tour", "Tên Tour", "Mô tả", "Mã Loại", "Mã Giá"
            }
        ));
        tblTour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTour);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã Tour:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tên Tour:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã địa điểm:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Mô tả:");

        txtTenTour.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTenTour.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtNgayBD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNgayBD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayBD.setEnabled(false);

        txtNgayKT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNgayKT.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");

        btnSua.setText("Sửa");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã địa điểm", "Thành phố", "Tên địa điểm", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jScrollPane4.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(67, 67, 67)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel10)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTenTour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(txtNgayKT, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(26, 26, 26)
                                    .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTenTour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
//        String maTour = txtMaTour.getText();
//        String tenTour = txtTenTour.getText();
//        String ngayBD = txtNgayBD.getText();
//        String ngayKT = txtNgayKT.getText();
//        Float gia = Float.parseFloat(txtGia.getText());
//        int sl = Integer.parseInt(txtSoLuong.getText());
//        String pt = txtTenPT.getText();
//        String ks = txtTenKS.getText();
//
//        Boolean isOK = true;
//
//        if (maTour.length() == 0) {
//            JOptionPane.showMessageDialog(this, "Mã Tour không được để trống!");
//            isOK = false;
//        } else if (tenTour.length() == 0) {
//            JOptionPane.showMessageDialog(this, "Tên Tour không được để trống!");
//            isOK = false;
//        } else if (ngayBD.length() == 0) {
//            JOptionPane.showMessageDialog(this, "Ngày bắt đầu không được để trống!");
//            isOK = false;
//        } else if (ngayKT.length() == 0) {
//            JOptionPane.showMessageDialog(this, "Ngày kết thúc không được để trống!");
//            isOK = false;
//        } else if (gia == 0) {
//            JOptionPane.showMessageDialog(this, "Giá không được bằng 0!");
//            isOK = false;
//        } else if (sl == 0) {
//            JOptionPane.showMessageDialog(this, "Số lượng không được bằng 0!");
//            isOK = false;
//        } else if (pt.length() == 0) {
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn phương tiện!");
//            isOK = false;
//        } else if (ks.length() == 0) {
//            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách sạn!");
//            isOK = false;
//        }
//
//        if (maTour.length() > 0) {
//            for (TourDTO tour : tour) {
//                if (tour.getMatour().matches(maTour)) {
//                    JOptionPane.showMessageDialog(this, "Mã Tour không được trùng !!!");
//                    isOK = false;
//                }
//            }
//        }
//
//        if (isOK) {
//            TourDTO tour = new TourDTO();
//            tour.setMatour(maTour);
//            tour.setTentour(tenTour);
//            Date ngaybd = new SimpleDateFormat("ddMMyyyy").parse(ngayBD);
//            tour.setNgaybd();
//            
//            if (new KhachSanDAL().addKhachSan(ks)) {
//                JOptionPane.showMessageDialog(this, "Thêm thành công khách sạn");
//                khachsan.add(ks);
//                ResetText();
//            } else {
//                JOptionPane.showMessageDialog(this, "Thêm không thành công!Nhập lại thông tin!");
//            }
//            ShowKhachSan();
//        }
        
              
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMouseClicked
        int indexTour = tblTour.getSelectedRow();
       // txtMaTour.setText(dtmtour.getValueAt(indexTour, 0).toString());
        txtTenTour.setText(dtmtour.getValueAt(indexTour, 1).toString());
        txtNgayBD.setText(dtmtour.getValueAt(indexTour, 2).toString());
        txtNgayKT.setText(dtmtour.getValueAt(indexTour, 3).toString());
        //txtGia.setText(dtmtour.getValueAt(indexTour, 4).toString());
//        txtSoLuong.setText(dtmtour.getValueAt(indexTour, 5).toString());
//        txtTenPT.setText(dtmtour.getValueAt(indexTour, 6).toString());
//        txtTenKS.setText(dtmtour.getValueAt(indexTour, 7).toString());
    }//GEN-LAST:event_tblTourMouseClicked

    private void btnLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseClicked
      //  txtMaTour.setText("");
        txtTenTour.setText("");
        txtNgayBD.setText("");
        txtNgayKT.setText("");
       // txtGia.setText("");
   //     txtSoLuong.setText("");
//        txtTenPT.setText("");
//        txtTenKS.setText("");
    }//GEN-LAST:event_btnLamMoiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblTour;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtTenTour;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

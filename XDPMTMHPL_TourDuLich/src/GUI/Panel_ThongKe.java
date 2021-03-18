/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.DoanBLL;
import BLL.TourBLL;
import DAL.DoanDAL;
import DAL.ThongKeDAL;
import DTO.DoanDTO;
import DTO.TourDTO;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
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
public class Panel_ThongKe extends javax.swing.JPanel {
    
    /**
     * Creates new form Panel_Tour
     */
    List<TourDTO> tourList;
    List<DoanDTO> doanList;
    DefaultTableModel dtmtour, dtmdoan;

    
    public Panel_ThongKe() {
        initComponents();
        this.setBounds(0, 0, 786, 632);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        
        dtmtour = (DefaultTableModel) tblTour.getModel();
        dtmdoan = (DefaultTableModel) tblDoan.getModel();
        showTour();
        
    }
    
    
    private void showTour() {
        tourList = TourBLL.loadDataTour();
        
        dtmtour.setRowCount(0);
        
        tourList.forEach((TourDTO) -> {
            dtmtour.addRow(new Object[] {TourDTO.getMatour(), TourDTO.getTentour(), TourDTO.getMadd(), TourDTO.getMota()
                });
        });
    }
    
    private void showDoanfromTour(String matour) {     
        doanList = DoanDAL.loadDataDoanfromTour(matour);
        
        dtmdoan.setRowCount(0);
        
        doanList.forEach((DoanDTO) -> {
            dtmdoan.addRow(new Object[] {DoanDTO.getMadoan(), DoanDTO.getMatour(), DoanDTO.getTendoan(), DoanDTO.getNgaydi(), DoanDTO.getNgayve(), DoanDTO.getChitietchuongtrinh()
                });
        });
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTour = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtChiphi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMatour = new javax.swing.JTextField();
        txtLoinhuan = new javax.swing.JTextField();
        txtDoanhthu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDoan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtSLNV = new javax.swing.JTextField();
        txtLoinhuan1 = new javax.swing.JTextField();
        txtDoanhthu1 = new javax.swing.JTextField();
        txtChiphi1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMadoan = new javax.swing.JTextField();
        txtSLKH = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(786, 632));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("THỐNG KÊ THEO TOUR - Đoàn");

        tblTour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tour", "Tên Tour", "Mã địa điểm", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTour.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTourMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTour);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Mã Tour:");

        txtChiphi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChiphi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtChiphi.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Doanh thu:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Chi phí:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Lợi nhuận:");

        txtMatour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMatour.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMatour.setEnabled(false);

        txtLoinhuan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoinhuan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLoinhuan.setEnabled(false);

        txtDoanhthu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDoanhthu.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDoanhthu.setEnabled(false);

        tblDoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đoàn", "Mã tour", "Tên đoàn", "Ngày đi", "Ngày về", "Chi tiết"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDoan);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã Đoàn:");

        txtSLNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSLNV.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSLNV.setEnabled(false);

        txtLoinhuan1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLoinhuan1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtLoinhuan1.setEnabled(false);

        txtDoanhthu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDoanhthu1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDoanhthu1.setEnabled(false);

        txtChiphi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtChiphi1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtChiphi1.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Doanh thu:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Chi phí:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Lợi nhuận:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số lượng khách hàng:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Số lượng nhân viên:");

        txtMadoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMadoan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMadoan.setEnabled(false);

        txtSLKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSLKH.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSLKH.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(48, 48, 48)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMatour, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                    .addComponent(txtSLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMadoan, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDoanhthu1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtChiphi1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLoinhuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatour, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoanhthu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtChiphi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLoinhuan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMadoan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSLNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoanhthu1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtChiphi1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLoinhuan1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMouseClicked
        int selectedIndex = tblTour.getSelectedRow();
        TourDTO t = tourList.get(selectedIndex); 
        txtMatour.setText(t.getMatour());
        String matour = txtMatour.getText();
        String kq = String.valueOf(ThongKeDAL.thongkedoanhthuTour(matour));
        txtDoanhthu.setText(kq);
        String kq1 = String.valueOf(ThongKeDAL.thongkedchiphiTour(matour));
        txtChiphi.setText(kq1);
        String kq2 = String.valueOf(ThongKeDAL.thongkedoanhthuTour(matour) - ThongKeDAL.thongkedchiphiTour(matour));
        txtLoinhuan.setText(kq2);
        
        showDoanfromTour(matour);
        
    }//GEN-LAST:event_tblTourMouseClicked

    private void tblDoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoanMouseClicked
        // TODO add your handling code here:
        int selectedIndex1 = tblDoan.getSelectedRow();
        DoanDTO d = doanList.get(selectedIndex1); 
        txtMadoan.setText(d.getMadoan());
        String madoan = txtMadoan.getText();
        String kqq = String.valueOf(ThongKeDAL.thongkedoanhthuDoan(madoan));
        txtDoanhthu1.setText(kqq);
        String kqq1 = String.valueOf(ThongKeDAL.thongkedchiphiDoan(madoan));
        txtChiphi1.setText(kqq1);    
        String kqq2 = String.valueOf(ThongKeDAL.thongkedoanhthuDoan(madoan) - ThongKeDAL.thongkedchiphiDoan(madoan));
        txtLoinhuan1.setText(kqq2);
        String kqq3 = String.valueOf(ThongKeDAL.thongkedsoluongKH(madoan));
        txtSLKH.setText(kqq3);
        String kqq4 = String.valueOf(ThongKeDAL.thongkedsoluongNV(madoan));
        txtSLNV.setText(kqq4);
    }//GEN-LAST:event_tblDoanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDoan;
    private javax.swing.JTable tblTour;
    private javax.swing.JTextField txtChiphi;
    private javax.swing.JTextField txtChiphi1;
    private javax.swing.JTextField txtDoanhthu;
    private javax.swing.JTextField txtDoanhthu1;
    private javax.swing.JTextField txtLoinhuan;
    private javax.swing.JTextField txtLoinhuan1;
    private javax.swing.JTextField txtMadoan;
    private javax.swing.JTextField txtMatour;
    private javax.swing.JTextField txtSLKH;
    private javax.swing.JTextField txtSLNV;
    // End of variables declaration//GEN-END:variables
}

package GUI;


import BLL.DoanBLL;
import BLL.TourBLL;
import DTO.DoanDTO;
import DTO.TourDTO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Panel_Doan extends javax.swing.JPanel {

    List<TourDTO> tourList;
    List<DoanDTO> doanList;
    DefaultTableModel dtmtour, dtmdoan;
    
    public Panel_Doan() {
        initComponents();
        this.setBounds(0, 0, 786, 632);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        dtmtour = (DefaultTableModel) tblTour.getModel();
        dtmdoan = (DefaultTableModel) tblDoan.getModel();
        showTour();
        showDoan();
        TimKiem();
    }
    
    private void showDoan() {     
        doanList = DoanBLL.loadDataDoan();
        
        dtmdoan.setRowCount(0);
        
        doanList.forEach((DoanDTO) -> {
            dtmdoan.addRow(new Object[] {DoanDTO.getMadoan(), DoanDTO.getMatour(), DoanDTO.getTendoan(), DoanDTO.getNgaydi(), DoanDTO.getNgayve(), DoanDTO.getChitietchuongtrinh()
                });
        });
    }
    

    
    private void showTour() {
        tourList = TourBLL.loadDataTour();
        
        dtmtour.setRowCount(0);
        
        tourList.forEach((TourDTO) -> {
            dtmtour.addRow(new Object[] {TourDTO.getMatour(), TourDTO.getTentour(), TourDTO.getMadd(), TourDTO.getMota()
                });
        });
    }
    
    void TimKiem(){
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblDoan.getModel());
        tblDoan.setRowSorter(rowSorter);
        txtTimkiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String text = txtTimkiem.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String text = txtTimkiem.getText();
                if (text.length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMatour = new javax.swing.JTextField();
        txtMadoan = new javax.swing.JTextField();
        txtTendoan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoan = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaChitiet = new javax.swing.JTextArea();
        btnSua = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTour = new javax.swing.JTable();
        btnLamMoi = new javax.swing.JButton();
        dcNgaydi = new com.toedter.calendar.JDateChooser();
        dcNgayve = new com.toedter.calendar.JDateChooser();

        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setPreferredSize(new java.awt.Dimension(786, 629));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mã Tour:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã đoàn:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tên đoàn:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày đi:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ngày về:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Chi tiết chương trình:");

        txtMatour.setEnabled(false);

        tblDoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã đoàn", "Mã tour", "Tên đoàn", "Ngày đi", "Ngày về", "Chi tiết"
            }
        ));
        tblDoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDoanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDoan);

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("Đoàn du lịch");

        txtaChitiet.setColumns(20);
        txtaChitiet.setRows(5);
        jScrollPane3.setViewportView(txtaChitiet);

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Tìm kiếm:");

        tblTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Tour", "Tên Tour", "Mã địa điểm", "Mô tả"
            }
        ));
        tblTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTourMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTour);

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        dcNgaydi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        dcNgayve.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTendoan)
                            .addComponent(dcNgayve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMadoan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dcNgaydi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(txtMatour, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMadoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTendoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcNgaydi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(txtMatour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(dcNgayve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:      
        boolean isOK=true;
        if(txtMadoan.getText().length() > 0){
            for (DoanDTO d : doanList) {
                if(d.getMadoan().matches(txtMadoan.getText())){
                    JOptionPane.showMessageDialog(btnLamMoi, "Mã Đoàn không được trùng");
                    isOK=false;
                    txtMadoan.setText("");
                }
            }
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        DoanDTO d = new DoanDTO();
        d.setMadoan(txtMadoan.getText());
        d.setMatour(txtMatour.getText());
        d.setTendoan(txtTendoan.getText());
        d.setNgaydi(sdf.format(dcNgaydi.getDate()));
        d.setNgayve(sdf.format(dcNgayve.getDate()));
        d.setChitietchuongtrinh(txtaChitiet.getText());
        DoanBLL.addDoan(d);
        JOptionPane.showMessageDialog(null, "Thêm thành công");
        showDoan(); 
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblDoan.getSelectedRow();
        if(selectedIndex >= 0) {
            DoanDTO d = doanList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa?");
            if(option == 0) {
                DoanBLL.removeDoan(d.getMadoan());
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                showDoan();                              
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String madoan = txtMadoan.getText();
        String matour = txtMatour.getText();
        String tendoan = txtTendoan.getText();               
        String ngaydi = sdf.format(dcNgaydi.getDate());
        String ngayve = sdf.format(dcNgayve.getDate());
        String chitiet = txtaChitiet.getText();

        DoanDTO d = new DoanDTO(madoan, matour, tendoan, ngaydi, ngayve, chitiet);
        DoanBLL.editDoan(d, madoan);
        JOptionPane.showMessageDialog(null, "Sửa thành công");
        showDoan();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        txtMadoan.setText("");
        txtMatour.setText("");
        txtTendoan.setText("");
        dcNgaydi.setCalendar(null);
        dcNgayve.setCalendar(null);      
        txtaChitiet.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMouseClicked
        // TODO add your handling code here:
        int selectedIndex = tblTour.getSelectedRow();
        TourDTO t = tourList.get(selectedIndex); 
        txtMatour.setText(t.getMatour());
    }//GEN-LAST:event_tblTourMouseClicked

    private void tblDoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDoanMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        int selectedIndex = tblDoan.getSelectedRow();
        DoanDTO d = doanList.get(selectedIndex); 
        txtMadoan.setText(d.getMadoan());
        txtMatour.setText(d.getMatour());
        txtTendoan.setText(d.getTendoan()); 
        try {
            dcNgaydi.setDate(sdf.parse(d.getNgaydi()));
            dcNgayve.setDate(sdf.parse(d.getNgayve()));
        } catch (ParseException ex) {
            Logger.getLogger(Panel_Doan.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtaChitiet.setText(d.getChitietchuongtrinh());
    }//GEN-LAST:event_tblDoanMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private com.toedter.calendar.JDateChooser dcNgaydi;
    private com.toedter.calendar.JDateChooser dcNgayve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDoan;
    private javax.swing.JTable tblTour;
    private javax.swing.JTextField txtMadoan;
    private javax.swing.JTextField txtMatour;
    private javax.swing.JTextField txtTendoan;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextArea txtaChitiet;
    // End of variables declaration//GEN-END:variables
}

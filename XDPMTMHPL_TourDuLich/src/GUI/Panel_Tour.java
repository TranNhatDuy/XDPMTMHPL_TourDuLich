/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.TourBLL;
import DTO.TourDTO;
import BLL.DiaDiemBLL;
import DAL.TourDAL;
import DTO.DiaDiemDTO;
import java.awt.Color;
import static java.lang.Math.random;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
public class Panel_Tour extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Tour
     */
    List<TourDTO> tourList;
    List<DiaDiemDTO> ddList;
    DefaultTableModel dtmtour, dtmdd;

    public Panel_Tour() {
        initComponents();
        this.setBounds(0, 0, 786, 632);
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        dtmtour = (DefaultTableModel) tblTour.getModel();
        dtmdd = (DefaultTableModel) tblDd.getModel();
        showTour();
        showDiadiem();
        TimKiem();
    }

    private void showDiadiem() {
        ddList = DiaDiemBLL.loadDataDiaDiem();

        dtmdd.setRowCount(0);

        ddList.forEach((DiaDiemDTO) -> {
            dtmdd.addRow(new Object[]{DiaDiemDTO.getMadd(), DiaDiemDTO.getThanhpho(), DiaDiemDTO.getTendd(), DiaDiemDTO.getMota()
            });
        });
    }

    private void showTour() {
        tourList = TourBLL.loadDataTour();

        dtmtour.setRowCount(0);

        tourList.forEach((TourDTO) -> {
            dtmtour.addRow(new Object[]{TourDTO.getMatour(), TourDTO.getTentour(), TourDTO.getMadd(), TourDTO.getMota()
            });
        });
    }

    void TimKiem() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblTour.getModel());
        tblTour.setRowSorter(rowSorter);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTour = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTentour = new javax.swing.JTextField();
        txtMadd = new javax.swing.JTextField();
        txtMatour = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDd = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txpMota = new javax.swing.JTextPane();

        setPreferredSize(new java.awt.Dimension(786, 632));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("QUẢN LÝ TOUR");

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Tên Tour:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã địa điểm:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Mô tả:");

        txtTentour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTentour.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtMadd.setEditable(false);
        txtMadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMadd.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtMatour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMatour.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseClicked(evt);
            }
        });
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm");

        tblDd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDd.setModel(new javax.swing.table.DefaultTableModel(
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
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDdMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDd);

        txpMota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(txpMota);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTentour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txtMatour, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(27, 27, 27)
                        .addComponent(txtMadd, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 548, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatour, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTentour, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        boolean isOK = true;
        if (txtMatour.getText().length() > 0) {
            for (TourDTO t : tourList) {
                Random rand = new Random();
                int i = rand.nextInt(10000) + 1;
                if (t.getMatour().matches(txtMatour.getText())) {
                    JOptionPane.showMessageDialog(this, "Mã tour không được trùng");
                    isOK = false;
                    txtMatour.setText(txtMatour.getText() + Integer.toString(i));
                } else {
                }
            }
            if (isOK == true) {
                TourDTO t = new TourDTO();
                t.setMatour(txtMatour.getText());
                t.setTentour(txtTentour.getText());
                t.setMadd(txtMadd.getText());
                t.setMota(txpMota.getText());
                TourBLL.addTour(t);
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                showTour();
            }
        }

//        else{
//            TourDTO t = new TourDTO();
//            t.setMatour(txtMatour.getText());
//            t.setTentour(txtTentour.getText());
//            t.setMadd(txtMadd.getText());
//            t.setMota(txpMota.getText());
//            TourBLL.addTour(t);
//            JOptionPane.showMessageDialog(this, "Thêm thành công");
//            showTour();
//        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMouseClicked
        int selectedIndex = tblTour.getSelectedRow();
        TourDTO t = tourList.get(selectedIndex);
        txtMatour.setText(t.getMatour());
        txtTentour.setText(t.getTentour());
        txtMadd.setText(t.getMadd());
        txpMota.setText(t.getMota());
    }//GEN-LAST:event_tblTourMouseClicked

    private void btnLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseClicked
        txtMatour.setText("");
        txtTentour.setText("");
        txtMadd.setText("");
        txpMota.setText("");
        tblTour.setRowSelectionAllowed(false);
        tblDd.setRowSelectionAllowed(false);
    }//GEN-LAST:event_btnLamMoiMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int selectedIndex = tblTour.getSelectedRow();
        if (selectedIndex >= 0) {
            TourDTO t = tourList.get(selectedIndex);

            int option = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?");
            if (option == 0) {
                TourBLL.removeTour(t.getMatour());
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                showTour();
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        String matour = txtMatour.getText();
        String tentour = txtTentour.getText();
        String madd = txtMadd.getText();
        String mota = txpMota.getText();

        TourDTO t = new TourDTO(matour, tentour, madd, mota);
        TourBLL.editTour(t, matour);
        JOptionPane.showMessageDialog(this, "Sửa thành công");
        showTour();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblDdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDdMouseClicked
        // TODO add your handling code here:
        int selectedIndex = tblDd.getSelectedRow();
        DiaDiemDTO dd = ddList.get(selectedIndex);
        txtMadd.setText(dd.getMadd());

    }//GEN-LAST:event_tblDdMouseClicked


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
    private javax.swing.JTable tblDd;
    private javax.swing.JTable tblTour;
    private javax.swing.JTextPane txpMota;
    private javax.swing.JTextField txtMadd;
    private javax.swing.JTextField txtMatour;
    private javax.swing.JTextField txtTentour;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import BLL.ChiPhiBLL;
import BLL.DoanBLL;
import DAL.ChiPhiDAL;
import DTO.ChiPhiDTO;
import DTO.DoanDTO;
import java.awt.Color;
import java.util.ArrayList;
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
public class Panel_ChiPhi extends javax.swing.JPanel {

    /**
     * Creates new form Panel_ChiPhi
     */
    private ArrayList<ChiPhiDTO> cpList;
    private ArrayList<DoanDTO> dList;
    private DefaultTableModel dtmcp, dtmd;
    
    public Panel_ChiPhi() {
        initComponents();
        this.setBounds(0, 0, 786, 632);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        dtmcp = (DefaultTableModel) tblCP.getModel();
        dtmd = (DefaultTableModel) tblD.getModel();
        ShowChiPhi();
        ShowDoan();
        TimKiemChiPhi();
        
    }
    
    public void ShowChiPhi(){
        cpList =  new ChiPhiBLL().loadDataChiPhi();
        
        dtmcp.setRowCount(0);
        cpList.forEach((ChiPhiDTO) -> {
            dtmcp.addRow(new Object[] {ChiPhiDTO.getMaCP(), ChiPhiDTO.getMaDoan(), 
                ChiPhiDTO.getTongCP(), ChiPhiDTO.getChiTiet()});
        });
    }
    
    public void ShowDoan(){
        dList =  new DoanBLL().loadDataDoan();
        
        dtmd.setRowCount(0);
        dList.forEach((DoanDTO) -> {
            dtmd.addRow(new Object[] {DoanDTO.getMadoan(), DoanDTO.getMatour(), 
                DoanDTO.getTendoan(), DoanDTO.getNgaydi(), DoanDTO.getNgayve(), 
                DoanDTO.getChitietchuongtrinh()});
        });
    }
//    private void ShowDoan() {
//        dList = DoanBLL.loadDataDoan();
//        dtmd.setRowCount(0);
//        for (DoanDTO d : dList) {
//            dtmd.addRow(new Object[]{
//               d.getMadoan(), d.getMatour(), d.getTendoan(),d.getNgaydi(),d.getNgayve(),d.getChitietchuongtrinh()
//            });
//        }
//    }
    
    public void TimKiemChiPhi(){
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblCP.getModel());
        tblCP.setRowSorter(rowSorter);
        txtTimKiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String text = txtTimKiem.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String text = txtTimKiem.getText();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblD = new javax.swing.JTable();
        txtTongCP = new javax.swing.JTextField();
        txtMaCP = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChiTiet = new javax.swing.JTextPane();
        txtMaDoan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCP = new javax.swing.JTable();
        btnLamMoi = new javax.swing.JButton();

        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(786, 629));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("CHI PH??");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("T??m ki???m:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("M?? ??o??n: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("T???ng chi ph??:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Chi ti???t:");

        tblD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "M?? ??o??n", "M?? tour", "T??n ??o??n", "Ng??y ??i", "Ng??y v???", "Chi ti???t ch????ng tr??nh"
            }
        ));
        tblD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblD);

        txtTongCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTongCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongCPActionPerformed(evt);
            }
        });

        txtMaCP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaCPActionPerformed(evt);
            }
        });

        txtChiTiet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(txtChiTiet);

        txtMaDoan.setEditable(false);
        txtMaDoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDoanActionPerformed(evt);
            }
        });

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("M?? chi ph??:");

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        tblCP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "M?? chi ph??", "M?? ??o??n", "T???ng chi ph??", "Chi ti???t"
            }
        ));
        tblCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCPMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCP);

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLamMoi.setText("L??m m???i");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTongCP, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(txtMaCP, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMaDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(98, 98, 98)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTongCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtMaDoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTongCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongCPActionPerformed

    private void txtMaCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaCPActionPerformed

    private void txtMaDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDoanActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        boolean isOK=true;
        if(txtMaCP.getText().length()>0){
            Random rand = new Random();
            int i = rand.nextInt(10000) +1;
            for(ChiPhiDTO c : cpList){
                if(c.getMaCP().matches(txtMaCP.getText())){
                    JOptionPane.showMessageDialog(this, "M?? chi ph?? kh??ng ???????c tr??ng");
                    isOK=false;
                    txtMaCP.setText(txtMaCP.getText() + Integer.toString(i));
                }
            }
        }
        ChiPhiDTO cp = new ChiPhiDTO();
        cp.setMaCP(txtMaCP.getText());
        cp.setMaDoan(txtMaDoan.getText());
        cp.setTongCP(Integer.valueOf(txtTongCP.getText()));
        cp.setChiTiet(txtChiTiet.getText());          
        ChiPhiBLL.addChiPhi(cp);
        JOptionPane.showMessageDialog(this, "Th??m th??nh c??ng");
        ShowChiPhi();
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String macp = txtMaCP.getText();
        int option = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n x??a?");
        if(option == 0) {
            ChiPhiBLL.removeChiPhi(macp);
            JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
            ShowChiPhi();                              
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        ChiPhiDTO cp = new ChiPhiDTO();
        cp.setMaCP(txtMaCP.getText());
        cp.setMaDoan(txtMaDoan.getText());
        cp.setTongCP(Integer.valueOf(txtTongCP.getText()));
        cp.setChiTiet(txtChiTiet.getText()); 
     
        ChiPhiBLL.editChiPhi(cp);
        JOptionPane.showMessageDialog(this, "S???a th??nh c??ng");
        ShowChiPhi();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtMaCP.setText("");
        txtMaDoan.setText("");
        txtTongCP.setText("");
        txtChiTiet.setText("");
        tblCP.setRowSelectionAllowed(false);
        tblD.setRowSelectionAllowed(false);
               
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tblCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCPMouseClicked
        int indexTour = tblCP.getSelectedRow();
        txtMaCP.setText(dtmcp.getValueAt(indexTour, 0).toString());
        txtMaDoan.setText(dtmcp.getValueAt(indexTour, 1).toString());
        txtTongCP.setText(dtmcp.getValueAt(indexTour, 2).toString());
        txtChiTiet.setText(dtmcp.getValueAt(indexTour, 3).toString());
    }//GEN-LAST:event_tblCPMouseClicked

    private void tblDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDMouseClicked
        int indexTour = tblD.getSelectedRow();
        txtMaDoan.setText(dtmd.getValueAt(indexTour, 0).toString());
    }//GEN-LAST:event_tblDMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCP;
    private javax.swing.JTable tblD;
    private javax.swing.JTextPane txtChiTiet;
    private javax.swing.JTextField txtMaCP;
    private javax.swing.JTextField txtMaDoan;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongCP;
    // End of variables declaration//GEN-END:variables
}

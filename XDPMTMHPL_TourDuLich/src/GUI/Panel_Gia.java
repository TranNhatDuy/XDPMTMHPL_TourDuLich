package GUI;

import BLL.GiaBLL;
import BLL.TourBLL;
import DAL.KhachHangDAL;
import DAL.MySQLConnect;
import DTO.GiaDTO;
import DTO.KhachHangDTO;
import DTO.TourDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Panel_Gia extends javax.swing.JPanel {

    private DefaultTableModel modelgia;
    private List<GiaDTO> gia;

    private DefaultTableModel modeltour;
    private List<TourDTO> tour;

    public Panel_Gia() {

        initComponents();
//        this.setSize(672,496);

        this.setBounds(0, 0, 786, 632);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        modelgia = (DefaultTableModel) tblGia.getModel();
        gia = new ArrayList<>();

        modeltour = (DefaultTableModel) tblTour.getModel();
        tour = new ArrayList<>();

        TimKiemGia();
        ShowGia();
        ShowTour();
        BlockText();

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

        jdcTuNgay = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTour = new javax.swing.JTable();
        jdcDenNgay = new com.toedter.calendar.JDateChooser();
        txtMaTour = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtThem = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jbtXoa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jbtSua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnLammoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTimGia = new javax.swing.JTextField();
        txtMaGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGia = new javax.swing.JTable();
        txtGia = new javax.swing.JTextField();
        txtSoNgay = new javax.swing.JTextField();
        btTinhNgay = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(786, 629));

        jdcTuNgay.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdcTuNgayAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jdcTuNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcTuNgayMouseClicked(evt);
            }
        });

        tblTour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Tour", "Mã Địa Điểm"
            }
        ));
        tblTour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTourMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTour);

        jdcDenNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcDenNgayMouseClicked(evt);
            }
        });

        jLabel3.setText("Giá:");

        jLabel4.setText("Từ Ngày:");

        jbtThem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtThem.setText("Thêm");
        jbtThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtThemActionPerformed(evt);
            }
        });

        jLabel5.setText("Mã Tour:");

        jbtXoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtXoa.setText("Xoá");
        jbtXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtXoaActionPerformed(evt);
            }
        });

        jLabel6.setText("Mã Giá:");

        jbtSua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtSua.setText("Sửa");
        jbtSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Gía Tour");

        jLabel7.setText("Đến Ngày:");

        btnLammoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLammoi.setText("Làm Mới");
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tìm kiếm:");

        txtMaGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaGiaActionPerformed(evt);
            }
        });

        tblGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Giá", "Mã Tour", "Giá", "Từ Ngày", "Đến Ngày", "Số Ngày"
            }
        ));
        tblGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGia);

        btTinhNgay.setText("Tính ngày");
        btTinhNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTinhNgayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimGia, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel3)))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btTinhNgay)
                                                .addGap(18, 18, 18)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMaTour, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(txtMaGia, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jdcDenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jdcTuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtSua, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtMaTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jdcTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jdcDenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTinhNgay))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    void EnableText() {
        jdcDenNgay.setEnabled(false);
        txtSoNgay.setEnabled(false);
        btTinhNgay.setEnabled(false);
    }

    void BlockText() {
        txtMaTour.setEditable(false);
        txtMaGia.setEditable(false);
        txtSoNgay.setEditable(false);
    }

    public void ShowTour() {
        tour = new TourBLL().loadDataTour();
        modeltour.setRowCount(0);
        for (TourDTO t : tour) {
            modeltour.addRow(new Object[]{
                t.getMatour(), t.getMadd()
            });
        }
    }

    void ShowGia() {
        gia = new GiaBLL().loadDataGia();
        modelgia.setRowCount(0);
        for (GiaDTO g : gia) {
            modelgia.addRow(new Object[]{
                g.getMagia(), g.getMatour(), g.getSotien(), g.getTungay(), g.getDenngay(), g.getSongay()
            });
        }
    }

    void TimKiemGia() {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(tblGia.getModel());
        tblGia.setRowSorter(rowSorter);
        txtTimGia.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                String text = txtTimGia.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                String text = txtTimGia.getText();
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

    void Reset() {
        txtMaGia.setText("");
        txtMaTour.setText("");
        txtGia.setText(null);
        jdcTuNgay.setCalendar(null);
        jdcDenNgay.setCalendar(null);
        txtTimGia.setText("");
        tblTour.setRowSelectionAllowed(false);
        tblGia.setRowSelectionAllowed(false);
        txtSoNgay.setText("");
    }

    private void tblTourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTourMouseClicked
        int index_tour = tblTour.getSelectedRow();
        if (index_tour == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng trong bảng để hiển thị");
        } else {
            txtMaTour.setText(modeltour.getValueAt(index_tour, 0).toString().trim());
            txtMaGia.setEditable(true);
        }
    }//GEN-LAST:event_tblTourMouseClicked

    private void jbtThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtThemActionPerformed
        int index_tour = tblTour.getSelectedRow();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String magia = txtMaGia.getText();
        int sotien = Integer.parseInt(txtGia.getText());
        String tungay = sdf.format(jdcTuNgay.getDate());
        String denngay = sdf.format(jdcDenNgay.getDate());
        String matour = txtMaTour.getText();
        int songay = Integer.parseInt(txtSoNgay.getText());

        Boolean isOK = true;

        if (magia.length() == 0) {
            JOptionPane.showMessageDialog(this, "Mã giá không được để trống");
            isOK = false;
        }
//        else if(sotien == 0 || String.valueOf(sotien).length()==0 ) {
//            JOptionPane.showMessageDialog(this, "Số tiền không được để trống");
//            isOK=false;
//        }
//        sdf.setLenient(false);
//        try {
//           sdf.parse(tungay);
//           sdf.parse(denngay);
//        } catch (Exception e) {
//        JOptionPane.showMessageDialog(this,"Từ ngày , đến ngày không hợp lệ");
//        }
        if (magia.length() > 0) {
            for (GiaDTO g : gia) {
                if (g.getMagia().matches(magia)) {
                    JOptionPane.showMessageDialog(this, "Mã giá không được trùng");
                    isOK = false;
                    txtMaGia.setText("");
                    txtMaGia.setEditable(true);
                }
            }
        }
        if (isOK) {
            GiaDTO g = new GiaDTO();
            g.setMagia(magia);
            g.setMatour(matour);
            g.setSotien(sotien * songay);
            g.setTungay(tungay);
            g.setDenngay(denngay);
            g.setSongay(sotien);
            new GiaBLL().addGia(g);
            JOptionPane.showMessageDialog(this, "Thêm thành công giá");
            Reset();
            ShowGia();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm không thành công");
        }
    }//GEN-LAST:event_jbtThemActionPerformed

    private void jbtXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtXoaActionPerformed
        int indexGia = tblGia.getSelectedRow();
        String data = modelgia.getValueAt(indexGia, 0).toString();
        if (indexGia >= 0) {
            if (JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá không") == 0) {
                GiaDTO g = new GiaDTO();
                new GiaBLL().removeGia(g, data);
                JOptionPane.showMessageDialog(this, "Xoá thành công");
                Reset();
                ShowGia();
            } else {
                JOptionPane.showMessageDialog(this, "Xoá không thành công");
            }
        }
    }//GEN-LAST:event_jbtXoaActionPerformed

    private void jbtSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSuaActionPerformed
        int indexGia = tblGia.getSelectedRow();
        String data = modelgia.getValueAt(indexGia, 0).toString();

        if (indexGia >= 0) {
            GiaDTO g = new GiaDTO();
            g.setMagia(txtMaGia.getText());
            g.setMatour(txtMaTour.getText());
            g.setSotien(Integer.parseInt(txtGia.getText()) * Integer.parseInt(txtSoNgay.getText()));
            g.setTungay(new SimpleDateFormat("yyyy-MM-dd").format(jdcTuNgay.getDate()));
            g.setDenngay(new SimpleDateFormat("yyyy-MM-dd").format(jdcDenNgay.getDate()));
            g.setSongay(Integer.parseInt(txtSoNgay.getText()));
            if (JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa không") == 0) {
                new GiaBLL().editGia(g, data);
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                Reset();
                ShowGia();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa không thành công");
            }
        }
    }//GEN-LAST:event_jbtSuaActionPerformed

    private void tblGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGiaMouseClicked
        int index = tblGia.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng trong bảng để hiển thị");
        } else {
            txtMaGia.setText(modelgia.getValueAt(index, 0).toString().trim());
            txtMaTour.setText(modelgia.getValueAt(index, 1).toString().trim());
            txtGia.setText(modelgia.getValueAt(index, 2).toString().trim());
            try {
                jdcTuNgay.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) modelgia.getValueAt(index, 3)));
                jdcDenNgay.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) modelgia.getValueAt(index, 4)));
            } catch (Exception e) {
                e.printStackTrace();
            }
            txtSoNgay.setText(modelgia.getValueAt(index, 5).toString().trim());
        }
    }//GEN-LAST:event_tblGiaMouseClicked

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void txtMaGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaGiaActionPerformed

    private void jdcTuNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcTuNgayMouseClicked

    }//GEN-LAST:event_jdcTuNgayMouseClicked

    private void jdcDenNgayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcDenNgayMouseClicked

    }//GEN-LAST:event_jdcDenNgayMouseClicked

    private void jdcTuNgayAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdcTuNgayAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jdcTuNgayAncestorAdded

    private void btTinhNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTinhNgayActionPerformed
        String tungay = new SimpleDateFormat("yyyy-MM-dd").format(jdcTuNgay.getDate());
        String denngay = new SimpleDateFormat("yyyy-MM-dd").format(jdcDenNgay.getDate());
        Date tn = null, dn = null;
        try {
            tn = new SimpleDateFormat("yyyy-MM-dd").parse(tungay);
            dn = new SimpleDateFormat("yyyy-MM-dd").parse(denngay);
        } catch (ParseException ex) {
            Logger.getLogger(Panel_Gia.class.getName()).log(Level.SEVERE, null, ex);
        }
        long tn1 = tn.getTime();
        long tn2 = dn.getTime();
        long kq = Math.abs(tn2 - tn1);
        long songay = kq / (24 * 60 * 60 * 1000);
        txtSoNgay.setText(String.valueOf(songay));
    }//GEN-LAST:event_btTinhNgayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTinhNgay;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtSua;
    private javax.swing.JButton jbtThem;
    private javax.swing.JButton jbtXoa;
    private com.toedter.calendar.JDateChooser jdcDenNgay;
    private com.toedter.calendar.JDateChooser jdcTuNgay;
    private javax.swing.JTable tblGia;
    private javax.swing.JTable tblTour;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaGia;
    private javax.swing.JTextField txtMaTour;
    private javax.swing.JTextField txtSoNgay;
    private javax.swing.JTextField txtTimGia;
    // End of variables declaration//GEN-END:variables
}

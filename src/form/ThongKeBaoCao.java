/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import dao.DAO;
import dao.Function;
import form.HomePage;
import javax.swing.table.DefaultTableModel;
import model.CongViec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Acer
 */
public class ThongKeBaoCao extends javax.swing.JFrame {

    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatDate2 = new SimpleDateFormat("yyyy-MM-dd");
    DAO dao = new DAO();
    /**
     * Creates new form ThongKeBaoCao
     */
    private String User;
    private String Pass;
    private HomePage home;
    
    public ThongKeBaoCao() {
        initComponents();
        fillTable();
        fillTable2();
    }

    //hiển thị dữ liệu của những công việc đã hoàn thành 
    public void fillTable() {
        DefaultTableModel tbModel = (DefaultTableModel) tbCVHT.getModel();
        tbModel.setRowCount(0);
        for (CongViec cv : dao.CongViecDaHoanThanh((String) (txtDaHoanThanh.getSelectedItem()))) {
            Object dataRow[] = new Object[7];
            dataRow[0] = cv.getID();
            dataRow[1] = cv.getTenCongViec();
            dataRow[2] = formatDate.format(cv.getNgayKhoiTao());
            dataRow[3] = formatDate.format(cv.getNgayHetHan());
            dataRow[4] = cv.getNgayHoanThanh();
            dataRow[5] = cv.getMoTaCongViec();
            dataRow[6] = cv.getTrangThai();
            tbModel.addRow(dataRow);
        }
    }

    //Hiển thị dữ liệu những công việc đã quá hạn
    public void fillTable2() {
        DefaultTableModel tbModel = (DefaultTableModel) tbCVQH.getModel();
        tbModel.setRowCount(0);
        for (CongViec cv : dao.CongViecDaHoanThanh((String) (txtDaQuaHan.getSelectedItem()))) {
            Object dataRow[] = new Object[7];
            dataRow[0] = cv.getID();
            dataRow[1] = cv.getTenCongViec();
            dataRow[2] = formatDate.format(cv.getNgayKhoiTao());
            dataRow[3] = formatDate.format(cv.getNgayHetHan());
            dataRow[4] = cv.getNgayHoanThanh();

            dataRow[5] = cv.getMoTaCongViec();
            dataRow[6] = cv.getTrangThai();
            tbModel.addRow(dataRow);
        }
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
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNgayBatDau = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        txtDaHoanThanh = new javax.swing.JComboBox<>();
        btnTimCVHT = new javax.swing.JButton();
        btnInCVHT = new javax.swing.JButton();
        btnLamMoiHT = new javax.swing.JButton();
        JScrollPane1 = new javax.swing.JScrollPane();
        tbCVHT = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNgayBatDau2 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtNgayKetThuc2 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txtDaQuaHan = new javax.swing.JComboBox<>();
        btnTimCVQH = new javax.swing.JButton();
        btnInCVQH = new javax.swing.JButton();
        btnLamMoiQH = new javax.swing.JButton();
        JScrollPane2 = new javax.swing.JScrollPane();
        tbCVQH = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thống Kê & Báo Cáo");

        jPanel1.setBackground(new java.awt.Color(204, 220, 225));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Statistics.png"))); // NOI18N
        jLabel1.setText("Thống Kê & Báo Cáo");

        btnBack.setBackground(new java.awt.Color(204, 220, 225));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back-arrow.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Từ ngày");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Đến ngày");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Trạng thái");

        txtDaHoanThanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã hoàn thành" }));
        txtDaHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDaHoanThanhActionPerformed(evt);
            }
        });

        btnTimCVHT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimCVHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xemdiem.png"))); // NOI18N
        btnTimCVHT.setText("Tìm kiếm");
        btnTimCVHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimCVHTActionPerformed(evt);
            }
        });

        btnInCVHT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInCVHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer.png"))); // NOI18N
        btnInCVHT.setText("In");
        btnInCVHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInCVHTActionPerformed(evt);
            }
        });

        btnLamMoiHT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiHT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resetvip.png"))); // NOI18N
        btnLamMoiHT.setText("Làm mới");
        btnLamMoiHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiHTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDaHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInCVHT, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLamMoiHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimCVHT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgayBatDau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDaHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTimCVHT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoiHT)
                    .addComponent(btnInCVHT))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tbCVHT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Công Việc", "Ngày Khởi Tạo", "Ngày Kết Thúc", "Ngày Hoàn Thành", "Mô Tả Công Việc", "Trạng Thái"
            }
        ));
        JScrollPane1.setViewportView(tbCVHT);
        if (tbCVHT.getColumnModel().getColumnCount() > 0) {
            tbCVHT.getColumnModel().getColumn(0).setMinWidth(5);
            tbCVHT.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbCVHT.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbCVHT.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Danh sách công việc đã hoàn thành", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Từ ngày");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Đến ngày");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Trạng thái");

        txtDaQuaHan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đã quá hạn" }));
        txtDaQuaHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDaQuaHanActionPerformed(evt);
            }
        });

        btnTimCVQH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimCVQH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xemdiem.png"))); // NOI18N
        btnTimCVQH.setText("Tìm kiếm");
        btnTimCVQH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimCVQHActionPerformed(evt);
            }
        });

        btnInCVQH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInCVQH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer.png"))); // NOI18N
        btnInCVQH.setText("In");
        btnInCVQH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInCVQHActionPerformed(evt);
            }
        });

        btnLamMoiQH.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoiQH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/resetvip.png"))); // NOI18N
        btnLamMoiQH.setText("Làm mới");
        btnLamMoiQH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiQHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayBatDau2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNgayKetThuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInCVQH, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDaQuaHan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTimCVQH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoiQH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnTimCVQH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNgayKetThuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDaQuaHan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtNgayBatDau2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLamMoiQH)
                    .addComponent(btnInCVQH))
                .addContainerGap())
        );

        JScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tbCVQH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên Công Việc", "Ngày Khởi Tạo", "Ngày Kết Thúc", "Ngày Hoàn Thành", "Mô Tả Công Việc", "Trạng Thái"
            }
        ));
        JScrollPane2.setViewportView(tbCVQH);
        if (tbCVQH.getColumnModel().getColumnCount() > 0) {
            tbCVQH.getColumnModel().getColumn(0).setMinWidth(5);
            tbCVQH.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbCVQH.getColumnModel().getColumn(1).setPreferredWidth(200);
            tbCVQH.getColumnModel().getColumn(1).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JScrollPane2)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Danh sách công việc đã quá hạn", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage(User, Pass);
        this.setVisible(false);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDaHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDaHoanThanhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDaHoanThanhActionPerformed

    private void txtDaQuaHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDaQuaHanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDaQuaHanActionPerformed

    private void btnLamMoiHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiHTActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbModel = (DefaultTableModel) tbCVHT.getModel();
        tbModel.setRowCount(0);
        for (CongViec cv : dao.CongViecDaHoanThanh((String) (txtDaHoanThanh.getSelectedItem()))) {
            Object dataRow[] = new Object[7];
            dataRow[0] = cv.getID();
            dataRow[1] = cv.getTenCongViec();
            dataRow[2] = formatDate.format(cv.getNgayKhoiTao());
            dataRow[3] = formatDate.format(cv.getNgayHetHan());
            dataRow[4] = cv.getNgayHoanThanh();
            dataRow[5] = cv.getMoTaCongViec();
            dataRow[6] = cv.getTrangThai();
            tbModel.addRow(dataRow);
        }
    }//GEN-LAST:event_btnLamMoiHTActionPerformed

    private void btnTimCVHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimCVHTActionPerformed
        // TODO add your handling code here:
        String nbd = formatDate2.format(txtNgayBatDau.getDate());
        String nkt = formatDate2.format(txtNgayKetThuc.getDate());
        DefaultTableModel tbModel = (DefaultTableModel) tbCVHT.getModel();
        tbModel.setRowCount(0);
        for (CongViec cv : dao.TimCongViecQuaTrangThai((String) (txtDaHoanThanh.getSelectedItem()), nbd, nkt)) {
            Object dataRow[] = new Object[7];
            dataRow[0] = cv.getID();
            dataRow[1] = cv.getTenCongViec();
            dataRow[2] = formatDate.format(cv.getNgayKhoiTao());
            dataRow[3] = formatDate.format(cv.getNgayHetHan());
            dataRow[4] = cv.getNgayHoanThanh();
            dataRow[5] = cv.getMoTaCongViec();
            dataRow[6] = cv.getTrangThai();
            tbModel.addRow(dataRow);
        }
    }//GEN-LAST:event_btnTimCVHTActionPerformed

    private void btnTimCVQHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimCVQHActionPerformed
        // TODO add your handling code here: 
        String nbd = formatDate2.format(txtNgayBatDau2.getDate());
        String nkt = formatDate2.format(txtNgayKetThuc2.getDate());
        DefaultTableModel tbModel = (DefaultTableModel) tbCVQH.getModel();
        tbModel.setRowCount(0);
        for (CongViec cv : dao.TimCongViecQuaTrangThai2((String) (txtDaQuaHan.getSelectedItem()), nbd, nkt)) {
            Object dataRow[] = new Object[7];
            dataRow[0] = cv.getID();
            dataRow[1] = cv.getTenCongViec();
            dataRow[2] = formatDate.format(cv.getNgayKhoiTao());
            dataRow[3] = formatDate.format(cv.getNgayHetHan());
            dataRow[4] = cv.getNgayHoanThanh();
            dataRow[5] = cv.getMoTaCongViec();
            dataRow[6] = cv.getTrangThai();
            tbModel.addRow(dataRow);
        }
    }//GEN-LAST:event_btnTimCVQHActionPerformed

    private void btnLamMoiQHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiQHActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tbModel = (DefaultTableModel) tbCVQH.getModel();
        tbModel.setRowCount(0);
        for (CongViec cv : dao.CongViecDaHoanThanh((String) (txtDaQuaHan.getSelectedItem()))) {
            Object dataRow[] = new Object[7];
            dataRow[0] = cv.getID();
            dataRow[1] = cv.getTenCongViec();
            dataRow[2] = formatDate.format(cv.getNgayKhoiTao());
            dataRow[3] = formatDate.format(cv.getNgayHetHan());
            dataRow[4] = cv.getNgayHoanThanh();
            dataRow[5] = cv.getMoTaCongViec();
            dataRow[6] = cv.getTrangThai();
            tbModel.addRow(dataRow);
        }
    }//GEN-LAST:event_btnLamMoiQHActionPerformed

    private void btnInCVHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInCVHTActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Bảng Thống Kê");
        MessageFormat footer = new MessageFormat("");

        try {
            tbCVHT.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnInCVHTActionPerformed

    private void btnInCVQHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInCVQHActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Bảng Thống Kê");
        MessageFormat footer = new MessageFormat("");

        try {
            tbCVQH.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnInCVQHActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeBaoCao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JScrollPane JScrollPane2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInCVHT;
    private javax.swing.JButton btnInCVQH;
    private javax.swing.JButton btnLamMoiHT;
    private javax.swing.JButton btnLamMoiQH;
    private javax.swing.JButton btnTimCVHT;
    private javax.swing.JButton btnTimCVQH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tbCVHT;
    private javax.swing.JTable tbCVQH;
    private javax.swing.JComboBox<String> txtDaHoanThanh;
    private javax.swing.JComboBox<String> txtDaQuaHan;
    private com.toedter.calendar.JDateChooser txtNgayBatDau;
    private com.toedter.calendar.JDateChooser txtNgayBatDau2;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc;
    private com.toedter.calendar.JDateChooser txtNgayKetThuc2;
    // End of variables declaration//GEN-END:variables
}

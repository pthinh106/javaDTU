/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlybanhang;

import backend.Account;
import backend.HangHoa;
import java.awt.List;
import java.beans.Visibility;
import java.io.File;
import java.io.FileWriter;
import java.text.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.sound.sampled.Line;
import javax.swing.JOptionPane;




/**
 *
 * @author ADMIN
 */
public class QLHH extends javax.swing.JFrame {

    /**
     * Creates new form QLHH
     */
    private static ArrayList<HangHoa> ListHH = new ArrayList<>();
    private ArrayList<Account> ListAC = new ArrayList<>();
    public static String UserLogin = new String();
    private JPanel childJPanel;
    public static int check;
    public QLHH() {
        initComponents();
        getAC();
        getdata();
        pnlChucnangAdmim1.setVisible(Boolean.FALSE);
        pnlChucNangAdmin2.setVisible(Boolean.FALSE);
        labError.setVisible(false);
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
        pnlNameUD = new javax.swing.JPanel();
        pnlChucnangpublic = new javax.swing.JPanel();
        btnHienThiHH = new java.awt.Button();
        btnTimKiemHH = new java.awt.Button();
        btnQuanLy = new java.awt.Button();
        pnlChucnangAdmim1 = new javax.swing.JPanel();
        btnXuLyDH = new java.awt.Button();
        btnQuanLyHH = new java.awt.Button();
        pnlChucNangAdmin2 = new javax.swing.JPanel();
        btnThemSanPham = new java.awt.Button();
        btnXoaSanPham = new java.awt.Button();
        btnCapNhapSanPham = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        btnDangNhap = new javax.swing.JButton();
        labHienThi = new javax.swing.JLabel();
        labUser = new java.awt.Label();
        pnlChildframe = new javax.swing.JPanel();
        pnlDangNhap = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUser1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labError = new javax.swing.JLabel();
        btnLoGin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 680));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(211, 680));
        jPanel1.setMinimumSize(new java.awt.Dimension(211, 680));
        jPanel1.setName("pnlControl"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(211, 680));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        pnlNameUD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlNameUD.setMaximumSize(new java.awt.Dimension(211, 90));
        pnlNameUD.setMinimumSize(new java.awt.Dimension(211, 90));
        pnlNameUD.setName("pnlNameUD"); // NOI18N
        pnlNameUD.setPreferredSize(new java.awt.Dimension(211, 90));
        pnlNameUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNameUDMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlNameUDLayout = new javax.swing.GroupLayout(pnlNameUD);
        pnlNameUD.setLayout(pnlNameUDLayout);
        pnlNameUDLayout.setHorizontalGroup(
            pnlNameUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 207, Short.MAX_VALUE)
        );
        pnlNameUDLayout.setVerticalGroup(
            pnlNameUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        jPanel1.add(pnlNameUD);

        pnlChucnangpublic.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlChucnangpublic.setMaximumSize(new java.awt.Dimension(211, 140));
        pnlChucnangpublic.setMinimumSize(new java.awt.Dimension(211, 140));
        pnlChucnangpublic.setName("pnlChucnangpublic"); // NOI18N
        pnlChucnangpublic.setPreferredSize(new java.awt.Dimension(211, 140));
        pnlChucnangpublic.setLayout(new javax.swing.BoxLayout(pnlChucnangpublic, javax.swing.BoxLayout.Y_AXIS));

        btnHienThiHH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHienThiHH.setLabel("Hiện Thị Hàng Hóa");
        btnHienThiHH.setMaximumSize(new java.awt.Dimension(211, 45));
        btnHienThiHH.setMinimumSize(new java.awt.Dimension(211, 45));
        btnHienThiHH.setName("Hiện Thị Hàng Hóa"); // NOI18N
        btnHienThiHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHienThiHHMouseClicked(evt);
            }
        });
        pnlChucnangpublic.add(btnHienThiHH);
        btnHienThiHH.getAccessibleContext().setAccessibleDescription("");

        btnTimKiemHH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnTimKiemHH.setLabel("Tìm Kiếm Hàng Hóa");
        btnTimKiemHH.setMaximumSize(new java.awt.Dimension(211, 45));
        btnTimKiemHH.setMinimumSize(new java.awt.Dimension(211, 45));
        btnTimKiemHH.setName("Tìm Kiếm Hàng Hóa"); // NOI18N
        btnTimKiemHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemHHMouseClicked(evt);
            }
        });
        pnlChucnangpublic.add(btnTimKiemHH);

        btnQuanLy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnQuanLy.setLabel("Quản Lý");
        btnQuanLy.setMaximumSize(new java.awt.Dimension(211, 45));
        btnQuanLy.setMinimumSize(new java.awt.Dimension(211, 45));
        btnQuanLy.setName("Quản Lý"); // NOI18N
        btnQuanLy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyMouseClicked(evt);
            }
        });
        pnlChucnangpublic.add(btnQuanLy);

        jPanel1.add(pnlChucnangpublic);

        pnlChucnangAdmim1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlChucnangAdmim1.setEnabled(false);
        pnlChucnangAdmim1.setMaximumSize(new java.awt.Dimension(211, 95));
        pnlChucnangAdmim1.setMinimumSize(new java.awt.Dimension(211, 95));
        pnlChucnangAdmim1.setName("pnlChucnangAdmim1"); // NOI18N
        pnlChucnangAdmim1.setPreferredSize(new java.awt.Dimension(211, 95));
        pnlChucnangAdmim1.setLayout(new javax.swing.BoxLayout(pnlChucnangAdmim1, javax.swing.BoxLayout.Y_AXIS));

        btnXuLyDH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXuLyDH.setLabel("Xử Lý Đơn Hàng");
        btnXuLyDH.setMaximumSize(new java.awt.Dimension(211, 45));
        btnXuLyDH.setMinimumSize(new java.awt.Dimension(211, 45));
        btnXuLyDH.setName("Xử Lý Đơn Hàng"); // NOI18N
        btnXuLyDH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXuLyDHMouseClicked(evt);
            }
        });
        pnlChucnangAdmim1.add(btnXuLyDH);

        btnQuanLyHH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnQuanLyHH.setLabel("Quản Lý Hàng Hóa");
        btnQuanLyHH.setMaximumSize(new java.awt.Dimension(211, 45));
        btnQuanLyHH.setMinimumSize(new java.awt.Dimension(211, 45));
        btnQuanLyHH.setName("Quản Lý Hàng Hóa"); // NOI18N
        btnQuanLyHH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyHHMouseClicked(evt);
            }
        });
        pnlChucnangAdmim1.add(btnQuanLyHH);

        jPanel1.add(pnlChucnangAdmim1);

        pnlChucNangAdmin2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlChucNangAdmin2.setMaximumSize(new java.awt.Dimension(211, 140));
        pnlChucNangAdmin2.setMinimumSize(new java.awt.Dimension(211, 140));
        pnlChucNangAdmin2.setName("pnlChucNangAdmin2"); // NOI18N
        pnlChucNangAdmin2.setPreferredSize(new java.awt.Dimension(211, 140));
        pnlChucNangAdmin2.setLayout(new javax.swing.BoxLayout(pnlChucNangAdmin2, javax.swing.BoxLayout.Y_AXIS));

        btnThemSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnThemSanPham.setLabel("Thêm Sản Phẩm");
        btnThemSanPham.setMaximumSize(new java.awt.Dimension(211, 45));
        btnThemSanPham.setMinimumSize(new java.awt.Dimension(211, 45));
        btnThemSanPham.setName("Thêm Sản Phẩm"); // NOI18N
        btnThemSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemSanPhamMouseClicked(evt);
            }
        });
        pnlChucNangAdmin2.add(btnThemSanPham);

        btnXoaSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnXoaSanPham.setLabel("Xóa Sản Phẩm");
        btnXoaSanPham.setMaximumSize(new java.awt.Dimension(211, 45));
        btnXoaSanPham.setMinimumSize(new java.awt.Dimension(211, 45));
        btnXoaSanPham.setName("Xóa Sản Phẩm"); // NOI18N
        btnXoaSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaSanPhamMouseClicked(evt);
            }
        });
        pnlChucNangAdmin2.add(btnXoaSanPham);

        btnCapNhapSanPham.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCapNhapSanPham.setLabel("Cập Nhập Sản Phẩm");
        btnCapNhapSanPham.setMaximumSize(new java.awt.Dimension(211, 45));
        btnCapNhapSanPham.setMinimumSize(new java.awt.Dimension(211, 45));
        btnCapNhapSanPham.setName("Cập Nhập Sản Phẩm"); // NOI18N
        btnCapNhapSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhapSanPhamMouseClicked(evt);
            }
        });
        pnlChucNangAdmin2.add(btnCapNhapSanPham);

        jPanel1.add(pnlChucNangAdmin2);

        jPanel7.setMaximumSize(new java.awt.Dimension(211, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(211, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(211, 100));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);

        getContentPane().add(jPanel1);

        jPanel5.setPreferredSize(new java.awt.Dimension(989, 680));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(989, 90));
        jPanel2.setMinimumSize(new java.awt.Dimension(989, 90));
        jPanel2.setPreferredSize(new java.awt.Dimension(989, 90));

        label1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label1.setText("QUẢN LÝ HÀNG HÓA");

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setName("Đăng nhập"); // NOI18N
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseClicked(evt);
            }
        });

        labHienThi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labHienThi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labHienThi.setText("QLHH");
        labHienThi.setMaximumSize(new java.awt.Dimension(180, 25));
        labHienThi.setMinimumSize(new java.awt.Dimension(180, 25));
        labHienThi.setPreferredSize(new java.awt.Dimension(180, 25));

        labUser.setAlignment(java.awt.Label.CENTER);
        labUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        labUser.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        labUser.setMaximumSize(new java.awt.Dimension(99, 25));
        labUser.setMinimumSize(new java.awt.Dimension(99, 25));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labUser, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(labUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangNhap))))
                .addContainerGap())
        );

        jPanel5.add(jPanel2);

        pnlChildframe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlChildframe.setMaximumSize(new java.awt.Dimension(989, 590));
        pnlChildframe.setMinimumSize(new java.awt.Dimension(989, 590));
        pnlChildframe.setLayout(new javax.swing.BoxLayout(pnlChildframe, javax.swing.BoxLayout.LINE_AXIS));

        pnlDangNhap.setMaximumSize(new java.awt.Dimension(989, 590));
        pnlDangNhap.setMinimumSize(new java.awt.Dimension(989, 590));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP ADMIN");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("USER: ");
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 30));

        txtUser1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUser1.setMaximumSize(new java.awt.Dimension(180, 30));
        txtUser1.setMinimumSize(new java.awt.Dimension(180, 30));
        txtUser1.setPreferredSize(new java.awt.Dimension(180, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD: ");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 30));

        labError.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labError.setText("Sai user hoặc sai passowrd");
        labError.setMaximumSize(new java.awt.Dimension(162, 25));
        labError.setMinimumSize(new java.awt.Dimension(162, 25));
        labError.setPreferredSize(new java.awt.Dimension(162, 25));

        btnLoGin.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnLoGin.setText("Đăng Nhập");
        btnLoGin.setMaximumSize(new java.awt.Dimension(93, 30));
        btnLoGin.setMinimumSize(new java.awt.Dimension(93, 30));
        btnLoGin.setPreferredSize(new java.awt.Dimension(93, 30));
        btnLoGin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoGinMouseClicked(evt);
            }
        });

        txtpass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpass.setMaximumSize(new java.awt.Dimension(180, 30));
        txtpass.setMinimumSize(new java.awt.Dimension(180, 30));
        txtpass.setPreferredSize(new java.awt.Dimension(180, 30));

        javax.swing.GroupLayout pnlDangNhapLayout = new javax.swing.GroupLayout(pnlDangNhap);
        pnlDangNhap.setLayout(pnlDangNhapLayout);
        pnlDangNhapLayout.setHorizontalGroup(
            pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangNhapLayout.createSequentialGroup()
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDangNhapLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(btnLoGin, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDangNhapLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(labError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 300, Short.MAX_VALUE))
        );
        pnlDangNhapLayout.setVerticalGroup(
            pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDangNhapLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLoGin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pnlChildframe.add(pnlDangNhap);

        jPanel5.add(pnlChildframe);

        getContentPane().add(jPanel5);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuanLyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyMouseClicked
        // TODO add your handling code here:
        if(pnlChucnangAdmim1.isVisible() == false && check == 1){
            pnlChucnangAdmim1.setVisible(true);
        }else{
            if(check != 1){
               JFrame f = new JFrame();  
               JOptionPane.showMessageDialog(f,"Bạn Chưa Đăng Nhập.","Alert",JOptionPane.WARNING_MESSAGE);
            }
            pnlChucnangAdmim1.setVisible(false);
            pnlChucNangAdmin2.setVisible(false);
        }
    }//GEN-LAST:event_btnQuanLyMouseClicked

    private void btnQuanLyHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyHHMouseClicked
        // TODO add your handling code here:
        if(pnlChucNangAdmin2.isVisible() == false){
           pnlChucNangAdmin2.setVisible(true);
        }else{
            pnlChucNangAdmin2.setVisible(false);
        }
    }//GEN-LAST:event_btnQuanLyHHMouseClicked

    private void btnHienThiHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienThiHHMouseClicked
        // TODO add your handling code here:
        openpanel(new ThongTinHangHoa());
        labHienThi.setText(btnHienThiHH.getName());
    }//GEN-LAST:event_btnHienThiHHMouseClicked

    private void btnTimKiemHHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemHHMouseClicked
        // TODO add your handling code here:
        openpanel(new TimKiemHangHoa());
        labHienThi.setText(btnTimKiemHH.getName());
    }//GEN-LAST:event_btnTimKiemHHMouseClicked

    private void btnXuLyDHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuLyDHMouseClicked
        // TODO add your handling code here:
        openpanel(new XuLyDonHang());
        labHienThi.setText(btnXuLyDH.getName());
    }//GEN-LAST:event_btnXuLyDHMouseClicked

    private void btnThemSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemSanPhamMouseClicked
        // TODO add your handling code here:
        openpanel(new ThemSanPham());
        labHienThi.setText(btnThemSanPham.getName());
    }//GEN-LAST:event_btnThemSanPhamMouseClicked

    private void btnCapNhapSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhapSanPhamMouseClicked
        // TODO add your handling code here:
        openpanel(new CapNhapSanPham());
        labHienThi.setText(btnCapNhapSanPham.getName());
    }//GEN-LAST:event_btnCapNhapSanPhamMouseClicked

    private void btnXoaSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaSanPhamMouseClicked
        // TODO add your handling code here:
        openpanel(new XoaSanPham());
        labHienThi.setText(btnXoaSanPham.getName());
    }//GEN-LAST:event_btnXoaSanPhamMouseClicked

    private void btnDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseClicked
        // TODO add your handling code here:
        if(check == 1 ){
            btnDangNhap.setText("Đăng Nhập");
            labUser.setText("");
            check = 0;
            childJPanel.setVisible(false);
            pnlChucnangAdmim1.setVisible(false);
            pnlChucNangAdmin2.setVisible(false);
        }else{
            txtUser1.setText("");
            txtpass.setText("");
            pnlDangNhap.setVisible(true);
        }
    }//GEN-LAST:event_btnDangNhapMouseClicked

    private void pnlNameUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNameUDMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_pnlNameUDMouseClicked

    
    private void btnLoGinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoGinMouseClicked
        // TODO add your handling code here:
        String user = txtUser1.getText();
        String pass = new String(txtpass.getPassword());
        for(Account i : ListAC){
            if(i.getUser().equals(user)&& i.getPass().equals(pass)){
                check = 1;
                labUser.setText("User: "+user);
                btnDangNhap.setText(("Đăng Xuất"));
                openpanel(new XuLyDonHang());
                labHienThi.setText((btnXuLyDH.getName()));
                pnlChucnangAdmim1.setVisible(true);
                UserLogin = user;
                return;
            }
        }
        labError.setVisible(true);
    }//GEN-LAST:event_btnLoGinMouseClicked
    
        
    private void openpanel(JPanel panel){
        if(childJPanel != null){
            pnlChildframe.remove(childJPanel);
        }
        pnlDangNhap.setVisible(false);
        childJPanel = panel;
        pnlChildframe.add(childJPanel);
        pnlChildframe.validate();
        
    }
    public void getdata(){
        try{
            File dataHH  = new File("src\\datatxt\\HangHoa.txt");        
            if(dataHH.exists()){
                Scanner read = new Scanner(dataHH);
                while(read.hasNext()){
                    Scanner line = new Scanner(read.nextLine());
                    String data = new String();
                    data = line.nextLine();
                    String[] mydata = data.split("-");
                    HangHoa tmpHangHoa = new HangHoa(mydata[0],mydata[1],mydata[2],mydata[3],mydata[4],mydata[5]);
                    ListHH.add(tmpHangHoa);
                }
            }else System.out.println("ERROR!!");
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void getAC(){
        try{
            File dataHH  = new File("src\\datatxt\\Account.txt");        
            if(dataHH.exists()){
                Scanner read = new Scanner(dataHH);
                while(read.hasNext()){
                    Scanner line = new Scanner(read.nextLine());
                    String data = new String();
                    data = line.nextLine();
                    String[] mydata = data.split(" ");
                    Account account = new Account(mydata[0],mydata[1]);
                    ListAC.add(account);
                }
            }else System.out.println("ERROR!!");
            
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void addSanPham(HangHoa a){
        ListHH.add(a);
    }
    public static void RemoveSanPham(String MVT,int row){
        boolean check = false;
        for(HangHoa i : ListHH){
            if(i.getMVT().equals(MVT)){
                ListHH.remove(i);
                JFrame f = new JFrame();  
                JOptionPane.showMessageDialog(f,"Xóa Thành Công.","Alert",JOptionPane.INFORMATION_MESSAGE);
                check = true;
                break;
            }
        }
        if(!check){
            ListHH.remove(row);
            JFrame f = new JFrame();  
            JOptionPane.showMessageDialog(f,"Xóa Thành Công.","Alert",JOptionPane.INFORMATION_MESSAGE);
            check = true;
        }
        try {
            FileWriter fw = new FileWriter("src\\datatxt\\HangHoa.txt");
            for(HangHoa i : ListHH){
                String s = i.getMVT()+"-"+i.getTenHang()+"-"+i.getNoiSanXuat()+"-"+i.getGiaThanh()+"-"+i.getNgayNhapKho()+"-"+i.getSoLuong()+"\n";
                fw.write(s);
            }
            fw.close();
        } catch (Exception e) {
        }
    }
    public static void CapnhapSoLuong(String MVT,String SL){
        boolean check = false;
        for(HangHoa i : ListHH){
            if(i.getMVT().equals(MVT)){
                i.setSoLuong(SL);
                System.out.println(i.getSoLuong());
                JFrame f = new JFrame();  
                JOptionPane.showMessageDialog(f,"Cập Nhập Thành Công.","Alert",JOptionPane.INFORMATION_MESSAGE);
                check = true;
                break;
            }
        }
        if(!check){
            JFrame f = new JFrame();  
            JOptionPane.showMessageDialog(f,"Bạn Chưa Nhập Đủ Thông Tin.","Alert",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        try {
            FileWriter fw = new FileWriter("src\\datatxt\\HangHoa.txt");
            for(HangHoa i : ListHH){
                String s = i.getMVT()+"-"+i.getTenHang()+"-"+i.getNoiSanXuat()+"-"+i.getGiaThanh()+"-"+i.getNgayNhapKho()+"-"+i.getSoLuong()+"\n";
                fw.write(s);
            }
            fw.close();
        } catch (Exception e) {
        }
        
    }
    public static ArrayList<HangHoa> postDL(){
        return ListHH;
    }
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
            java.util.logging.Logger.getLogger(QLHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLHH main = new QLHH();
                main.setLocationRelativeTo(null);
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnCapNhapSanPham;
    private javax.swing.JButton btnDangNhap;
    private java.awt.Button btnHienThiHH;
    private javax.swing.JButton btnLoGin;
    private java.awt.Button btnQuanLy;
    private java.awt.Button btnQuanLyHH;
    private java.awt.Button btnThemSanPham;
    private java.awt.Button btnTimKiemHH;
    private java.awt.Button btnXoaSanPham;
    private java.awt.Button btnXuLyDH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labError;
    private javax.swing.JLabel labHienThi;
    private java.awt.Label labUser;
    private java.awt.Label label1;
    private javax.swing.JPanel pnlChildframe;
    private javax.swing.JPanel pnlChucNangAdmin2;
    private javax.swing.JPanel pnlChucnangAdmim1;
    private javax.swing.JPanel pnlChucnangpublic;
    private javax.swing.JPanel pnlDangNhap;
    private javax.swing.JPanel pnlNameUD;
    private javax.swing.JTextField txtUser1;
    private javax.swing.JPasswordField txtpass;
    // End of variables declaration//GEN-END:variables
}

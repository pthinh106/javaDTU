/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlybanhang;

import backend.HangHoa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class ThongTinHangHoa extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinHangHoa
     */
    private ArrayList<HangHoa> ListHH = new ArrayList<>();
    DefaultTableModel dtm = new DefaultTableModel();
    public ThongTinHangHoa() {
        initComponents();
        ListHH = QLHH.postDL();
        dtm.setColumnIdentifiers(new Object[]{"Mã Vật Tư", "Tên Hàng Hóa", "Nơi Sản Xuất", "Giá Thành", "Ngày Nhập Kho", "Số Lượng"});
        tblHienThi.setModel(dtm);
        napdulieu();
    }
    public void napdulieu(){
        dtm.setRowCount(0);
        for (int i=0;i<ListHH.size();i++)
            dtm.addRow(new Object[]{ListHH.get(i).getMVT(), ListHH.get(i).getTenHang(), ListHH.get(i).getNoiSanXuat(), ListHH.get(i).getGiaThanh(), ListHH.get(i).getNgayNhapKho(), ListHH.get(i).getSoLuong()});
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHienThi = new javax.swing.JTable();

        tblHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblHienThi.setRowHeight(25);
        jScrollPane1.setViewportView(tblHienThi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHienThi;
    // End of variables declaration//GEN-END:variables
}

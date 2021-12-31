/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author ADMIN
 */
public class DonHang {
    private String MVT;
    private String TenKhachHang;
    private String DiaChiKhachHang;
    private String SoDienThoai;
    private String NgayDatHang;
    private String Soluong;
    private String TongTien;

    public DonHang(String MVT, String TenKhachHang, String DiaChiKhachHang, String SoDienThoai, String NgayDatHang, String Soluong, String TongTien) {
        this.MVT = MVT;
        this.TenKhachHang = TenKhachHang;
        this.DiaChiKhachHang = DiaChiKhachHang;
        this.SoDienThoai = SoDienThoai;
        this.NgayDatHang = NgayDatHang;
        this.Soluong = Soluong;
        this.TongTien = TongTien;
    }
    
    public String getMVT(){
        return MVT;
    }
    public String getTen(){
        return TenKhachHang;
    }
    public String getDiaChi(){
        return DiaChiKhachHang;
    }
    public String getSDT(){
        return SoDienThoai;
    }
    public String getNgayDH(){
        return NgayDatHang;
    }
    public String getSL(){
        return Soluong;
    }
    public String getTT(){
        return TongTien;
    }
    public void setMVT(String MVT){
        this.MVT = MVT;
    }
    public void setTen(String Ten){
        this.TenKhachHang = Ten;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChiKhachHang = DiaChi;
    }
    public void setSDT(String SDT){
        this.SoDienThoai = SDT;
    }
    public void setNgayDH(String NgayDH){
        this.NgayDatHang = NgayDH;
    }
    public void setSL(String SL){
        this.Soluong = SL;
    }
    public void setTT(String TT){
        this.TongTien = TT;
    }
}

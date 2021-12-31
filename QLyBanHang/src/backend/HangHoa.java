/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author ADMIN
 */
public class HangHoa {
    private String MVT;
    private String TenHang;
    private String NoiSanXuat;
    private String GiaThanh;
    private String NgaynhapKho;
    private String Soluong;

    public HangHoa() {
    }
    public HangHoa(String MVT,String TenHang,String NoiSanXuat,String GiaThanh,String NgaynhapKho,String Soluong){
        this.MVT = MVT;
        this.TenHang = TenHang;
        this.NoiSanXuat = NoiSanXuat;
        this.GiaThanh = GiaThanh;
        this.NgaynhapKho = NgaynhapKho;
        this.Soluong = Soluong;
    }
    public String getMVT(){
        return MVT;
    }
    public String getTenHang(){
        return TenHang;
    }
    public String getNoiSanXuat(){
        return NoiSanXuat;
    }
    public String getGiaThanh(){
        return GiaThanh;
    }
    public String getNgayNhapKho(){
        return NgaynhapKho;
    }
    public String getSoLuong(){
        return Soluong;
    }
    public void setMVT(String MVT){
        this.Soluong = MVT;
    }
    public void setTenHang(String TenHang){
        this.Soluong = TenHang;
    }
    public void setNoiSanXuat(String NoiSanXuat){
        this.Soluong = NoiSanXuat;
    }
    public void setGiaThanh(String GiaThanh){
        this.Soluong = GiaThanh;
    }
    public void setNgayNhapKho(String NgayNhapKho){
        this.Soluong = NgayNhapKho;
    }
    public void setSoLuong(String Soluong){
        this.Soluong = Soluong;
    }
}

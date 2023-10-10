package ontapcrud;

import java.io.Serializable;

public class SanPham implements Serializable{
    private String maSP;
    private String tenSP;
    private double gia;
    private String danhMuc;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double gia, String danhMuc) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.danhMuc = danhMuc;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }
    
    
    
}

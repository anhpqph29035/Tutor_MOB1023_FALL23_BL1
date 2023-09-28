package model;
public class NhanVien {
    private String hoTen;
    private String ngaySinh;
    private String chucVu;
    private String gioiTinh;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String chucVu, String gioiTinh, double luong) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.chucVu = chucVu;
        this.gioiTinh = gioiTinh;
        this.luong = luong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    
}

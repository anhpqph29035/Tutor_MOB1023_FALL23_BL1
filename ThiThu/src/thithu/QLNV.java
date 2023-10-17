package thithu;

import java.io.Serializable;

public class QLNV implements Serializable{
    private String ho;
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String chucVu;

    public QLNV() {
    }

    public QLNV(String ho, String ten, int tuoi, String gioiTinh, String chucVu) {
        this.ho = ho;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.chucVu = chucVu;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    
}

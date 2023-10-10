package ontapcrud;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SanPhamService {

    ArrayList<SanPham> listSP = new ArrayList<>();

    public ArrayList<SanPham> fakeData() {
        listSP.add(new SanPham("SP1", "Iphone 15", 599, "Smartphone"));
        listSP.add(new SanPham("SP2", "Acer Nitro 7", 900, "Laptop"));
        return listSP;
    }

    public String addSP(SanPham sp) {
        return (sp != null && listSP.add(sp) ? "Add thành công !" : "Add thất bại !");
    }

    public String updateSP(int Vitri, SanPham sp) {
        if (sp != null) {
            listSP.set(Vitri, sp);
            return "Update thành công !";
        }
        return "Update thất bại !";
    }

    public String deleteSP(int Vitri) {
        return (listSP.remove(Vitri) != null ? "Remove thành công!" : "Remove thất bại !");
    }

    public String ghiFile(int viTri, String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                //Ghi cả list
//                for (SanPham sanPham : listSP) {
//                    oos.writeObject(sanPham);
//                }
               //Ghi một đối tượng
               SanPham sp = listSP.get(viTri);
               oos.writeObject(sp);
            }
            return "Ghi thành công!";
        } catch (Exception e) {
            return "Ghi thất bại !";
        }
    }

    public String docFile(String filename) {
        File file = new File(filename);
        try {
            if (!file.exists()) {
                return "File không tồn tại";
            }
            try (FileInputStream fis = new FileInputStream(file); ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listSP.add((SanPham) ois.readObject());
                }
            }
            return "Đọc thành công!";
        } catch (Exception e) {
            return "Đọc thất bại !";
        }
    }
}

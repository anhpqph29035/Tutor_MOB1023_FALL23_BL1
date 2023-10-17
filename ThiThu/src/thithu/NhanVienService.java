package thithu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class NhanVienService {

    ArrayList<QLNV> listNV = new ArrayList<>();

    //Tạo 3 đối tượng mặc định và add vào list
    public ArrayList<QLNV> fakeData() {
        listNV.add(new QLNV("Phạm", "Quang Anh", 20, "Nam", "Nhân Viên"));
        listNV.add(new QLNV("Nguyễn", "Thị Nhung", 22, "Nữ", "Trưởng Phòng"));
        listNV.add(new QLNV("Nguyễn", "Tùng Dương", 24, "Nam", "Nhân Viên"));
        return listNV;
    }

    public String addNhanVien(QLNV nv, String fileName) {
        //Phần thêm và ghi
        if (nv != null && listNV.add(nv)) {
            File file = new File(fileName);
            try {
                //check file tồn tại chưa
                if (!file.exists()) {
                    file.createNewFile();
                }
                //Ghi file         
                try (FileOutputStream fos = new FileOutputStream(file); 
                        ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                      oos.writeObject(nv);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return "Ghi thất bại";
            }
            return "Thêm và Ghi thành công";
        }
        return "Thêm thất bại";
    }
    
    public String docFile(String fileName){
         File file = new File(fileName);
            try {
                //check file tồn tại chưa
                if (!file.exists()) {
                    return "File không tồn tại";
                }
                //Ghi file    
               
                try ( FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
                     while(fis.available()>0){
                         listNV.add((QLNV) ois.readObject());
                     }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return "Đọc thất bại";
            }
            return "Đọc thành công";
    }
    
    public String xoaNV(int ViTri){
        return(listNV.remove(ViTri)!=null?"Xóa thành công":"Xóa thất bại");
    }
    
    public String suaNV(int viTri,QLNV nv){
        if(nv!=null){
            listNV.set(viTri, nv);
            return "Sửa thành công !";
        }
        return "Sửa thất bại";
    }
}

package controller;

import java.util.ArrayList;
import model.NhanVien;

public class NhanVienServices {
    ArrayList<NhanVien> listNV = new ArrayList<>();
    
    public ArrayList<NhanVien> fakeData(){
        listNV.add(new NhanVien("QA","11/11/2023","Trưởng Phòng","Nam",20000));
        listNV.add(new NhanVien("DD","11/11/2022","Nhân Viên","Nữ",19000));
        return listNV;
    }
    
    public String addNhanVien(NhanVien nv){
        //If else
//        if(nv!=null && listNV.add(nv)){
//            return "Thêm thành công !";
//        }else{
//            return "Thêm thất bại !";
//        }
        //Toán tử 3 ngôi
        return(nv!=null&&listNV.add(nv)?"Thêm thành công!":"Thêm thất bại !");
    }
    
     public String updateNhanVien(int viTri,NhanVien nv){
        if(nv!=null){
            listNV.set(viTri, nv);
            return "Sửa thành công !";
        }
        return "Sửa thất bại";
    }
     
     public String removeNhanVien(int viTri){
         return(listNV.remove(viTri)!=null?"Xóa thành công !":"Xóa thất bại !");
     }
}

package ontapcrud;

import java.util.ArrayList;

public class SanPhamService {
    ArrayList<SanPham> listSP = new ArrayList<>();
    
    public ArrayList<SanPham> fakeData(){
       listSP.add(new SanPham("SP1","Iphone 15",599,"Smartphone"));
       listSP.add(new SanPham("SP2","Acer Nitro 7",900,"Laptop"));
       return listSP;
    }
    
    public String addSP(SanPham sp){
        return (sp!=null && listSP.add(sp)?"Add thành công !":"Add thất bại !");
    }
    
    public String updateSP(int Vitri,SanPham sp){
        if(sp != null){
            listSP.set(Vitri,sp);
            return "Update thành công !";
        }
        return "Update thất bại !";
    }
    
    public String deleteSP(int Vitri){
        return(listSP.remove(Vitri)!=null?"Remove thành công!":"Remove thất bại !");
    }
}

package thithu1;
import java.util.ArrayList;

public class DienThoaiService {
    ArrayList<DienThoai> listDT = new ArrayList<>();
    
    public ArrayList<DienThoai> fakeData(){
        listDT.add(new DienThoai("Iphone 15","Apple",21000));
        listDT.add(new DienThoai("Samsung Galaxy","Samsung",12000));
        listDT.add(new DienThoai("Iphone 14 Pro","Apple",23000));
        listDT.add(new DienThoai("Dell Phone","Dell",18000));
        return listDT;
    }
    
    public String themDT(DienThoai dt){
        return (dt!=null&&listDT.add(dt)?"Thêm thành công !":"Thêm thất bại !");
    }
}

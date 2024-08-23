package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachKH {
    List<KhachHang> arr;
    public  DanhSachKH(){
        arr=new ArrayList<>();
    }
    public void nhapDS(){

        int dem=0;;
        do{
            KhachHang kh=new KhachHang();
            System.out.printf("Nhập kh thứ %d : ",dem);
            kh.nhap();
            arr.add(kh);
            System.out.println("bạn đã nhập xong chưa y/n:");
            dem++;
            Scanner sc=new Scanner(System.in);
            String tl=sc.nextLine();
            if(tl.equals("y")){
                break;
            }

        }while (true);

    }

    public void xuatDS(){

        for(KhachHang kh:arr){
            int tongtien=0;
         //   tongtien+=kh.getGoiDV().getPhiCoBan()+kh.getGoiDV().getHoTroPT()+kh.getGoiDV().getDVXongHoi()+(kh.getGoiDV().getChiPhiLopHoc()*kh.getGoiDV().getSolopThamGia());
            kh.xuat();
           // System.out.println("tổng tiền kh đó là phải thanh toán: "+tongtien*kh.getThoiGianSuDung());
            System.out.println("tính tiền: "+kh.tinhTien());

        }

    }

    public Long MaxTien(){
        Long maxTien=0L;
        for(KhachHang a :this.arr){
            if(maxTien<a.tinhTien())
              maxTien=a.tinhTien();
        }
        return maxTien;
    }

    public void cau4(){
        System.out.println("##########");
        System.out.println("danh sách khách hàng max...");
        Long maxTien=MaxTien();
        for(KhachHang a : this.arr){
            Long kq=a.tinhTien();
            if(maxTien.equals(kq))
                a.xuat();
        }
    }

}

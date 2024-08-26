package BaiTapNhomMau;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachNhomMau {
    private List<NhomMau> arr=new ArrayList<>();
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập số lượng:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("nhập thông tin người thứ "+i+1);
            System.out.println("1 nhóm O");
            System.out.println("2 nhóm A");
            System.out.println("3 nhóm B");
            System.out.println("4 nhóm AB");
            System.out.println("mời bạn lựa chọn nhóm máu ");
            int flag=sc.nextInt();
            if(flag==1){
                NhomMau x=new O();
                x.nhap();
                arr.add(x);
            }
            else if(flag==2){
                NhomMau x=new A();
                x.nhap();
                arr.add(x);
            }
            else if(flag==3){
                NhomMau x=new B();
                x.nhap();
                arr.add(x);
            }
            else if(flag==4){
                NhomMau x=new AB();
                x.nhap();
                arr.add(x);
            }

        }
    }
    public void cau2(){
        NhomMau me=new A();
        NhomMau cha=new  B();
        NhomMau con=new A();
        if(me.kiemTraDiTruyen(cha,con)){
            System.out.println("gia đình này phù hợp quy luật di truyền");
        }else
            System.out.println("không phù hợp");
    }
    public void cau3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn chọn 1 người để nhận máu");
        int index=sc.nextInt();
        for(var i=0 ; i < arr.size();i++)
        {
            if(i!=index)
            {
                if(this.arr.get(i).kiemtraChoNhan(this.arr.get(index)))
                    System.out.printf("bạn thứ %d có the truyền máu cho bạn thứ %d \n ",i,index);
            }
        }
    }

    public void xuat(){
        for(NhomMau x:this.arr)
        {
            x.xuat();
        }
    }

}

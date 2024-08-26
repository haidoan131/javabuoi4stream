package BaiTapNauAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhapDanhSachThucPham {
    public static final int FLAG_CARB=1;
    public static final int FLAG_FAT=2;
    public static final int FLAG_FAT_BH=3;
    public static final int FLAG_PROTEIN=4;
    public static final int FLAG_CALO=5;
    private List<ChatDinhDuong> arr=new ArrayList<>();

    public void nhap(){
        ChatDinhDuong a=new Ga();
        ChatDinhDuong b=new HatSen();
        ChatDinhDuong c=new CaRot();
        ChatDinhDuong d=new TaoDo();
        ChatDinhDuong e=new NamDongCo();
        a.nhap();
        arr.add(a);
        b.nhap();
        c.nhap();
        d.nhap();
        e.nhap();
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);;
    }
    public void xuat(){
    for(ChatDinhDuong a:arr){
        a.xuat();
    }
//        int sum=arr.stream().mapToInt(p ->{
//            int kq=(p.getCarb()+p.getFat()+p.getFatBaoHoa()+ p.getProtein()+p.getCalo())*p.getKhoiluong();
//            System.out.println(kq);
//            return kq;
//        }).sum();
//        System.out.println("tổng số chất dinh dương mà bạn đã hấp thụ: "+sum);
    }
    public float tinhNangLuong2(int flag){
        return (float) this.arr.stream().mapToDouble(a->{
            if(flag==1){
                return a.getKhoiluong()/100.0f*a.getCarb();
            }else if(flag==2){
                return a.getKhoiluong()/100.0f*a.getFat();
            }
            else if(flag==3){
                return a.getKhoiluong()/100.0f*a.getFatBaoHoa();
            }
            else if(flag==4){
                return a.getKhoiluong()/100.0f*a.getProtein();
            }
            else if(flag==5){
                return a.getKhoiluong()/100.0f*a.getCalo();
            }
            throw new IllegalArgumentException ("");
        }).sum();
    }
    public float tinhNangLuong(int flag){
        float sum=0;
        for(ChatDinhDuong a:this.arr){
            if(flag==1){
                sum+=a.getKhoiluong()/100.0f*a.getCarb();
            }else if(flag==2){
                sum+=a.getKhoiluong()/100.0f*a.getFat();
            }
            else if(flag==3){
                sum+=a.getKhoiluong()/100.0f*a.getFatBaoHoa();
            }
            else if(flag==4){
                sum+=a.getKhoiluong()/100.0f*a.getProtein();
            }
            else if(flag==5){
                sum+=a.getKhoiluong()/100.0f*a.getCalo();
            }
        }
        return sum*0.8f;
    }

    public float tongNangLuong(){
        float sum=0;
        for(ChatDinhDuong a:this.arr){
            sum+=(a.getKhoiluong()/100.0f*a.getCarb())+(a.getKhoiluong()/100.0f*a.getFat())+(a.getKhoiluong()/100.0f*a.getFatBaoHoa())+(a.getKhoiluong()/100.0f*a.getProtein())+(a.getKhoiluong()/100.0f*a.getCalo());


        }
        return sum;
    }
    public void cau3(){
        float tongnangluong=tongNangLuong()*3;
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập thời gian chạy: ");
        int thoigianchay;
        thoigianchay=sc.nextInt();
        int socalochaykhidotduoc=thoigianchay*5;

        if(tongnangluong<1800){
            System.out.println("bữa ăn của bạn chưa đủ calo");
        }else if(tongnangluong>1800){
            float socalodu=tongnangluong-1800;
            System.out.printf("bạn đã ăn dư %f calo:",socalodu);
            System.out.println("số calo bạn đốt được khi chạy: "+socalochaykhidotduoc);


        }
    }


    public void cau2(){
        ChatDinhDuong a=new ChatDinhDuong();
        a.nhap();
        float nangluong=tinhNangLuong(1);
        System.out.println("tổng năng lượng carb bạn tiêu thụ "+nangluong);
        if(a.getCarb()>nangluong)
            System.out.printf("cơ the cần bổ sung %f carb nữa ",a.getCarb()-nangluong);

         nangluong=tinhNangLuong(2);
        System.out.println("tổng năng lượng fat bạn tiêu thụ "+nangluong);
        if(a.getFat()>nangluong)
            System.out.printf("cơ the cần bổ sung %f fat nữa ",a.getFat()-nangluong);

        nangluong=tinhNangLuong(3);
        System.out.println("tổng năng lượng fat bão hòa bạn tiêu thụ "+nangluong);
        if(a.getFatBaoHoa()>nangluong)
            System.out.printf("cơ the cần bổ sung %f fat bao hoa nữa ",a.getFatBaoHoa()-nangluong);

        nangluong=tinhNangLuong(4);
        System.out.println("tổng năng lượng protein bạn tiêu thụ "+nangluong);
        if(a.getProtein()>nangluong)
            System.out.printf("cơ the cần bổ sung %f protein nữa ",a.getProtein()-nangluong);

        nangluong=tinhNangLuong(5);
        System.out.println("tổng năng lượng  bạn tiêu thụ "+nangluong);
        if(a.getCalo()>nangluong)
            System.out.printf("cơ the cần bổ sung %f  nữa ",a.getCalo()-nangluong);

    }
    public float cau3thay(){
        if(tinhNangLuong(FLAG_CALO)-600>0)
            return 30*(tinhNangLuong(FLAG_CALO)-600/147.5f);
        else return 0;
    }
}

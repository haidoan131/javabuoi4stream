package BaiTapNhomMau;

import java.util.Scanner;

public abstract  class NhomMau {
    protected boolean rh;
    protected int loaiMau;

    public static final int _O=1;
    public static final int _A=2;
    public static final int _B=3;
    public static final int _AB=4;
    public NhomMau(){}
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Mời bạn nhập RH:");
        this.rh=sc.nextBoolean();
    }
    public void xuat(){
        System.out.println("#########");
        if(this.loaiMau==_O)
            System.out.println("O");
        else if(this.loaiMau==_A)
            System.out.println("A");
        else if(this.loaiMau==_B)
            System.out.println("B");
        else if(this.loaiMau==_AB)
            System.out.println("AB");

        if(rh==false)
            System.out.print("-");
        else
            System.out.print("+");

        System.out.println("#########");
    }

    public boolean isRh() {
        return rh;
    }

    public void setRh(boolean rh) {
        this.rh = rh;
    }

    public int getLoaiMau() {
        return loaiMau;
    }

    public void setLoaiMau(int loaiMau) {
        this.loaiMau = loaiMau;
    }
    public abstract boolean kiemTraDiTruyen(NhomMau cha,NhomMau con);
    public abstract boolean kiemtraNhomMau(NhomMau nhan);
    public boolean kiemTraRh(NhomMau nhan){

        if(this.rh==true){
            if(nhan.rh==true)
                return true;
        }else if(this.rh==false)
            return true;
        return false;
    }
    public boolean kiemtraChoNhan(NhomMau nhan){
        boolean nhomMau=kiemtraNhomMau(nhan);
        boolean rh=this.kiemTraRh(nhan);
        if(nhomMau && rh)
            return true;
        else
            return false;
    }
}

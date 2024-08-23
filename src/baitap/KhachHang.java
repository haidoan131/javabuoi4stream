package baitap;

import java.util.Scanner;

public  class KhachHang {
    private String hoTen;
    private String CMND;
    private GoiDichVu2 goiDV;
    private int thoiGianSuDung;

    public KhachHang() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public GoiDichVu2 getGoiDV() {
        return goiDV;
    }

    public void setGoiDV(GoiDichVu2 goiDV) {
        this.goiDV = goiDV;
    }

    public int getThoiGianSuDung() {
        return thoiGianSuDung;
    }

    public void setThoiGianSuDung(int thoiGianSuDung) {
        this.thoiGianSuDung = thoiGianSuDung;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Mời bạn nhập họ tên khách:");
        this.hoTen=sc.nextLine();
        System.out.print("Mời bạn nhập cmnd khách:");
        this.CMND=sc.nextLine();
        System.out.println("Chọn Gói Sử Dụng 1:prenium 2:basic 3:non-menber");

      //  this.goiDV=sc.nextInt();
        int luachon=0;
        luachon=sc.nextInt();
        if(luachon==1)
            this.goiDV=new KHPremium();
        else if(luachon==2)
        {


            System.out.println("Mời bạn nhập số lớp tham gia cho kh basis: ");
            int solop=sc.nextInt();
            this.goiDV=new KHBasic(solop);
        }
        else
            this.goiDV=new KHNon();


        System.out.println("nhập thời gian sử dụng:");
        this.thoiGianSuDung=sc.nextInt();
    }
    public void xuat(){
        String tengoidv="";
        if(this.goiDV instanceof  KHBasic ){
            tengoidv="Khách Basic tham gia ";
        }else if(this.goiDV instanceof KHPremium)
            tengoidv="kh pre";
        else{tengoidv="kh non";}
       System.out.println("Tên khách: "+getHoTen()+" cmnd: "+getCMND()+" gói sử dụng"+tengoidv+" thoi gian:"+getThoiGianSuDung());
    }
    public Long tinhTien(){
        return goiDV.tinhTien()*thoiGianSuDung;
    }
}

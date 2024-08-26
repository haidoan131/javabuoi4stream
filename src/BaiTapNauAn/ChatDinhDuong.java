package BaiTapNauAn;

import java.util.Scanner;

public  class ChatDinhDuong {
    private int Carb;
    private int Fat;
    private int FatBaoHoa;
    private int protein;
    private int Calo;
    private int khoiluong;

    public int getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(int khoiluong) {
        this.khoiluong = khoiluong;
    }

    public int getCarb() {
        return Carb;
    }

    public void setCarb(int carb) {
        Carb = carb;
    }

    public int getFat() {
        return Fat;
    }

    public void setFat(int fat) {
        Fat = fat;
    }

    public int getFatBaoHoa() {
        return FatBaoHoa;
    }

    public void setFatBaoHoa(int fatBaoHoa) {
        FatBaoHoa = fatBaoHoa;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getCalo() {
        return Calo;
    }

    public void setCalo(int calo) {
        Calo = calo;
    }

    public   void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập Carb: ");
        setCarb(sc.nextInt());
        System.out.println("Nhập Fat: ");
        setFat(sc.nextInt());
        System.out.println("Nhập Fat bão hòa: ");
        setFatBaoHoa(sc.nextInt());
        System.out.println("Nhập Protein: ");
        setProtein(sc.nextInt());
        System.out.println("Nhập Calo: ");
        setCalo(sc.nextInt());

    }
    public   void xuat(){

    }

}

package BaiTapNauAn;

import java.util.Scanner;

public class Ga extends ChatDinhDuong{
    public Ga(){
        setCarb(0);
        setFat(15);
        setFatBaoHoa(4);
        setProtein(17);
        setCalo(211);
    }
    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập g gà : ");

        while (true){
            int g=sc.nextInt();
            if(g==0){
                System.out.println("gram khác 0 nhập lại");
                continue;
            }else{
                setKhoiluong(g);
                break;
            }

        }

    }

    @Override
    public void xuat() {
        System.out.println("gà có khối lượng là : "+getKhoiluong() +" có calo là : "+getCalo());
    }
}

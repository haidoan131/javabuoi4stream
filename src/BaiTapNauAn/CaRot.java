package BaiTapNauAn;

import java.util.Scanner;

public class CaRot extends ChatDinhDuong{
    public CaRot(){
        setCarb(10);
        setFat(3);
        setFatBaoHoa(1);
        setProtein(4);
        setCalo(41);
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập g cà rốt : ");

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
        System.out.println("ca rot có khối lượng là : "+getKhoiluong() +" có calo là : "+getCalo());
    }
}

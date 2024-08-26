package BaiTapNauAn;

import java.util.Scanner;

public class HatSen extends ChatDinhDuong{

    public HatSen(){
        setCarb(17);
        setFat(0);
        setFatBaoHoa(1);
        setProtein(4);
        setCalo(89);
    }

    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập g hạt sen : ");
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
        System.out.println("hạt sen có khối lượng là : "+getKhoiluong() +" có calo là : "+getCalo());
    }
}

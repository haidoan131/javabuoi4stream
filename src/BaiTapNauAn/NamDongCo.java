package BaiTapNauAn;

import java.util.Scanner;

public class NamDongCo extends ChatDinhDuong{

    public NamDongCo(){
        setCarb(1);
        setFat(0);
        setFatBaoHoa(0);
        setProtein(15);
        setCalo(10);
    }
    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập g nấm đông co : ");
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
        System.out.println("nam dong co có khối lượng là : "+getKhoiluong() +" có calo là : "+getCalo());
    }
}

package BaiTapNauAn;

import java.util.Scanner;

public class TaoDo extends ChatDinhDuong{
    public TaoDo(){
        setCarb(3);
        setFat(1);
        setFatBaoHoa(0);
        setProtein(1);
        setCalo(52);
    }
    @Override
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("mời bạn nhập g táo đỏ : ");
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
        System.out.println("tao do có khối lượng là : "+getKhoiluong() +" có calo là : "+getCalo());
    }
}

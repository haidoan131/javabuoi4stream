package baitap;

import java.util.Scanner;

public class KHBasic extends GoiDichVu2{
    private int soLop;
    public KHBasic(int soLop) {
//        setChiPhiLopHoc(100);
//        setDVXongHoi(0);
//        setPhiCoBan(500);
//        setHoTroPT(100);
        this.PhiDichVu=500L;
        this.hoTroPT=100L;
        this.DichVuXongHoi=false;
        this.ChiPhiLopHoc=100L;
        this.soLop=soLop;

    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }
    @Override
    public Long tinhTien(){
        return PhiDichVu+ChiPhiLopHoc*soLop+hoTroPT;
    }


}

package BaiTapNhomMau;

public class A extends NhomMau{
    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con) {
        if(cha.getLoaiMau()==_O || cha.getLoaiMau()==_A)
        {
            if(con.getLoaiMau()==_A||con.getLoaiMau()==_O)
                return true;
        }else if(cha.getLoaiMau()==_B)
            return true;
        else if(cha.getLoaiMau()==_AB)
        {
            if(con.getLoaiMau()!=_O)
                return true;
        }

        return false;
    }

    @Override
    public boolean kiemtraNhomMau(NhomMau nhan) {
        if(nhan.getLoaiMau()==_A || nhan.getLoaiMau()==_AB)
            return true;
        return false;
    }

    public A(){
        this.loaiMau=_A;
    }
}

package BaiTapNhomMau;

public class AB extends NhomMau{
    public AB(){
        this.loaiMau=_AB;
    }

    @Override
    public boolean kiemTraDiTruyen(NhomMau cha, NhomMau con) {
        if(cha.getLoaiMau()!=_O){
            if(con.getLoaiMau()!=_O){
                return true;
            }
        }else if(cha.getLoaiMau()==_O){
            if(con.getLoaiMau()==_A || con.getLoaiMau()==_B)
                return true;
        }


        return false;
    }

    @Override
    public boolean kiemtraNhomMau(NhomMau nhan) {
        if(nhan.getLoaiMau()==_AB)
            return true;
        return false;
    }
}

package baitap;

public class GoiDichVu2 {
    protected Long PhiDichVu;
    protected Long ChiPhiLopHoc;
    protected Boolean DichVuXongHoi;
    protected Long hoTroPT;
    public Long tinhTien(){
        return PhiDichVu+ChiPhiLopHoc+hoTroPT;
    }
}

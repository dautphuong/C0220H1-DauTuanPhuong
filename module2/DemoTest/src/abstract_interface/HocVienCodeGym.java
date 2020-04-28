package abstract_interface;

public class HocVienCodeGym extends HocVien implements ThongTinGiaDinh {

    public HocVienCodeGym() {
    }

    public HocVienCodeGym(String hoTen, String namSinh) {
        super(hoTen, namSinh);
    }

    @Override
    void diHoc() {
        //......
        System.out.println(this.hoTen + " di hoc o trung tam CodeGym");
    }

    @Override
    public void thi(String tenMonHoc) {
        //diemdanh
        //phatde
        System.out.println(this.hoTen + " thi ly thuyet, thuc hanh 60' cua " + tenMonHoc);
        // thude
        //chamdiem
    }

    @Override
    public void updateThongTin(String thongTinGiaDinh) {
        //...
        System.out.println(this.hoTen + " da update thong tin gia dinh la " + thongTinGiaDinh);
    }

    @Override
    public void updateThongTinChiTiet(String thongTinGiaDinh) {
        
    }
}

package abstract_interface;

public abstract class HocVien {
    protected String hoTen;
    protected String namSinh;
    final String maSoGiaDinh = "XYZ777";

    public HocVien() {
    }

    public HocVien(String hoTen, String namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public void hocBai(String tenMonHoc) {
        System.out.println(this.hoTen + " dang hoc bai " + tenMonHoc);
    }

    abstract void diHoc();

    public abstract void thi(String tenMonHoc);
}

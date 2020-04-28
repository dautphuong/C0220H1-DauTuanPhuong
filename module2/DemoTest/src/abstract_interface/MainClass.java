package abstract_interface;

public class MainClass {

    public static void main(String[] args) {
//        HocVienCodeGym hocVienCodeGym = new HocVienCodeGym("Tien", "2k");
//        hocVienCodeGym.thi("Java core");
//        hocVienCodeGym.updateThongTin("Ho ten cha: Nguyen Van A, ho ten me: ...");

        HocVienCodeGymAno hocVienCodeGymAno = new HocVienCodeGymAno();
        hocVienCodeGymAno.hocVien.hocBai("Java core");
        hocVienCodeGymAno.thongTinGiaDinh.updateThongTin("Ho ten cha: Nguyen Van A");
    }
}

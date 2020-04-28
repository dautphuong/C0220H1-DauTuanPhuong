package abstract_interface;

public class HocVienCodeGymAno {

    // anonymous class
    HocVien hocVien = new HocVien("Tien", "2k") {
        @Override
        void diHoc() {
            System.out.println(" di hoc o trung tam CodeGym");
        }

        @Override
        public void thi(String tenMonHoc) {
            System.out.println(" thi ly thuyet, thuc hanh 60' cua " + tenMonHoc);
        }
    };

    // anonymous class
//    ThongTinGiaDinh thongTinGiaDinh = new ThongTinGiaDinh() {
//        @Override
//        public void updateThongTin(String thongTinGiaDinh) {
//            System.out.println("da update thong tin gia dinh la " + thongTinGiaDinh);
//        }
//    };

}

package abstract_interface;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai, chieuRong;

    @Override
    double getArea() {
        return chieuDai * chieuRong;
    }

    @Override
    double getPerimeter() {
        return (chieuDai + chieuRong) * 2;
    }
}

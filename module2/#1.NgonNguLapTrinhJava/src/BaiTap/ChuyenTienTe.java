package BaiTap;

import java.util.Scanner;

public class ChuyenTienTe {
    public static void main(String[] args) {
        double VND=23000;
        double USD;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so tien USD: ");
        USD=scanner.nextInt();
        System.out.print("Quy doi VND: "+(VND*USD));
    }
}

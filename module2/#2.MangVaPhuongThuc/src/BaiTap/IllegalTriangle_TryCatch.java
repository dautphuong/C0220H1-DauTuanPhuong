package BaiTap;

import java.util.Scanner;
import java.io.IOException;

public class IllegalTriangle_TryCatch {
    static void Error(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0 || a + b < c || a + c < b || b + c < a) {
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 canh Tam Giac: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try {
            Error(a, b, c);
            System.out.println("la 3 canh Tam giac");
        } catch (Exception e) {
            System.out.println("Khong phai 3 canh tam giac");
        }
    }
}


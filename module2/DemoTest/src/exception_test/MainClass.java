package exception_test;

import sun.applet.Main;

import java.util.Scanner;

public class MainClass {

    public void kiemTraSoChan(int n) throws KiemTraSoChanException {
        if (n % 2 == 0) {
            throw new KiemTraSoChanException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so de test exception: ");
        int a = new Scanner(System.in).nextInt();

        try {
            new MainClass().kiemTraSoChan(a);
        } catch (KiemTraSoChanException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // xu ly Exception cha
        }

        System.gc();
    }
}

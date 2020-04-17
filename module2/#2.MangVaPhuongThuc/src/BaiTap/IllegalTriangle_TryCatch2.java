package BaiTap;

import java.util.Scanner;


public class IllegalTriangle_TryCatch2 {
    static class IllegalRightTriangleException extends Exception {
        String errorMessage;

        public IllegalRightTriangleException(String inErrorMessage) {
            errorMessage = inErrorMessage;
        }

        public String getString() {
            return errorMessage;
        }
    }

    static class RightTriangle {
        public RightTriangle(int side1, int side2, int side3) throws IllegalRightTriangleException {
            if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1)
                throw new IllegalRightTriangleException("Not a triangle");
            else {
                throw new IllegalRightTriangleException("Is a right triangle ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 canh Tam Giac: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try {
            RightTriangle r = new RightTriangle(a, b, c);
        } catch (IllegalRightTriangleException e) {
            System.out.println(e.errorMessage);
        }
    }
}


package BaiTap;

import java.util.Scanner;

public class Number_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so duong:");
        int num = scanner.nextInt();
        String[] donvi = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] chuc20 = {"ten", "eleven", "twelve", "thirteen", "forteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] chuc = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (num >= 0) {
            if (num < 10) {
                System.out.println(donvi[num]);
            } else if (num < 20) {
                System.out.println(chuc20[num % 10]);
            } else if (num < 100) {
                if (num % 10 != 0) {
                    System.out.println(chuc[num / 10] + " " + donvi[num % 10]);
                } else {
                    System.out.println(chuc[num / 10]);
                }
            } else {
                if (num % 10 != 0) {
                    System.out.println(donvi[num / 100] + " hundred and " + chuc[num / 10 % 10] + " " + donvi[num % 10]);
                } else {
                    System.out.println(donvi[num / 100] + " hundred");
                }
            }
        }
    }
}

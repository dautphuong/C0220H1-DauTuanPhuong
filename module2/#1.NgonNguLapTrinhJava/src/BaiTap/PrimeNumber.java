package BaiTap;

import java.util.Scanner;

public class PrimeNumber {
    static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to:");
        int n=scanner.nextInt();
        int count=0;
        int num=1;
        while(count<n){
            if(checkPrime(num)){
                System.out.print(num+"\t");
                count++;
            }
            num++;
        }
    }
}

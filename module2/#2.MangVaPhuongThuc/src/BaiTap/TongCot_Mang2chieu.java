package BaiTap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TongCot_Mang2chieu {
    public static void main(String[] args) {
        int[][]array={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("So cot :"+array.length);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Tinh tong cac so trong cot: ");
        int n=scanner.nextInt();
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i][n-1];
        }
        System.out.println("Tong cac so trong cot: "+sum);
    }
}

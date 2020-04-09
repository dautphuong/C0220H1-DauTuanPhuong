package BaiTap;

import java.util.Scanner;

public class TongDuongCheo_Mang2chieu {
    public static void main(String[] args) {
        int[][]array={{1,2,3},{4,5,6},{7,8,9}};
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i][i];
        }
        System.out.println("Tong cac so cheo nhau trong mang: "+sum);
    }
}

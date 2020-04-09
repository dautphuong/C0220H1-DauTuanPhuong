package BaiTap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array=new int[10];
        array[0]=1;
        array[1]=4;
        array[2]=4;
        array[3]=6;
        array[4]=4;
        System.out.printf("GIa tri trong mang:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.print("Nhap phan tu can xoa: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                for(int j=i;j<array.length-1;j++){
                    array[j]=array[j+1];
                }
                i--;
                array[array.length-1]=0;
            }
        }
        System.out.printf("Mang sau khi xoa: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

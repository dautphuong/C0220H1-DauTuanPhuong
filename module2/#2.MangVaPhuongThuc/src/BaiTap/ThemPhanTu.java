package BaiTap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] array=new int[10];
        array[0]=1;
        array[1]=4;
        array[2]=3;
        array[3]=6;
        array[4]=7;

        System.out.printf("%-20s%s", "GIa tri trong mang: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println();
        System.out.print("Nhap vi tri can them: ");
        int i=scanner.nextInt();
        System.out.print("Nhap gia tri them vao: ");
        int n=scanner.nextInt();
        for(int j=array.length-1;j>i;j--){
            array[j]=array[j-1];
        }
        array[i]=n;
        System.out.printf("%-20s%s", "Mang sau khi chen: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}

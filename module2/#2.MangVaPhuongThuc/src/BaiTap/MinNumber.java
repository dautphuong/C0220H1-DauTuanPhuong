package BaiTap;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        int size=5;
        int [] array=new int[size];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            array[i]=scanner.nextInt();
        }
        int min=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min+" is a min number in array");
    }
}

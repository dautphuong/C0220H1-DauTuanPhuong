package BaiTap;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String str="HelloWorld";
        Scanner scanner=new Scanner(System.in);
        String c=scanner.nextLine();
        int count=0;

        for(int i=0;i<str.length();i++){
            if(c.equals(str.charAt(i))){
                count++;
            }
        }
        System.out.println("Ky tu "+c+" hien thi "+count+" lan");
    }
}

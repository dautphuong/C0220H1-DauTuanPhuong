package BaiTap;

import sun.awt.AWTAccessor;

import java.util.Scanner;

public class InHinh {
    static void Rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        int w = scanner.nextInt();
        System.out.print("Enter height: ");
        int h = scanner.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    static void Triangle() {
        System.out.println("1.top-left");
        System.out.println("2.top-right");
        System.out.println("3.botton-left");
        System.out.println("4.botton-right");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int n = scanner.nextInt();
        System.out.print("Enter edge: ");
        int c = scanner.nextInt();
        switch (n) {
            case 1:
                for(int i=0;i<=c;i++){
                    for(int j=0;j<c;j++){
                        if(j>=c-i){
                            System.out.print("   ");
                        }else{
                            System.out.print(" * ");
                        }
                    }
                    System.out.println();
                }break;
            case 2:
                for (int i = 0; i <= c; i++) {
                    for (int j = 0; j < c; j++) {
                        if(j>=i) {
                            System.out.print(" * ");
                        }else{
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }break;
            case 3:
                for (int i = 0; i <= c; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }break;
            case 4:
                for (int i = 0; i <= c; i++) {
                    for (int j = 0; j < c; j++) {
                        if (j >= c - i) {
                            System.out.print(" * ");
                        } else {
                            System.out.print("   ");
                        }
                    }
                    System.out.println();
                }break;
        }
    }

    static void IsoscelesTriangle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter edge: ");
        int c = scanner.nextInt();
        int mid=c/2;
        for(int i=0;i<=mid;i++){
            for(int j=0;j<c;j++){
                if(j>=mid-i&&j<=mid+i){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                Rectangle();
            case 2:
                Triangle();
            case 3:
                IsoscelesTriangle();
        }
    }
}
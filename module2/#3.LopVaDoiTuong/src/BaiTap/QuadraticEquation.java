package BaiTap;

import java.util.Scanner;
//phuong trinh bac 2
public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a,b,c :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if(equation.getDiscriminant()>0){
            System.out.println("The equation has two roots "+equation.getRoot1()+" and "+equation.getRoot2());
        }else if(equation.getDiscriminant()==0){
            System.out.println("The equation has one roots "+equation.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}

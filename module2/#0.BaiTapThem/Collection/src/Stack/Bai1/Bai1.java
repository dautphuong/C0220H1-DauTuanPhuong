package Stack.Bai1;

import java.util.Scanner;
import java.util.Stack;

public class Bai1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input: ");
        String input=scanner.nextLine();
        String[] arr=input.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("+") ||arr[i].equals("-")||arr[i].equals("*")||arr[i].equals("/")){
                double num = 0f;
                double num1 = Float.parseFloat(stack.pop());
                double num2 = Float.parseFloat(stack.pop());
                switch (arr[i]) {
                    case "+":
                        num = num2 + num1;
                        break;
                    case "-":
                        num = num2 - num1;
                        break;
                    case "*":
                        num = num2 * num1;
                        break;
                    case "/":
                        num = num2 / num1;
                        break;
                    default:
                        break;
                }
                stack.push(Double.toString(num));
            }else {
                stack.push(arr[i]);
            }
        }
        System.out.println(stack.pop());
    }
}

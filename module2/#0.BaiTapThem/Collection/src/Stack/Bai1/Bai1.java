package Stack.Bai1;

import java.util.Scanner;
import java.util.Stack;

public class Bai1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input: ");
        String input=scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c=input.charAt(i);
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                double num = 0f;
                double num1 = Float.parseFloat(stack.pop());
                double num2 = Float.parseFloat(stack.pop());
                switch (c) {
                    case '+':
                        num = num2 + num1;
                        break;
                    case '-':
                        num = num2 - num1;
                        break;
                    case '*':
                        num = num2 * num1;
                        break;
                    case '/':
                        num = num2 / num1;
                        break;
                    default:
                        break;
                }
                stack.push(Double.toString(num));
            }else {
                stack.push(Character.toString(c));
            }
        }
        System.out.println(stack.pop());
    }
}

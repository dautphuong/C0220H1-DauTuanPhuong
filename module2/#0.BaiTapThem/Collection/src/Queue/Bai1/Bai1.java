package Queue.Bai1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n,i=0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.print("Input: ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();

        while (true){
            if(i==n-1){
                System.out.println("OutPut: "+queue.peek());
                break;
            }
            queue.add(queue.poll());
            i++;
        }
    }
}

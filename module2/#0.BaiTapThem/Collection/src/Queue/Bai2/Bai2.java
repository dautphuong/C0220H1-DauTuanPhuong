package Queue.Bai2;

import java.lang.reflect.Array;
import java.util.*;

public class Bai2 {

    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        Deque<int[]> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Input: ");
        while (flag) {
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    int k = scanner.nextInt();
                    int p = scanner.nextInt();
                    int[] array = {k, p};
                    if (deque.size()!=0) {
                        int[] a = deque.getFirst();
                        if (p > a[1]) {
                            deque.add(array);
                        } else {
                            deque.addLast(array);
                        }
                    }else{
                        deque.add(array);
                    }
                    break;
                case 2:
                    if (deque.peek() == null) {
                        result.add(0);
                    } else {
                        int[] b = deque.pop();
                        result.add(b[0]);
                    }
                    break;
                case 3:
                    if (deque.peek() == null) {
                        result.add(0);
                    } else {
                        int[] c = deque.poll();
                        result.add(c[0]);
                    }
                    break;
                default:
                    flag = false;
            }
        }
        System.out.println("Output:");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}

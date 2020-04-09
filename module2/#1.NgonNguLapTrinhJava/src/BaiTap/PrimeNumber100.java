package BaiTap;

public class PrimeNumber100 {
    static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i+"\t");
            }
        }
    }
}

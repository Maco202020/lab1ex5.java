package exrcitiul5;

import java.util.Random;

public class MainApp {

    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(21);

        System.out.println("numar generat: " + num);
        if (Fibonacci(num)) {
            System.out.println("numarul " + num + " este numar din sirul Fibonacci.");
        } else {
            System.out.println("numarul " + num + " nu este din sirul Fibonacci.");
        }
    }

    public static boolean Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        int a = 0, b = 1;
        for (int i = 2; b < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == n;
    }
}

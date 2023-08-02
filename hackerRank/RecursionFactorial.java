package hackerRank;

import java.util.Scanner;

public class RecursionFactorial {
    public  int factorial(int n) {  // or make static
        if (n == 0 || n ==1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(new RecursionFactorial().factorial(a));
    }
}

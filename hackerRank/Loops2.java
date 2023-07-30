package hackerRank;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();

            for (int a = 0; a < s.length(); a++) {
                if (a % 2 == 0) {
                    System.out.print(s.charAt(a));
                }
            }
            System.out.print(" ");
            for (int a = 0; a < s.length(); a++) {
                if (a % 2 != 0) {
                    System.out.print(s.charAt(a));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

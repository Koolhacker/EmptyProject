package hackerRank;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double b = scan.nextDouble();
        // Consume the leftover newline character from the previous input
        scan.nextLine();
        String c = scan.nextLine();

        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + c);

        scan.close();
    }
}

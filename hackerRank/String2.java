package hackerRank;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");
        String A1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(A1 + " " + B1);
    }
}

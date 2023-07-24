package hackerRank;

import java.util.Scanner;

public class IsPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder(a);
        sb.reverse();
        System.out.println(sb);

        if (a.equals(sb.toString())) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}

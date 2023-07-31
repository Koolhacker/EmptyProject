package hackerRank;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String answer = s3.replace(s1,s2);
        System.out.println(answer);

    }
}

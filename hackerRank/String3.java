package hackerRank;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb.charAt(2));
        System.out.println(sb.charAt(sb.length() - 2 ));
        System.out.println(sb.substring(0,5));
        System.out.println(sb.substring(0,sb.length()-2));
        System.out.println(sb.substring(3));
        System.out.println(sb.length());
    }
}


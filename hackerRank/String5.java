package hackerRank;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0 ; i< n ; i++) {
            arr [i]= sc.next();
        }
        String s2 = sc.next();
        System.out.println(String.join(s2,arr));
    }
}
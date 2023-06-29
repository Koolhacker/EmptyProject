package packageOne;

import java.util.Scanner;

public class stepicList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("1");
        for (int i = 0; i < n; i++) {
            System.out.print(" 0");
        }
        System.out.print(" 1");
    }
}

package packageOne;

import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {
        boolean isIs = false;
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().toLowerCase().split(" ");
        for (String s : a) {
            if (s.equals("повторение")) {
                isIs = true;
            }
        }
        if (isIs) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}

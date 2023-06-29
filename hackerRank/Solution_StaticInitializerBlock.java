package hackerRank;

import java.util.Scanner;

public class Solution_StaticInitializerBlock {

    static int b;
    static int h;
    static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        flag = true;
        if (b <= 0 || h <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main (String[]args){
        if (flag) {
            int area = b * h;
            System.out.print(area);
        }
    }
}





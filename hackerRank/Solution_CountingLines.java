package hackerRank;

import java.util.Scanner;

public class Solution_CountingLines {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNextLine()) {
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
        sc.close();

    }
}
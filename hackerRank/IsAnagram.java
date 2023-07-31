package hackerRank;

import java.util.Scanner;

public class IsAnagram {
    static boolean isAnagram(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        char[] aChar = a1.toCharArray();
        char[] bChar = b1.toCharArray();

        java.util.Arrays.sort(aChar);
        java.util.Arrays.sort(bChar);

        return java.util.Arrays.equals(aChar, bChar);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

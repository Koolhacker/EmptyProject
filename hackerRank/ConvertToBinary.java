package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertToBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String s = Integer.toBinaryString(n);
        int count = 0;
        int maxCount = 0;
        int length = s.length();
        char a = '0';
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == a)
                count=0;
            else {
                count ++;
                if (maxCount < count)
                    maxCount = count;
            }
        }
//        System.out.println(s);
        System.out.println(maxCount);

//        int maxHourGlassSum = Integer.MIN_VALUE;
//        System.out.println(maxHourGlassSum);
    }
}

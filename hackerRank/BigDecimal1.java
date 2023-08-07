package hackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal1 {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s, (Object a, Object b) -> {
                    if(a != null && b != null){
                        BigDecimal bigDecimalA = BigDecimal.valueOf(Double.parseDouble(a.toString()));
                        BigDecimal bigDecimalB = BigDecimal.valueOf(Double.parseDouble(b.toString()));
                        return bigDecimalB.compareTo(bigDecimalA);
                    }
                    return 0;
                });

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

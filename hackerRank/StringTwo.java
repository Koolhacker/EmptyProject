package hackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class StringTwo {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            System.out.printf("%-15s%03d%n",s1,x);
//        }
//        System.out.println("================================");
//}

////////////////////////////////////////////////////////////

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        bufferedReader.close();
//
//        for(int i = 1; i<11; i++)
//            System.out.println(n + " x " +  i  +" = " + (n*i) );
//    }
//}

////////////////////////////////////////////////////////////////////

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                BigInteger number = new BigInteger("-9223372036854775808");
                BigInteger number2 = new BigInteger("9223372036854775807");
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9.22337204E18 && x<=9.22337204E18)System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int arraySize = sc.nextInt();
        for (int i = 0; i < arraySize; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int rowSize = sc.nextInt();
            for (int j = 0; j < rowSize; j++) {
                row.add(sc.nextInt());
            }
            arrayList.add(row);
        }
        int querySize = sc.nextInt();
        for (int k = 0; k < querySize; k++) {
            int x = sc.nextInt() -1;
            int y = sc.nextInt() -1 ;

            if (x  < arrayList.size() && y < arrayList.get(x).size())
                System.out.println(arrayList.get(x).get(y));
            else
                System.out.println("ERROR!");
        }
    }
}
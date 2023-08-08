package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nList = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nList; i++) {
            int data = sc.nextInt();
            list.add(data);
        }
        int nQuery = sc.nextInt();
        for (int i = 0; i < nQuery; i++) {
            String query = sc.next();
            if (query.equals("Insert")) {
                int index = sc.nextInt();
                int number = sc.nextInt();
                list.add(index, number);
            } else {
                int removeIndex = sc.nextInt();
                list.remove(removeIndex);
            }
        }
        for (int i : list)
            System.out.print(i + " ");
    }
}

package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map2 {

    public static void main(String[] argh) {
        Map<String, Integer> phonebook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            System.out.println(phonebook.containsKey(s) ? (s + "=" + phonebook.get(s)) : "Not found");
        }


    }
}






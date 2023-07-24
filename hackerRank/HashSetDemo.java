package hackerRank;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();


        set.add("Киев");
        set.add("Львов");
        set.add("Львовsk");
        set.add("Кременчуг");
        System.out.println(set.add("Харьков"));
        System.out.println(set.add("Харьков"));

        System.out.println(set);
    }

//    Iterable
//    Comparable
//    Comparato
//    HashMap
}

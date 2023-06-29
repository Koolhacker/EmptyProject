package lesson15_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
    list.add("Vova");
    list.add("Petya");
    list.add("Alex");
    list.add("Anton");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}

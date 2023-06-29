package Lesson10;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1111,"vova");
        map1.put(2222,"toha");
        map1.put(3333,"petya");
        map1.put(4444,"alex");
        map1.put(4445,"alex");
        map1.put(4445,"alexander");

        System.out.println(map1);
        map1.putIfAbsent(1112,"vova");
        map1.remove(3333);
        map1.remove(4445,"alexander");
        System.out.println(map1);
        System.out.println(map1.keySet());
        System.out.println(map1.entrySet());

    }
}

package lesson15_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("ok");
        list.add("poshli na pivo");

//        System.out.println(list);

        List<Integer> list2 = list.stream()
                .map(e -> e.length())
                .collect(Collectors.toList());

//        System.out.println(list2);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
//        System.out.println(list);

        int[] array = {5, 9, 3, 8, 1};

//        System.out.println(Arrays.toString(array));

        int[] array2 = Arrays.stream(array)
                .map(element -> {
                    if (element % 3 == 0) {
                        element = element / 3;
                    }
                    return element;
                }).toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));

        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("ok");
        set.add("poshli na pivo");

        System.out.println(set);

        Set<Integer> set2 = set.stream()
                .map(s -> s.length())
                .collect(Collectors.toSet());

        System.out.println(set2);

        List<Integer> list3 = set.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(list3);
    }
}

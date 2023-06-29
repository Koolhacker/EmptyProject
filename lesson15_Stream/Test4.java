package lesson15_Stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(5);
        list.add(null);


//        Optional<Integer> result = Optional.of(list.stream().reduce((acc, el) -> acc + el).get());
//        System.out.println(result);


//        List<Integer> list1 = new ArrayList<>();
//        Optional<Integer> result2 = list.stream().reduce((acc, el) -> acc + el);
//        if (result2.isPresent()) {
//            System.out.println(result2);
//        } else {
//            System.out.println("not present");
//        }

        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("kak dela");
        list3.add("ok");
        list3.add("poshli na pivo");

        String result3 = list3.stream().reduce((a, e) -> a + " " + e).toString();
        System.out.println(result3);


    }
}

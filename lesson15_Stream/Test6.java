package lesson15_Stream;

import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

//        stream1.filter(e -> {
//            System.out.println("!!!");
//            return e % 2 == 0;
//        }).collect(Collectors.toList());

//        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
//        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
//        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
//        stream4.forEach(e -> System.out.print(e + " "));

        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5, 6, 2, 1);
//        stream5.distinct().forEach(System.out::print);

//        System.out.println(stream5.count());
//        System.out.println(stream5.distinct().count());

        System.out.println(stream5.distinct().peek(System.out::println).count());

    }
}

package lesson15_Stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3};
        Arrays.stream(array)
                .forEach(e -> {
                    e *= 2;
                    System.out.println(e);
                });
        Arrays.stream(array).forEach(System.out::println);

        Arrays.stream(array).forEach(e -> Utils.myMethod(e));
        Arrays.stream(array).forEach(Utils::myMethod);

    }
}
class Utils{
    public static void myMethod(int a){
                System.out.println("Element = " + a);
    }
}
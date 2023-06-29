package lesson15_Stream;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {6, 5, 8, 4, 1, 5, 9, 56, 5, 45, 8, 4};
//        System.out.println(Arrays.toString(array));
//        array = Arrays.stream(array).sorted().toArray();
//        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array)
                .filter(e -> e % 2 == 1)
                .map(e -> {
                    if (e % 2 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e)
                .getAsInt();

        System.out.println(result);
    }
}

package lesson11;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        Optional <String> empty = Optional.ofNullable("sarge");
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());

        System.out.println(empty.
                map(String::toUpperCase)
                .orElse("lalalad"));
    }
}

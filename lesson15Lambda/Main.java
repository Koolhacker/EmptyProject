package lesson15Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vova", "Max", "Andy", "Valera", "Zanoza", "Alex");

        List<Person> people = names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());

//        System.out.println(names);
//        System.out.println(people);
//        Person.printNames(people,names);

        List<String> sortedList = names.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }

}

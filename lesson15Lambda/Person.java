package lesson15Lambda;

import java.util.List;

public record Person(String name) {

   public static void printNames(List<Person> people, List<String> names){
        int i=0;
        for (Person s : people) {
            System.out.println(names.get(i));
            i++;
        }
    }
}

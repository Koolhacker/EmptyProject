package Lesson10;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodePractice {
    public static void main(String[] args) {
        Map<People, Double> map1 = new HashMap<>();
        People p1 = new People("Valera", "Homulko", 28);
        People p2 = new People("Alex", "Homulko", 49);
        People p3 = new People("Alla", "Homulko", 46);
        People p4 = new People("Sarge", "Koolhacker", 37);
        People p5 = new People("Sarge", "Koolhacker", 37);
        map1.put(p1, 2.3);
        map1.put(p2, 5.0);
        map1.put(p3, 4.2);
        map1.put(p4, 3.3);
//        System.out.println(map1);
//        System.out.println("before - " + map1.containsKey(p5));
        map1.put(p5, 5.5);
//        System.out.println(p4.hashCode());
//        System.out.println(p5.hashCode());
//        for (Map.Entry<People, Double> entry : map1.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        Map<Integer, String> map2 = new HashMap<>(17,0.95f);

        System.out.println(map1.get(p1));
    }
}

class People {
    String name;
    String surname;
    int age;

    public People(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name) && Objects.equals(surname, people.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}

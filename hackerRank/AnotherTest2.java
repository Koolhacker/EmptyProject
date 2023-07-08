package hackerRank;

import java.util.Objects;

public class AnotherTest2 {
    public static void main(String[] args) {
//        System.out.println( new Duck("McDuck") == new Duck("McDuck"));
    }
        class Duck {
            String name;
            Duck(String name) { this.name = name; }
            void swim()  { System.out.println("Swim like a duck"); }
            void quack() { System.out.println("Quack like a duck"); }
            void walk()   { System.out.println("Walk like a duck"); }
            @Override
            public boolean equals(Object o) { return name.equals(((Duck) o).name); }
        }

        class Goose {
            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Goose goose = (Goose) o;
                return name.equals(goose.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name);
            }

            String name;
            Goose(String name) { this.name = name; }
            void swim()  { System.out.println("Swim like a duck"); }
            void quack() { System.out.println("Quack like a duck"); }
            void walk()   { System.out.println("Walk like a duck"); }

        }
    }


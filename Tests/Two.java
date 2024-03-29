package Tests;

public class Two {


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
        String name;
        Goose(String name) { this.name = name; }
        void swim()  { System.out.println("Swim like a duck"); }
        void quack() { System.out.println("Quack like a duck"); }
        void walk()   { System.out.println("Walk like a duck"); }
        @Override
        public boolean equals(Object o) { return name.equals(((Goose) o).name); }
    }

//    public static void main(String[] args) {
//        HashMap<Duck, Goose> map = new HashMap<>();
//        map.put(new Duck("McDuck"), new Goose("McDuck"));
//        Goose goose = map.get(new Duck("McDuck"));
//    }
}

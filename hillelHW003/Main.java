package hillelHW003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Print Name of dog - press Enter - Print distance  - press Enter ");
        dog.setName(sc.next());
        dog.setLength(sc.nextInt());


        System.out.println("Print Name of cat - press Enter - Print distance  - press Enter ");
        cat.setName(sc.next());
        cat.setLength(sc.nextInt());

        dog.run(dog.getLength(), dog.getLimitForRun());
        dog.swim(dog.getLength(), dog.getLimitForSwim());

        cat.run(cat.getLength(), cat.getLimitForRun());
        cat.swim(cat.getLength(), cat.getLimitForSwim());

        System.out.println("Total quantity = " +(Dog.numbersOfDog + Cat.numbersOfCat));

    }


}

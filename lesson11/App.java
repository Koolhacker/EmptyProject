package lesson11;

import java.util.Optional;

public class App {
    public static void main(String[] args) {

        Optional<Car> carOptional = findByName("");

        System.out.println(carOptional);
        String car = carOptional.get().name;
        System.out.println(car);
        String car1 = String.valueOf(carOptional.orElse(new Car("newCar", 29)));
        System.out.println(car1);


//        System.out.println(" 1 ======  " + carOptional.map(Car::getName));
    }

    private static Optional<Car> findByName(String name) {

        Car car = new Car(name, 27);
        return Optional.of(car);
    }
}

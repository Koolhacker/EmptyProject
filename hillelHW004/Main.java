package hillelHW004;

public class Main {
    public static void main(String[] args) {
        double total = 0;
        Figure[] figure = new Figure[]{
                new Circle(5),
                new Circle(20),
                new Triangle(5,6,7),
                new Triangle(2.2,2.2,2.2),
                new Foursquare(5),
                new Foursquare(10)
        };

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Square of figure " + (i + 1) + " = " + figure[i].squareResult());
            total += figure[i].squareResult();
        }
        System.out.println("\nTotal square of all figures = " + total);
    }
}

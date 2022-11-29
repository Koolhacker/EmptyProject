package hillelHW004;

public class Foursquare implements Figure {

    private double a;

    public Foursquare(double a) {
        this.a = a;
    }

    @Override
    public double squareResult() {
        return a * a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}

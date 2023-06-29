package Lesson6;



public class App {
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
        }
        // а если нечетное, что нам возвращать?
        return 1;
    }

    public static void main(String[] args) {
        App example = new App();

        System.out.println(example.sqr(2));
    }

    }



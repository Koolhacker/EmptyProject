package hillelHW005;

public class HomeWorkApp {
    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public void checkSumSign(int a, int b) {
        System.out.println((a + b >= 0) ? "Sum is positive" : "Sum is negative");
    }

    public void printColour(int value) {
        /**
         *  this method build on ternary operator and print: color
         *  if value <= 0 - print Red
         *  if value >= 1 && <= 100 - print Yellow
         *  if value >=101 - print Green
         */
        System.out.println((value <= 0) ? "Red" : (value >= 101) ? "Green" : "Yellow");
    }
    // у меня есть вопрос
    // терзают смутные сомнения - получается это говноКод ?
    // (когда комментарий выглядит так как мог бы выглядеть код и комментарий бы не потребовался...)

    public void compareNumbers(int a, int b) {
        System.out.println((a >= b) ? "a>=b" : "a<b");
    }

    public boolean isTrue(int a, int b) {
        /**
         *  this method build on ternary operator and return value: true or false
         *  if sum of values  >= 10 && sum of values <= 20 return true
         *  else return false
         */
        return a + b >= 10 && a + b <= 20;
    }

    public void isPositive(int a) {
        System.out.println((a >= 0) ? "Positive" : "Negative");
    }

    public boolean isTrue(int a) {
        return a < 0;
    }

    public void printString(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    public boolean leapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        HomeWorkApp hwa = new HomeWorkApp();
//        hwa.printThreeWords();
//        hwa.checkSumSign(2, 2);
//        hwa.checkSumSign(-5, 2);
//        hwa.printColour(-1);
//        hwa.printColour(1);
//        hwa.printColour(546);
//        hwa.compareNumbers(1, 1);
//        hwa.compareNumbers(1, 2);
//        hwa.compareNumbers(2, 1);
//        System.out.println(hwa.isTrue(5, 5));
//        System.out.println(hwa.isTrue(1, 1));
//        hwa.isPositive(-1);
//        hwa.isPositive(0);
//        System.out.println(hwa.isTrue(-1));
//        System.out.println(hwa.isTrue(0));
//        hwa.printString("Happy new year", 3);
        System.out.println(hwa.leapYear(2020));
        System.out.println(hwa.leapYear(2022));
    }
}

package hackerRank;

public class ArithmeticOperators {
    public static void main(String[] args) {
        double meal_cost = 10.25;
        int tip_percent = 17;
        int tax_percent = 5;
        solve(meal_cost, tip_percent, tax_percent);
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost / 100 * tip_percent;
        double tax = meal_cost / 100 * tax_percent;
        int  total = (int) Math.round(meal_cost + tip + tax);

        System.out.println(total);

    }
}

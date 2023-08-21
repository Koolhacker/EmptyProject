package hackerRank;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate twoMonthsLater = currentDate.plusMonths(2);

        if (twoMonthsLater.getDayOfWeek() == DayOfWeek.SATURDAY || twoMonthsLater.getDayOfWeek() == DayOfWeek.SUNDAY )
            System.out.println("It will be weekend day");
        else
            System.out.println("It will be working day");
        System.out.println();
        System.out.println(twoMonthsLater);
    }
}

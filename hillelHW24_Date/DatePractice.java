package hillelHW24_Date;

import java.time.LocalDate;
import java.time.LocalTime;

public class DatePractice {
    public static void main(String[] args) {


        LocalDate date;
        date = LocalDate.now();
        System.out.println("Current Date: " + date);
        LocalTime timeObject;
        timeObject = LocalTime.now();
        System.out.println("Current Time: " + timeObject);
    }
}

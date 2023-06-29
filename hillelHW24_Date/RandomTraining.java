package hillelHW24_Date;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTraining {
    public static void main(String[] args) {

        System.out.println(countryGenerator());
    }

    private static String countryGenerator() {
        List<String> countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("USA");
        countries.add("Great Britain");
        countries.add("France");
        countries.add("Germany");
        countries.add("Italy");
        countries.add("Denmark");
        countries.add("Poland");
        countries.add("Zimbabwe");
        countries.add("Qatar");
        Random rand = new Random();
        int r = rand.nextInt(10);
        return countries.get(r);
    }
}
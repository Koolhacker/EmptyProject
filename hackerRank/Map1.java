package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> passportAndName = new HashMap<>();
        passportAndName.put(112233, "LLL");
        passportAndName.put(112232, "DDD");
        passportAndName.put(112231, "FFF");

        System.out.println(passportAndName);
        System.out.println(passportAndName.keySet());
        System.out.println(passportAndName.values());
//        System.out.println(passportAndName.get());

    }
}

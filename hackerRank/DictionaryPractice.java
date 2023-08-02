package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args) {
        Map<String, String> engSpainDictionary = new HashMap<>();

        engSpainDictionary.put("monday", "lunes");
        engSpainDictionary.put("tuesday", "martes");
        engSpainDictionary.put("wednesday", "miercoles");
        engSpainDictionary.put("thursday", "jueves");
        engSpainDictionary.put("friday", "viernes");

        System.out.println(engSpainDictionary.get("monday"));
        System.out.println(engSpainDictionary.get("tuesday"));
        System.out.println(engSpainDictionary.get("wednesday"));
        System.out.println(engSpainDictionary.get("thursday"));
        System.out.println(engSpainDictionary.get("friday"));

        System.out.println(engSpainDictionary);
        System.out.println(engSpainDictionary.keySet());
        System.out.println(engSpainDictionary.values());
        System.out.println(engSpainDictionary.size());
    }
}

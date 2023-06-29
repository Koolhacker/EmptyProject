package Lesson10;

import java.util.ArrayList;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayListString1 = new ArrayList<>();
        arrayListString1.add("vova");
        arrayListString1.add("vovan");
        arrayListString1.add("vovanishe");
        arrayListString1.add(null);
        arrayListString1.add(null);
        System.out.println(arrayListString1);
        System.out.println(arrayListString1.get(4));



    }


}
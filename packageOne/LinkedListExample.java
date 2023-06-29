package packageOne;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        // add elements
        list.add("b");
        list.add("c");
        list.add("dura");
        list.add("e");
        list.add("f");
        list.addLast("Z");
        list.addFirst("A");

        System.out.println(list);

        list.remove(0);
        list.remove("e");
        System.out.print("\n " + list);

        // Get and  Set a value

        String value = list.get(2);

        System.out.print("\n" + list);

        list.set(0,value + " changed");
        System.out.print("\n" + list);


    }
}

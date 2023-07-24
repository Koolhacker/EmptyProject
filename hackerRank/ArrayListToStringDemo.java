package hackerRank;

import java.util.Arrays;
import java.util.List;

public class ArrayListToStringDemo {
    public static void main(String[] args) {
        List<String> arrayList = List.of("C","A","E","B","D","F");
        Object [] objectArray = arrayList.toArray();
        Arrays.sort(objectArray);
        System.out.println(Arrays.toString(objectArray));

        int[] array = {1, 4, 6, 3, 8};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String[][] array1 = {{"один-один", "один-два", "один-три"},
                {"два-один", "два-два", "два-три"}};
        System.out.println(Arrays.deepToString(array1));

        int[] scores = {3, 5, 7};
        int[] a = new int[15];
        for(int i = 0; i < a.length; i++)
        System.out.println(a[i]);

        double array5[] = {3, 5, 8};
        String cats[] = {"Fluffy", "Spot", "Zeus"};
        boolean results[] = new boolean[]{true, false, true};
        int [ ][ ] scoress = {{2,7,6}, {9,3,45}};
        int[] arrayyy = new int[4];

//        int[] array = {5; 7; 3};
    }
}

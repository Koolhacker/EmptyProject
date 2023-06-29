package packageTwo;

import java.util.Arrays;

public class Bubble {


    public static void main(String[] args) {
        int[] array = {45, 5, 8, 6, 9, 4, 56, 1, 2, 3, 7};

        System.out.println(Arrays.toString(array));

        boolean isSorted = false;
        int temp;
        int counter = 0;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    counter++;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(array));
        System.out.println(counter);
    }
}

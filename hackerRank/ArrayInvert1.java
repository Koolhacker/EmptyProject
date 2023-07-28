package hackerRank;

import java.util.Arrays;

public class ArrayInvert1 {
    public static void main(String[] args) {

//     Object
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1, 2, 3,4});
        testInvert(new int[]{0, 1, 2, 3, 43333});
    }

    private static void testInvert(int[] array) {
        System.out.print(Arrays.toString(array) + " => ");
        invert(array);
        System.out.println(Arrays.toString(array));
    }

    private static void invert(int [] array){
        for (int i =0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = temp;
        }

    }
}

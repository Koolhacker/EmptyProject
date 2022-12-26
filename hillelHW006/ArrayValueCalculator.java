package hillelHW006;

public class ArrayValueCalculator {
    /**
     * quick search and change array size
     */
    int arraySize1 = 4;
    int arraySize2 = 4;

    public int doCalc(String[][] arr) throws ArraySizeException {
        int finalResult = 0;

        if (arraySize1 != arr.length) {
            throw new ArraySizeException("   Wrong size 1");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arraySize2 != arr[i].length) {
                throw new ArraySizeException("   Wrong size 2");
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    finalResult += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException nfe) {
//                    System.err.println("ArrayDataException - Wrong value in array " + i + " cell " + j);
                    System.out.println("ArrayDataException - Wrong value in array " + i + " cell " + j);
                }
            }
        }
        // throw ArrayDataException
        return finalResult;
    }

    public static class ArraySizeException extends Exception {
        public ArraySizeException(String text) {
            super(text);
        }
    }

    public static void main(String[] args) throws ArraySizeException {

        ArrayValueCalculator calc1 = new ArrayValueCalculator();

        String[][] arr1 = {{"1", "1", "1", "1"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"}};

        String[][] arr2 = new String[][]{{"5", "5", "5", "k"},
//                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"3", "3", "3", "3"}};

        System.out.println(calc1.doCalc(arr1));
        System.out.println("******");
        System.out.println(calc1.doCalc(arr2));
        System.out.println("///////");
    }
}



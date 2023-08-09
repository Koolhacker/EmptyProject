package hackerRank;

public class Exception1 {

    public static void main(String[] args) {
        Integer[] intArray = new Integer[10];
        try {
            System.out.println(intArray[9]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you have exception " + e);
        } finally {
            System.out.println("yo ho ho!  my congratulations");
        }



        String s = "a";
        try{
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException nfe) {
            System.out.println("Bad string");
        }
    }
}

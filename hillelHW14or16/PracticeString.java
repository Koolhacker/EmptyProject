package hillelHW14or16;

public class PracticeString {
    public static void main(String[] args) {

        System.out.println(findSymbolOccurance("Hello helicopter", 'l'));

        System.out.println(findWordPosition("Apollo", "pollo"));
        System.out.println(findWordPosition("Apollo", "trrt"));

        System.out.println("S A M S U N G");
        System.out.println(stringReverse("S A M S U N G"));

        System.out.println(isPalindrome("ASA"));


    }

    public static int findSymbolOccurance(String str, char symbol) {
        int counter = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == symbol)
                counter++;
        return counter;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return String.valueOf(sb.reverse());
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
//        return str.equals(String.valueOf(sb.reverse()));
//        or alternative variant
        return str.equals(sb.reverse().toString());
    }
}

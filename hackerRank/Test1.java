package hackerRank;

public class Test1 {
    public static void main(String[] args) {
        String a = "newspaper";
        a = a.substring(5, 7);
        char b = a.charAt(1);
        a = a + b;
        System.out.println(a);

        String javaStr = "java2";
        System.out.println(javaStr.charAt(2));

        String testStr = "testStr";
        System.out.println(testStr.length());
//        String word = "abcde";
//        for (int i = 0; i < 4; i += 2) {
//            System.out.print(word[i]);
//        }
        String[] strArray = new String[6];
        System.out.println(strArray.length);

        String str = null;
        System.out.println(str);

        String friendStr = "myDearFriend";
        System.out.println(friendStr.substring(6));
        System.out.println(friendStr.substring(2, 6));
    }
}

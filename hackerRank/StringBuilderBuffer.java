package hackerRank;

public class StringBuilderBuffer {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        System.out.println("charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(3);
        System.out.println(sb);

        int a = 42;
        StringBuilder sb1 = new StringBuilder(40);
        String s = sb1.append("a = ").append(a).append("!").toString();
        System.out.println(s);

        StringBuilder sb3 = new StringBuilder("I Java!");
        sb3.insert(2, "like ");
        System.out.println(sb3);

        StringBuilder s1 = new StringBuilder("abcdef");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);

        StringBuilder sb4 = new StringBuilder("This is a test.");
        sb4.delete(4, 7);
        System.out.println("После delete: " + sb4);
        sb4.deleteCharAt(0);
        System.out.println("После deleteCharAt: " + sb4);
        System.out.println(sb4);

        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");



        System.out.println(stringBuilder1.equals(stringBuilder2));
        System.out.println(stringBuilder1 == stringBuilder2);
    }

}

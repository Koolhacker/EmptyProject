package hillelHW14;

import java.util.Random;
import java.util.Scanner;

public class SixTask {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        String rndWord = words[new Random().nextInt(words.length)];
        System.out.println(rndWord);
        Scanner sc = new Scanner(System.in);
        System.out.println("  Enter your answer :");
        String answer = sc.next().toLowerCase();
        while (!rndWord.equals(answer)) {

//            taskWithStar1(rndWord,answer);
   //         System.out.println(taskWithStar2(rndWord, answer));
            System.out.println(taskWithStar3(rndWord, answer));

            System.out.println("------------------");
            System.out.println("  Try again ! ");
            answer = sc.next().toLowerCase();
        }
        if (rndWord.equals(answer)) {
            System.out.println("YO-HOOO!  You won !!!");
        }
    }

    public static String taskWithStar3(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                sb1 = sb1.replace(i, i + 1, "@");
                sb1 = sb1.append("@@@@@@@@@@");
            }
        }
        return sb1.toString();
    }

    public static String taskWithStar2(String str1, String str2) {
        StringBuilder sb1 = new StringBuilder("@@@@@@@@@@@@@@@@");
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sb1 = new StringBuilder(sb1.substring(0, i) + str1.charAt(i) + sb1.substring(i + 1));
            }
        }
        return sb1.toString();
    }

    public static void taskWithStar1(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                arr1[i] = arr2[i];
            } else {
                arr1[i] = '@';
            }
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
    }
}

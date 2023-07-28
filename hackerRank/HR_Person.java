package hackerRank;

import java.util.Scanner;

public class HR_Person {
    private int age;

    public HR_Person(int initialAge) {
        this.age = initialAge;
        if (initialAge <= 0)
            System.out.println("Age is not valid, setting age to 0.");
    }

    public void amIOld() {
        String answer = null;
        if (age < 13)
            answer = "You are young.";
        else if (age < 18)
            answer = "You are a teenager.";
        else
            answer = "You are old.";
        System.out.println(answer);
    }

    public void yearPasses() {
        this.age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            HR_Person p = new HR_Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}


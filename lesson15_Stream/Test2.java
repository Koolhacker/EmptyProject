package lesson15_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 21, 2, 6.9);
        Student st3 = new Student("Vladimir", 'm', 23, 3, 5.6);
        Student st4 = new Student("Alexandra", 'f', 20, 1, 8.1);
        Student st5 = new Student("Zinaida", 'f', 24, 4, 9.5);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().map(e ->
                {
                    e.setName(e.getName().toUpperCase());
                    return e;
                })
                .filter(e -> e.getSex() == 'm')
                .sorted((x, y) -> x.getAge() - y.getAge())
                .forEach(e -> System.out.println(e));



        students = students.stream().sorted((x, y) ->
                        x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());

//        System.out.println(students);

        List<Student> students2 = students.stream()
                .filter(e -> e.getAge() > 22 && e.getAvgGrade() < 7.2)
                .collect(Collectors.toList());

//        System.out.println(students);
//        System.out.println(students2);
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student() {
    }

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }


}
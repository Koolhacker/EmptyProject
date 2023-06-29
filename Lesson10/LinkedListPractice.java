package Lesson10;

import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        Student st1 = new Student("ivan", 1);
        Student st2 = new Student("nina", 2);
        Student st3 = new Student("mama", 3);
        Student st4 = new Student("papa", 4);
        Student st5 = new Student("lira", 1);
        Student st6 = new Student("pivo", 2);
        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        studentLinkedList.add(st6);
        System.out.println(studentLinkedList);
        studentLinkedList.add(1, new Student("vodka", 0));
        studentLinkedList.remove(0);
        System.out.println(studentLinkedList);

    }
}

class Student {
    String name;
    int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

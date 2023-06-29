package lesson15Lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> als, Test.StudentsChecks sc) {
        for (Student s : als) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 21, 2, 6.9);
        Student st3 = new Student("Vladimir", 'm', 23, 3, 5.6);
        Student st4 = new Student("Alexandra", 'f', 20, 1, 8.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(new Student("Zinaida", 'f', 24, 4, 9.5));
        System.out.println(students);
        StudentInfo info = new StudentInfo();

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course - s2.course;
//            }
//        });
        students.sort((stud1, stud2) -> stud1.age - stud2.age);
        System.out.println(students);


//        info.printStudentsOverGrade(students,8.1);
//        info.printStudentsUnderAge(students, 21);
//        info.printStudentsMixCondition(students, 20, 10,'f');
//        info.testStudents(students,new CheckOverGrade());

//        info.testStudents(students, new StudentsChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.age > 22;
//            }
//        });

//        info.testStudents(students, s -> s.avgGrade > 9);
//
//        StudentsChecks sci = s -> s.avgGrade > 9;
//        info.testStudents(students, sci);

//        System.out.println("******");
//
//        info.testStudents(students,
//                (Student s) -> {
//                    return s.age > 22;
//                });

//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student st : al) {
//            if (st.avgGrade >= grade) {
//                System.out.println(st);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student st : al) {
//            if (st.age <= age) {
//                System.out.println(st);
//            }
//        }
//
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student st : al) {
//            if (st.age > age && st.avgGrade < grade && st.sex == sex) {
//                System.out.println(st);
//            }
//        }
//    }
    }

    @FunctionalInterface
    interface StudentsChecks {
        boolean check(Student s);
    }

//    class CheckOverGrade implements StudentsChecks {
//        @Override
//        public boolean check(Student s) {
//            return s.avgGrade > 8;
//        }
//    }
}

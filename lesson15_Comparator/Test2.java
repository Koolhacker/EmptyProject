package lesson15_Comparator;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10,"Zaur","Tregulov", 1200));
        list.add(new Employee(20,"Vova","Tregulovich", 1400));
        list.add(new Employee(30,"Petya","PereTregulov", 1300));


    }
}

class Employee{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
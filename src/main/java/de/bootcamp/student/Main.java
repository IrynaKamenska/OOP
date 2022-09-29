package de.bootcamp.student;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", 1, 30);
        Student st2 = new Student("Alice", 2, 30);
        System.out.println(st1);

        st1.setAge(35);
        System.out.println(st1.getAge());
        System.out.println(st1);


    }
}

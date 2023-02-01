package org.example;

public class School {
    public static void main(String[] args) {
        Student student1=new Student("Mike",'C',2);
        System.out.println(student1.getGrade());
        System.out.println(student1.getName());
        System.out.println(student1.upgrade());
        System.out.println(student1.downgrade());

        Student student2=new Student("Mike",'B',2);
        System.out.println(student2.getGrade());
        System.out.println(student2.getName());
        System.out.println(student2.upgrade());
        System.out.println(student2.downgrade());

        Student student3=new Student("Mike",'D',2);
        System.out.println(student3.getGrade());
        System.out.println(student3.getName());
        System.out.println(student3.upgrade());
        System.out.println(student3.downgrade());

    }
}
package com.simple.staticEx;

class Student {
    private String name;

    // static 변수 : 모든 Student 객체가 공유
    private static int count = 0;

    public Student(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticTest {
    public static void main(String[] args) {

        System.out.println(" 학생 수 :"+ Student.getCount());

//        Math.random();

        Student s1 = new Student("철수");
        System.out.println(" 학생 수 :"+s1.getCount());
        Student s2 = new Student("영희");
        Student s3 = new Student("민수");
        //System.out.println(" 학생 수 :"+ Student.count);

        System.out.println(" 학생 수 :"+s2.getCount());
        System.out.println(" 학생 수 :"+s3.getCount());
    }
}

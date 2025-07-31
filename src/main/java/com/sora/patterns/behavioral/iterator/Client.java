package com.sora.patterns.behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        StudentAggregate studentAggregate  =new StudentAggregateImpl();

        studentAggregate.add(new Student("jack","001"));
        studentAggregate.add(new Student("rose","002"));
        studentAggregate.add(new Student("dick","003"));
        studentAggregate.add(new Student("jessica","004"));
        studentAggregate.add(new Student("zeus","005"));


        StudentIterator studentIterator = studentAggregate.getStudentIterator();

        while (studentIterator.hasNext()) {
            Student next = studentIterator.next();
            System.out.println(next.getName() + " " + next.getNumber());
        }
    }
}

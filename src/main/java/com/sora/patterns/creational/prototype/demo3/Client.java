package com.sora.patterns.creational.prototype.demo3;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Student student = new Student();
        student.setName("jack");
        citation.setStudent(student);
        Citation clone = citation.clone();

        clone.getStudent().setName("rose");

        System.out.println(citation.getStudent().getName());
        System.out.println(clone.getStudent().getName());


        System.out.println("===============");

    }
}

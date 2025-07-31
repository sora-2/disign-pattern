package com.sora.patterns.behavioral.iterator;

public interface StudentAggregate {

    void add(Student student);

    void remove(Student student);

    StudentIterator getStudentIterator();
}

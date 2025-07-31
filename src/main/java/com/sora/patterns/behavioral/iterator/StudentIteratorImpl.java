package com.sora.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentIteratorImpl implements StudentIterator{
    private List<Student> studentList;
    private int index=0;
    @Override
    public boolean hasNext() {
        return index<studentList.size();
    }

    @Override
    public Student next() {
        Student student = studentList.get(index);
        index++;
        return student;
    }

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }
}

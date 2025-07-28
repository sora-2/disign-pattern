package com.sora.patterns.creational.prototype.demo3;

public class Citation implements Cloneable{
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        Citation clone = (Citation) super.clone();
        clone.student = student.clone();
        return clone;
    }
}

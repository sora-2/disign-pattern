package com.sora.principle.liskovsubstitution.demo1;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("======================");

        Square square = new Square();
        square.setLength(20);
        square.setWidth(20);
        resize(square);
        printLengthAndWidth(square);
    }

    public static void resize(Rectangle rectangle){
        while (rectangle.getLength() >= rectangle.getWidth()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle){
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
    }
}

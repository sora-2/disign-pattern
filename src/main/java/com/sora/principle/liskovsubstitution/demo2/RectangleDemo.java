package com.sora.principle.liskovsubstitution.demo2;



public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        System.out.println("======================");

        Square square = new Square();
        square.setSide(20);
        printLengthAndWidth(square);
    }

    public static void resize(Rectangle rectangle){
        while (rectangle.getLength() >= rectangle.getWidth()){
            rectangle.setWidth(rectangle.getWidth()+1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }
}

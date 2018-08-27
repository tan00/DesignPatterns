package com.factory;

public class FactoryPatternDemo {

    public  static void main(String[] args) {
        Shape shape1 =    ShapeFactory.getShape("Circle");
        Shape shape2 =    ShapeFactory.getShape("rectangle");

        shape1.draw();
        shape2.draw();

    }


}

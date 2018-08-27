package com.factory;

public class FactoryPatternDemo {

    public  static void main(String[] args) {
        shape shapeins =    ShapeFactory.getShape("circle");

        shapeins.draw();

    }


}

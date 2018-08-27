package com.AbstractFactory;


public class ShapeFactory extends AbstractFactory{
    public  Shape getShape(String shapeString){
        if(shapeString == null){
            return null;
        }
        if(shapeString.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeString.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    public  Color getColor(String color) {
        return null;
    }

}

package com.factory;

public class ShapeFactory {
    public  static Shape getShape(String shapeString){
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

}

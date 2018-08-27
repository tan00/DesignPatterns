package com.factory;

public class ShapeFactory {
    public  static  shape getShape(String shapeString){
        if(shapeString == null){
            return null;
        }
        if(shapeString.equalsIgnoreCase("CIRCLE")){
            return new circle();
        }
        return null;
    }

}

package com.AbstractFactory;

public class ColorFactory extends AbstractFactory{
    public  Color getColor(String color){
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String color) {
        return null;
    }

}

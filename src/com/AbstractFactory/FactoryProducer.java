package com.AbstractFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String factroy){
        if(factroy.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(factroy.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}

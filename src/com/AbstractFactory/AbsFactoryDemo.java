package com.AbstractFactory;

public class AbsFactoryDemo {

    public static  void main(String[] args){
        FactoryProducer fac = new FactoryProducer();

        AbstractFactory clororFac = fac.getFactory("color");
        AbstractFactory shapeFac = fac.getFactory("shape");

        Color color =  clororFac.getColor("green");
        Shape shape =  shapeFac.getShape("circle");

        color.fill();
        shape.draw();
    }

}

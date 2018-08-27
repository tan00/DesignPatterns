package com.AbstractFactory;

public class Red implements Color {
    @Override
    public void fill(){
        System.out.println("call Red.fill ");
    }
}

package com.Singleton;

public class Singleton {
    //私有构造函数
    private Singleton(){ }

    private static Singleton instance = new Singleton();

    //获取唯一可用的对象
    public static Singleton getInstance(){
        return instance;
    }

}

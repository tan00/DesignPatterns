package com.strategy;

public class Duck {

    public static void main(String[] args) {
        // write your code here

        Duck duck = new Duck();

        QuackBehavior  qb = new QuackType1();

        duck.setQuackBehavior(qb);
        duck.quack();

    }

    QuackBehavior  quackBehavior;

    void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }
    void quack()
    {
        quackBehavior.quark();
    }
}

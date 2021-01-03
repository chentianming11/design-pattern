package com.github.chentianming11.pattern.strategy.duck;

import com.github.chentianming11.pattern.strategy.behavior.FlyBehavior;
import com.github.chentianming11.pattern.strategy.behavior.QuackBehavior;
import lombok.Setter;

/**
 * @author 陈添明
 * @date 2018/12/23
 */

public abstract class Duck {

    @Setter
    FlyBehavior flyBehavior;
    @Setter
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("所有鸭子都可以游泳。。。");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}

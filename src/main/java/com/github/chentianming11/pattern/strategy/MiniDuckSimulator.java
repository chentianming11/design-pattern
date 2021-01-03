package com.github.chentianming11.pattern.strategy;

import com.github.chentianming11.pattern.strategy.duck.Duck;
import com.github.chentianming11.pattern.strategy.duck.MallardDuck;

/**
 * @author 陈添明
 * @date 2018/12/23
 */
public class MiniDuckSimulator {


    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}

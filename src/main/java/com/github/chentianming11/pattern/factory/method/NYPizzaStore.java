package com.github.chentianming11.pattern.factory.method;

import com.github.chentianming11.pattern.factory.Pizza;

/**
 * @author 陈添明
 * @date 2019/1/1
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYCheesePizza();
        } else {
            return null;
        }
    }
}

package com.github.chentianming11.pattern.factory.method;

import com.github.chentianming11.pattern.factory.Pizza;

/**
 * @author 陈添明
 * @date 2019/1/1
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}

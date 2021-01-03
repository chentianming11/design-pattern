package com.github.chentianming11.pattern.factory.abs.pizza;

import com.github.chentianming11.pattern.factory.abs.PizzaIngredientFactory;
import com.github.chentianming11.pattern.factory.abs.dough.Dough;
import com.github.chentianming11.pattern.factory.abs.sauce.Sauce;

/**
 * @author 陈添明
 * @date 2019/1/1
 */
public abstract class Pizza {

    protected PizzaIngredientFactory pizzaIngredientFactory;

    protected Dough dough;

    protected Sauce sauce;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println("烘烤披萨");
    }

    public void cut(){
        System.out.println("切片");
    }
    public void box(){
        System.out.println("装盒");
    }

}

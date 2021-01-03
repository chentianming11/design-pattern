package com.github.chentianming11.pattern.factory.abs.pizza;


import com.github.chentianming11.pattern.factory.abs.PizzaIngredientFactory;

/**
 * @author 陈添明
 * @date 2019/1/1
 */
public class CheesePizza extends Pizza {

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public void prepare() {
        System.out.println("准备披萨");
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
    }
}

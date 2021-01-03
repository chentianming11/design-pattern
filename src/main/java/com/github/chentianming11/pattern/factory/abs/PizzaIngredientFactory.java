package com.github.chentianming11.pattern.factory.abs;


import com.github.chentianming11.pattern.factory.abs.dough.Dough;
import com.github.chentianming11.pattern.factory.abs.sauce.Sauce;

/**
 * 原料工厂接口
 * @author 陈添明
 * @date 2019/1/1
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

}

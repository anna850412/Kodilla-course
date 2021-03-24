package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithMushrooms extends AbstractPizzaOrderDecorator{
    public PizzaWithMushrooms(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(3.00));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " mushrooms";
    }
}

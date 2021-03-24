package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithOnion extends AbstractPizzaOrderDecorator{
    public PizzaWithOnion(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(2.00));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " onion";
    }
}

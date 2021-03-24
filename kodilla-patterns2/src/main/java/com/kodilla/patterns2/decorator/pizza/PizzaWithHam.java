package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithHam extends AbstractPizzaOrderDecorator{
    public PizzaWithHam(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(5.00));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + " ham";
    }
}

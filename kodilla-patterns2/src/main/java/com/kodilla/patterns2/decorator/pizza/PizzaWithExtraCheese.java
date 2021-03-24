package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaWithExtraCheese extends AbstractPizzaOrderDecorator {
    public PizzaWithExtraCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(5.00));
    }
    @Override
    public String getDescription(){
        return super.getDescription() + "extra cheese";
    }
}

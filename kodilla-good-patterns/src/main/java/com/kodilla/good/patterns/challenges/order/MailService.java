package com.kodilla.good.patterns.challenges.order;

public class MailService implements  InformationService{

    @Override
    public void inform(User user) {
        System.out.println("Product has been ordered");
    }
}

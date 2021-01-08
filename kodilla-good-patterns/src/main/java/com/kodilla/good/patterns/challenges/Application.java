package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {

OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderService(),
                new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
//
//        ProductOrderService productOrderService = new ProductOrderService();
//        MailService mailService = new MailService() {
//            @Override
//            public void sentEmail(User user) {
//
//            }
//        };
//        ProductOrderRepository productOrderRepository = new ProductOrderRepository();
//        boolean isOrdered = productOrderService.order(user,product);
//        if(isOrdered){
//            mailService.sentEmail(user);
//            productOrderRepository.createProductOrder(user,product);
//        } else {
//            System.out.println("Product order has been rejected! Please contact with helpline +48 567 789 987");
//
//        }



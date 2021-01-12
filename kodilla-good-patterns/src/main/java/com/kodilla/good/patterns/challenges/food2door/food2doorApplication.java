package com.kodilla.good.patterns.challenges.food2door;

public class food2doorApplication {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderResultDto orderResultDto = new OrderResultDto();
        Product product = new Product("onion", 'V', 2);
        ResultDto resultDto = new ResultDto(product, true);
        orderResultDto.addResult(resultDto);
        System.out.println(resultDto);

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
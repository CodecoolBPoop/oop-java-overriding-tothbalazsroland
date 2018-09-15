package com.codecool.uml.overriding;

public class Order implements Orderable {
    private int id;
    private String status = "new";
    private static int howmanyOrders = 0;

    public int getId() {
        return id;
    }

    public Order() {
        this.id = howmanyOrders +1;
        howmanyOrders += 1;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean checkout() {
        CheckoutProcess checkoutProcess = new CheckoutProcess();
        checkoutProcess.process(this);
        return true;
    }

    @Override
    public boolean pay() {
        PaymentProcess paymentProcess = new PaymentProcess();
        paymentProcess.process(this);
        return true;
    }
}

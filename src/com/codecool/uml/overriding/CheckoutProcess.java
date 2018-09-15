package com.codecool.uml.overriding;

public class CheckoutProcess extends AbstractProcess{
    @Override
    protected void action(Order item) {
        if (item.getStatus()=="checked"){
            System.out.println("This item is already checked out!");
        }else if (item.getStatus()=="paid"){
            System.out.println("This item is already paid!");
        }else {
            System.out.println("checking out");
            item.setStatus("checked");
            System.out.println(item.getStatus());

        }
    }
}

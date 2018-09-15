package com.codecool.uml.overriding;

import java.sql.SQLOutput;

public class PaymentProcess extends AbstractProcess {

    @Override
    protected void action(Order item) {
        if (item.getStatus()=="new"){
            System.out.println("The item must be checked out before payment!");
        }else if (item.getStatus()=="paid"){
            System.out.println("This item is already paid!");
        }else {
            System.out.println("paying the stuff");
            item.setStatus("paid");
            System.out.println(item.getStatus());
        }
    }
}

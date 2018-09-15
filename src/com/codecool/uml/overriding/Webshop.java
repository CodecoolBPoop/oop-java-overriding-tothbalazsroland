package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
	// write your code here
        Order order1 = new Order();
        Order order2 = new Order();
        order1.checkout();
        order2.checkout();
        order1.pay();
        order2.pay();
        order1.pay();
        order1.checkout();
        Order order3 = new Order();
        order3.checkout();
        order3.checkout();
        order3.pay();
    }
}

package com.codecool.uml.overriding;

public abstract class AbstractProcess {
    public void process(Order item){
        stepBefore();
        action(item);
        stepAfter();

    }
    public void stepBefore(){
        System.out.println("DOING STUFF BEFORE");
    }
    abstract protected void action(Order item);

    public void stepAfter(){
        System.out.println("DOINGSTUFF AFTER");
    }
}

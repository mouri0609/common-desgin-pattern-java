package designPattern.AbstractFactory.Implements;

import designPattern.AbstractFactory.Interface.OperatorController;

public class AndroidOperator implements OperatorController {
    @Override
    public void display() {
        System.out.println("AndroidOperator");
    }
}

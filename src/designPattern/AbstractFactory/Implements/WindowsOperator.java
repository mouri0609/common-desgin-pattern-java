package designPattern.AbstractFactory.Implements;

import designPattern.AbstractFactory.Interface.OperatorController;

public class WindowsOperator implements OperatorController {
    @Override
    public void display() {
        System.out.println("WindowsOperator");
    }
}

package designPattern.AbstractFactory.Implements;

import designPattern.AbstractFactory.Interface.OperatorController;

public class SymbianOperator implements OperatorController {
    @Override
    public void display() {
        System.out.println("SymbianOperator");
    }
}

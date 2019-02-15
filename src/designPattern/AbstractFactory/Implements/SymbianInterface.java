package designPattern.AbstractFactory.Implements;

import designPattern.AbstractFactory.Interface.InterfaceController;

public class SymbianInterface implements InterfaceController {
    @Override
    public void display() {
        System.out.println("SymbianInterface");
    }
}

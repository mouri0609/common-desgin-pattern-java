package designPattern.AbstractFactory.Implements;

import designPattern.AbstractFactory.Interface.InterfaceController;

public class WindowsInterface implements InterfaceController {
    @Override
    public void display() {
        System.out.println("WindowsInterface");
    }
}

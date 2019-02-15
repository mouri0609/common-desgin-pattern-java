package designPattern.AbstractFactory.Implements;

import designPattern.AbstractFactory.Interface.InterfaceController;

public class AndroidInterface implements InterfaceController {
    @Override
    public void display() {
        System.out.println("AndroidInterface");
    }
}

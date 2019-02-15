package designPattern.AbstractFactory;

import designPattern.AbstractFactory.Implements.WindowsInterface;
import designPattern.AbstractFactory.Implements.WindowsOperator;
import designPattern.AbstractFactory.Interface.InterfaceController;
import designPattern.AbstractFactory.Interface.OperatorController;

public class WindowsFactory implements AbstarctFactory {
    @Override
    public OperatorController createOperator() {
        return new WindowsOperator();
    }

    @Override
    public InterfaceController createInterface() {
        return new WindowsInterface();
    }
}

package designPattern.AbstractFactory;

import designPattern.AbstractFactory.AbstarctFactory;
import designPattern.AbstractFactory.Implements.AndroidInterface;
import designPattern.AbstractFactory.Implements.AndroidOperator;
import designPattern.AbstractFactory.Interface.InterfaceController;
import designPattern.AbstractFactory.Interface.OperatorController;

public class AndroidFactory implements AbstarctFactory {
    @Override
    public OperatorController createOperator() {
        return new AndroidOperator();
    }

    @Override
    public InterfaceController createInterface() {
        return new AndroidInterface();
    }
}

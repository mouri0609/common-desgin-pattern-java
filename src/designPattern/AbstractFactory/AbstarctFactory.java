package designPattern.AbstractFactory;

import designPattern.AbstractFactory.Interface.InterfaceController;
import designPattern.AbstractFactory.Interface.OperatorController;

public interface AbstarctFactory {
    public OperatorController createOperator();
    public InterfaceController createInterface();
}

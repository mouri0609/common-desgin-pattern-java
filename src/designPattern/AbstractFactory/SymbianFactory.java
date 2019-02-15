package designPattern.AbstractFactory;

import designPattern.AbstractFactory.Implements.SymbianInterface;
import designPattern.AbstractFactory.Implements.SymbianOperator;
import designPattern.AbstractFactory.Interface.InterfaceController;
import designPattern.AbstractFactory.Interface.OperatorController;

public class SymbianFactory implements AbstarctFactory {
    @Override
    public OperatorController createOperator() {
        return new SymbianOperator();
    }

    @Override
    public InterfaceController createInterface() {
        return new SymbianInterface();
    }
}

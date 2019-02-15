package designPattern.AbstractFactory;

public class test {
    public static void main(String[] args) {
        AbstarctFactory factory = new AndroidFactory();
        factory.createInterface().display();
        factory.createOperator().display();
    }
}

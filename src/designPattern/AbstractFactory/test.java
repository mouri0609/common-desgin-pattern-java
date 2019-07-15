package designPattern.AbstractFactory;

public class test {
    public static void main(String[] args) {
        AbstarctFactory factory = new AndroidFactory();
        factory.createInterface().display();
        factory.createOperator().display();
    }
}
/*
1、如果要切换工厂，只需要在最开始初始化工厂类的时候换另一家工厂就好了，而整个结构都无需改动。
2、如果增加部件，好处是已有的部件类不需要改动。
3、如果增加工厂，好处是已有工厂类和部件类都不需要改动。

综上所述，抽象工厂模式基本上完美的遵循了开放封闭原则，即使第二种情况需要修改已有的工厂类，
但由于工厂类的职责是去初始化并返回一个真正的部件生产类，因此已有的核心类部件类依然没有因为扩展而做过任何修改。
 */
package designPattern.Proxy.Dynamic;

public class test {
    /*
    在动态代理中我们不再需要再手动的创建代理类，我们只需要编写一个动态处理器就可以了。真正的代理对象由JDK再运行时为我们动态的来创建。
     */
    public static void main(String[] args) {

        DaoInterface daoInterface = (DaoInterface) new DynamicProxy().bind(new UserDao());
        daoInterface.add("method");

    }
}

package designPattern.Proxy.Static;

public class UserDao implements DaoInterface{

    @Override
    public void add() {
        System.out.println("ִ��add");
    }

    @Override
    public void delete() {
        System.out.println("ִ��delete");
    }

    @Override
    public void update() {
        System.out.println("ִ��update");
    }

    @Override
    public void read() {
        System.out.println("ִ��read");
    }
}

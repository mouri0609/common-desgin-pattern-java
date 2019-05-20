package designPattern.Proxy.Cglib;

import designPattern.Proxy.Dynamic.DaoInterface;

public class UserDao implements DaoInterface {

    @Override
    public void add(String name) {
        System.out.println(name+"ִ��add");
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

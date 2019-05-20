package designPattern.Proxy.Cglib;

import designPattern.Proxy.Dynamic.DaoInterface;

public class UserDao implements DaoInterface {

    @Override
    public void add(String name) {
        System.out.println(name+"执行add");
    }

    @Override
    public void delete() {
        System.out.println("执行delete");
    }

    @Override
    public void update() {
        System.out.println("执行update");
    }

    @Override
    public void read() {
        System.out.println("执行read");
    }
}

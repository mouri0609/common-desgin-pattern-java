package designPattern.Proxy.Static;

public class UserDaoProxy implements DaoInterface {

    DaoInterface daoInterface;
    public UserDaoProxy(DaoInterface daoInterface){
        this.daoInterface = daoInterface;
    }

    @Override
    public void add() {
        daoInterface.add();
        System.out.println("��¼add");
    }

    @Override
    public void delete() {
        daoInterface.delete();
        System.out.println("��¼delete");
    }

    @Override
    public void update() {
        daoInterface.update();
        System.out.println("��¼update");
    }

    @Override
    public void read() {
        daoInterface.read();
        System.out.println("��¼read");
    }
}

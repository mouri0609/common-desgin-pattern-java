package designPattern.Proxy.Cglib;

public class test {
    /*
    CGLIB�����Ķ�̬��������JDK�����Ķ�̬�����������ܸ��ߣ�����CGLIB�����������ʱ�����ѵ�ʱ��ȴ��JDK��öࡣ
    ���Զ��ڵ����Ķ�����Ϊ����Ƶ������������CGLIB���ʣ���֮ʹ��JDK��ʽҪ��Ϊ����һЩ��
    ͬʱ����CGLib�����ǲ��ö�̬��������ķ���������final���εķ����޷����д���
     */
    public static void main(String[] args) {
        UserDao daoInterface = new UserDao();
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = (UserDao) cglibProxy.getInstance(daoInterface);
        userDao.add("test");
    }
}


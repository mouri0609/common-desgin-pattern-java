package designPattern.Proxy.Dynamic;

public class test {
    /*
    �ڶ�̬���������ǲ�����Ҫ���ֶ��Ĵ��������࣬����ֻ��Ҫ��дһ����̬�������Ϳ����ˡ������Ĵ��������JDK������ʱΪ���Ƕ�̬����������
     */
    public static void main(String[] args) {

        DaoInterface daoInterface = (DaoInterface) new DynamicProxy().bind(new UserDao());
        daoInterface.add("method");

    }
}

package designPattern.Reflect.reflectTest;

import designPattern.Reflect.Person;

public class newInstance {
    public static void main(String[] args)  throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        //1.��ȡClass����
        String className="designPattern.Reflect.Person";
        Class clazz = Class.forName(className);

        //����Class�����newInstance��������һ�����ʵ��
        Object obj =  clazz.newInstance();
        System.out.println(obj.getClass());
    }

//    public void testNewInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//        //1.��ȡClass����
//
//    }
}

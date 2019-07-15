package designPattern.Reflect.reflectTest;

import designPattern.Reflect.Person;

public class newInstance {
    public static void main(String[] args)  throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        //1.获取Class对象
        String className="designPattern.Reflect.Person";
        Class clazz = Class.forName(className);

        //利用Class对象的newInstance方法创建一个类的实例
        Object obj =  clazz.newInstance();
        System.out.println(obj.getClass());
    }

//    public void testNewInstance() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//        //1.获取Class对象
//
//    }
}

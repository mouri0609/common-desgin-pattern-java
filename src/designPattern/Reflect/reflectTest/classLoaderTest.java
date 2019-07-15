package designPattern.Reflect.reflectTest;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class classLoaderTest {
    @Test
    public void testClassLoader() throws ClassNotFoundException, FileNotFoundException {
        //1. ��ȡһ��ϵͳ���������(���Ի�ȡ����ǰ�����PeflectTest���������ص�)
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);


        //2. ��ȡϵͳ��������ĸ������������չ������������Ի�ȡ��.
        classLoader = classLoader.getParent();
        System.out.println(classLoader);


        //3. ��ȡ��չ��������ĸ��������������������������ɻ�ȡ��.
        classLoader = classLoader.getParent();
        System.out.println(classLoader);


        //4. ���Ե�ǰ�����ĸ�����������м��أ�ϵͳ���������:
        classLoader = Class.forName("designPattern.Reflect.Person")
                .getClassLoader();
        System.out.println(classLoader);


        //5. ���� JDK �ṩ�� Object �����ĸ��������������أ������ࣩ
        classLoader = Class.forName("java.lang.Object")
                .getClassLoader();
        System.out.println(classLoader);
    }
}

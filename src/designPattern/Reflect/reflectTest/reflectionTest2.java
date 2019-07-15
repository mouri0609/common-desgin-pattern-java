package designPattern.Reflect.reflectTest;

import designPattern.Reflect.Person;
import org.junit.jupiter.api.Test;

public class reflectionTest2 {
    //��ȡClass��������ַ�ʽ
    @Test
    public void testClass() throws ClassNotFoundException {
        Class clazz = null;

        //1.ͨ������
        clazz = Person.class;


        //2.ͨ��������
        //���ַ�ʽ�����ڴ�����һ������ȴ��֪���������͵�ʱ��ʹ��
        Person person = new Person();
        clazz = person.getClass();
        //����������ӵ����岻����Ϊ�Ѿ�֪��person������Person�࣬������д��û�б�Ҫ��
        //�����������һ��Object�࣬������������Ӧ�õ�
        Object obj = new Person();
        clazz = obj.getClass();


        //3.ͨ��ȫ����(���׳��쳣)
        //һ���ܿ����������õıȽ϶࣬��Ϊ�����ļ���һ����Ķ���ȫ������ͨ�����ַ�ʽ���Եõ�Classʵ��
        String className="designPattern.Reflect.Person";
        clazz = Class.forName(className);




        //�ַ���������
        clazz = String.class;

        clazz = "javaTest".getClass();

        clazz = Class.forName("java.lang.String");

        System.out.println();
    }
}

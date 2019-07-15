package designPattern.Reflect.reflectTest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class methodReflection {
    @Test
    public void testMethod() throws Exception{
        Class clazz = Class.forName("designPattern.Reflect.Person");

        //
        //1.��ȡ����
        //  1.1 ��ȡȡclazz��Ӧ���е����з���--�������飨һ��
        //     ���ܻ�ȡprivate����,�һ�ȡ�Ӹ���̳��������з���
        Method[] methods = clazz.getMethods();
        for(Method method:methods){
            System.out.print(" "+method.getName());
        }
        System.out.println();

        //
        //  1.2.��ȡ���з���������˽�з��� --�������飨����
        //  ���������ķ����������Ի�ȡ������ֻ��ȡ��ǰ��ķ���
        methods = clazz.getDeclaredMethods();
        for(Method method:methods){
            System.out.print(" "+method.getName());
        }
        System.out.println();

        //
        //  1.3.��ȡָ���ķ���
        //  ��Ҫ�������ƺͲ����б��޲�����Ҫд
        //  ���ڷ���public void setName(String name) {  }
        Method method = clazz.getDeclaredMethod("setName", String.class);
        System.out.println(method);
        //  �����ڷ���public void setAge(int age) {  }
        method = clazz.getDeclaredMethod("setAge", Integer.class);
        System.out.println(method);
        //  ����д�ǻ�ȡ�����ģ���������Ĳ���������int��
        //  ����������ڷ��䣬��ôҪôint����д��Integer�� public void setAge(Integer age) {  }
        //  Ҫô��ȡ�����Ĳ���д��int.class

        //
        //2.ִ�з���
        //  invoke��һ��������ʾִ���ĸ�����ķ�����ʣ�µĲ�����ִ�з���ʱ��Ҫ����Ĳ���
        Object obje = clazz.newInstance();
        method.invoke(obje,2);

        //���һ��������˽�з������������ǿ��Ի�ȡ���ģ�������һ��ȴ����ִ��
        //˽�з�����ִ�У������ڵ���invoke֮ǰ����һ��method.setAccessible��true��;
    }
}

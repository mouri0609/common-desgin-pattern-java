package designPattern.Reflect.reflectTest;

import designPattern.Reflect.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class reflectionTest1 {
    @Test
    public void testClass() {
        Class clazz = null;

        //1.�õ�Class����
        clazz = Person.class;
        //2.�����ֶε�����
        Field[] fields = clazz.getDeclaredFields();

        System.out.println();  //����ϵ�
    }
}

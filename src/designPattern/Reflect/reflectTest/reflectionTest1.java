package designPattern.Reflect.reflectTest;

import designPattern.Reflect.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

class reflectionTest1 {
    @Test
    public void testClass() {
        Class clazz = null;

        //1.得到Class对象
        clazz = Person.class;
        //2.返回字段的数组
        Field[] fields = clazz.getDeclaredFields();

        System.out.println();  //插入断点
    }
}

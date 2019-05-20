package designPattern.Proxy.Dynamic;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public Object bind(Object object){
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        // ����֮ǰִ��
        System.out.println("����֮ǰִ��");
        // ִ��ҵ��
        result = method.invoke(object, args);
        // ����֮��ִ��
        System.out.println("����֮��ִ��");
        return result;
    }
}

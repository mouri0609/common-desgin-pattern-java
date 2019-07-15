package designPattern.Reflect.reflectTest;

import designPattern.Reflect.Person;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class invoke {
    /**
     *
     * @param obj: ����ִ�е��Ǹ�����.
     * @param methodName: ���һ�������ķ�����. �÷���Ҳ������˽�з���.
     * @param args: ���ø÷�����Ҫ����Ĳ���
     * @return: ���÷�����ķ���ֵ
     *
     */
    public Object invoke(Object obj, String methodName, Object ... args) throws Exception{
        //1. ��ȡ Method ����
        //   ��ΪgetMethod�Ĳ���ΪClass�б����ͣ�����Ҫ�Ѳ���argsת��Ϊ��Ӧ��Class���͡�

        Class [] parameterTypes = new Class[args.length];
        for(int i = 0; i < args.length; i++){
            parameterTypes[i] = args[i].getClass();
            System.out.println(parameterTypes[i]);
        }

        Method method = obj.getClass().getDeclaredMethod(methodName, parameterTypes);
        //���ʹ��getDeclaredMethod���Ͳ��ܻ�ȡ���෽�������ʹ��getMethod���Ͳ��ܻ�ȡ˽�з���
        //2. ִ�� Method ����
        //3. ���ط����ķ���ֵ
        return method.invoke(obj, args);
    }



//    public Object invoke(String className, String methodName, Object ... args){
//        Object obj = null;
//
//        try {
//            obj = Class.forName(className).newInstance();
//            //������һ������
//            return invoke(obj, methodName, args);
//        }catch(Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }


    @Test
    public void testInvoke() throws Exception{
        Object obj = new Person();
        invoke(obj, "test", "wang", 1);
    }
}

package designPattern.AbstractFactory;

public class test {
    public static void main(String[] args) {
        AbstarctFactory factory = new AndroidFactory();
        factory.createInterface().display();
        factory.createOperator().display();
    }
}
/*
1�����Ҫ�л�������ֻ��Ҫ���ʼ��ʼ���������ʱ����һ�ҹ����ͺ��ˣ��������ṹ������Ķ���
2��������Ӳ������ô������еĲ����಻��Ҫ�Ķ���
3��������ӹ������ô������й�����Ͳ����඼����Ҫ�Ķ���

�������������󹤳�ģʽ��������������ѭ�˿��ŷ��ԭ�򣬼�ʹ�ڶ��������Ҫ�޸����еĹ����࣬
�����ڹ������ְ����ȥ��ʼ��������һ�������Ĳ��������࣬������еĺ����ಿ������Ȼû����Ϊ��չ�������κ��޸ġ�
 */
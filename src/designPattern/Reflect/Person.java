package designPattern.Reflect;

public class Person {
    String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //����һ�����εĹ�������һ�������εĹ�����
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public Person() {
        super();
    }

    public void test(String name,Integer age){
        System.out.println(11111);
    }

}
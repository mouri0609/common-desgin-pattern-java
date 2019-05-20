package designPattern.TemplateMethod;

/**
 * Created by Mouri on 2019/2/20 17:25
 */
public class test {
    public static void main(String[] args) {
        WakeUpTemplate wakeUpByChinese = new Chinese();
        WakeUpTemplate wakeUpByAmerican = new American();
        wakeUpByChinese.wakeup();
        System.out.println("===============================");
        wakeUpByAmerican.wakeup();
    }
}

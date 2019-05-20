package designPattern.TemplateMethod;

/**
 * Created by Mouri on 2019/2/20 17:20
 */
public class Chinese extends WakeUpTemplate {
    @Override
    protected void eatBrakefast() {
        System.out.println("Chinese likes soybean milk and congee");
    }
}

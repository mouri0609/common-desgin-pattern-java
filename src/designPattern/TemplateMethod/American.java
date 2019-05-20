package designPattern.TemplateMethod;

/**
 * Created by Mouri on 2019/2/20 17:23
 */
public class American extends WakeUpTemplate {
    @Override
    protected void eatBrakefast() {
        System.out.println("American like milk and bread");
    }

    @Override
    protected boolean IsTakeBath(){
        return true;
    }
}

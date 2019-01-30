package designPattern.Strategy.startBehaviorImplements;

import designPattern.Strategy.StartBehavior;

/**
 * Created by Mouri on 2019/1/16 13:47
 */
public class VerticalTakeOff implements StartBehavior {
    public void start(){
        System.out.println("VerticalTakeOff");
    }
}

package designPattern.Strategy.startBehaviorImplements;

import designPattern.Strategy.StartBehavior;

/**
 * Created by Mouri on 2019/1/16 20:54
 */
public class LongDistanceTakeOff implements StartBehavior {
    public void start(){
        System.out.println("LongDistanceTakeOff");
    }
}

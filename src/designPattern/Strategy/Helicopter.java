package designPattern.Strategy;

import designPattern.Strategy.Plane;
import designPattern.Strategy.flySpeedImplements.SubSonicFly;
import designPattern.Strategy.startBehaviorImplements.VerticalTakeOff;

/**
 * Created by Mouri on 2019/1/16 13:31
 */
public class Helicopter extends Plane {
    public Helicopter() {
        flySpeed = new SubSonicFly();
        startBehavior = new VerticalTakeOff();
    }
}

package designPattern.Strategy;

import designPattern.Strategy.flySpeedImplements.SubSonicFly;
import designPattern.Strategy.flySpeedImplements.SuperSonicFly;
import designPattern.Strategy.startBehaviorImplements.LongDistanceTakeOff;
import designPattern.Strategy.startBehaviorImplements.VerticalTakeOff;

/**
 * Created by Mouri on 2019/1/16 21:07
 */
public class Fighter extends Plane {
    public Fighter() {
        flySpeed = new SuperSonicFly();
        startBehavior = new LongDistanceTakeOff();
    }
}

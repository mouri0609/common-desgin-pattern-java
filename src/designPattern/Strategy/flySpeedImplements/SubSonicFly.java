package designPattern.Strategy.flySpeedImplements;

import designPattern.Strategy.FlySpeed;

/**
 * Created by Mouri on 2019/1/16 13:17
 */
public class SubSonicFly implements FlySpeed {
    public void fly(){
        System.out.println("SubSonicFly");
    }
}

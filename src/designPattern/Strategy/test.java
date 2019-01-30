package designPattern.Strategy;


import designPattern.Strategy.startBehaviorImplements.LongDistanceTakeOff;

/**
 * Created by Mouri on 2019/1/16 13:39
 */
public class test {
    public static void main(String[] args) {
        Plane helicopter = new Helicopter();
        helicopter.performFly();
        helicopter.performStart();

        helicopter.setStart(new LongDistanceTakeOff());
        helicopter.performStart();

        Plane fighter = new Fighter();
        fighter.performFly();
        fighter.performStart();
    }
}

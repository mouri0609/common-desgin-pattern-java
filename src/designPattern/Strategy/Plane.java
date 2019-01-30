package designPattern.Strategy;


/**
 * Created by Mouri on 2019/1/16 13:07
 */
public abstract class Plane {
    FlySpeed flySpeed;
    StartBehavior startBehavior;

    public Plane(){
    }

    public void setFly(FlySpeed fly) {
        this.flySpeed = fly;
    }

    public void performFly() {
        flySpeed.fly();
    }

    public void setStart(StartBehavior start) {
        this.startBehavior = start;
    }

    public void performStart() {
        startBehavior.start();
    }

}

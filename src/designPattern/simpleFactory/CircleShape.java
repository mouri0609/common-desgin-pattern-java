package designPattern.simpleFactory;


/**
 * Created by Mouri on 2019/1/30 9:37
 */
public class CircleShape extends DrawShapeTool {
    public void draw(){
            System.out.println("draw a circle");
    }
    public void erase(){
        System.out.println("erase a circle");
    }
}

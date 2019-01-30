package designPattern.simpleFactory;

/**
 * Created by Mouri on 2019/1/30 9:49
 */
public class test {
    public static void main(String args[]){
        DrawShapeTool drawShapeTool;
        drawShapeTool = Factory.getShape("circle");
        try {
            drawShapeTool.draw();
            drawShapeTool.erase();
        }catch (NullPointerException e){
            System.out.println("UnSupportedShapeException");
        }

    }
}

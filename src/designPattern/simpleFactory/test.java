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
/*
由于增加工厂或者产品都需要修改静态工厂类，因此它不符合开放封闭原则。好处是大大减少了工厂类，若使用了反射技术，也会减少很多判断分支代码量。
 */

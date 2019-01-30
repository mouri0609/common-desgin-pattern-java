package designPattern.simpleFactory;

/**
 * Created by Mouri on 2019/1/30 10:01
 */
 class Factory {
    public static DrawShapeTool getShape(String type){
        DrawShapeTool drawShapeTool = null;
        if (type.equals("circle")){
            drawShapeTool = new CircleShape();
        }
        else if(type.equals("triggle")){
            drawShapeTool = new TriggleShape();
        }

        return drawShapeTool;
    }
}

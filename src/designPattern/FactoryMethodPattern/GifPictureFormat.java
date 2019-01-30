package designPattern.FactoryMethodPattern;

/**
 * Created by Mouri on 2019/1/30 13:43
 */
public class GifPictureFormat implements PictureFormat {
    @Override
    public void read() {
        System.out.println("read GIF picture");
    }
}

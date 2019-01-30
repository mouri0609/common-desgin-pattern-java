package designPattern.FactoryMethodPattern;

/**
 * Created by Mouri on 2019/1/30 13:45
 */
public class test {
    public static void main(String[] args) {
        PictureFormatFactory pictureFormatFactory;
        PictureFormat pictureFormat;
        pictureFormatFactory = new GifPictureFormatFactory();
        pictureFormat = pictureFormatFactory.creat();
        pictureFormat.read();
    }
}

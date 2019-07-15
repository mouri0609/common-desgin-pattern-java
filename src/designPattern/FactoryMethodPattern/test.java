package designPattern.FactoryMethodPattern;

/**
 * Created by Mouri on 2019/1/30 13:45
 */
public class test {
    public static void main(String[] args) {
        PictureFormatFactory pictureFormatFactory;
        PictureFormat pictureFormat;
        pictureFormatFactory = new GifPictureFormatFactory();
        pictureFormat = pictureFormatFactory.create();
        pictureFormat.read();
    }
}
/*
工厂方法可以说是抽象工厂的一个特例，当工厂里只有一种产品的时候，抽象工厂的结构就简化成工厂方法的结构了。
 */
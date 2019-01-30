package designPattern.FactoryMethodPattern;

/**
 * Created by Mouri on 2019/1/30 13:38
 */
public class GifPictureFormatFactory implements PictureFormatFactory {
    public PictureFormat creat(){
        PictureFormat pictureFormat = new GifPictureFormat();
        return  pictureFormat;
    }
}

package designPattern.Observer;

import java.util.Observable;

/**
 * Created by Mouri on 2019/2/15 20:38
 */
public class StockData extends Observable {

//    boolean flag;

    private StockData() {}

    public StockData(range){
        this.range = range;
        System.out.println("rise");

        setChanged();
        notifyObservers();
    }
}

package designPattern.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mouri on 2019/2/15 20:53
 */
public class Stockers implements Observer {
    Observable observable;

    public Stockers(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        StockData stockData = (StockData) observable;
        System.out.println("123");
    }
}

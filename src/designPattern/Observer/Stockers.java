package designPattern.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mouri on 2019/2/15 20:53
 */
public class Stockers implements Observer {
    private  String name;
    Observable observable;

    public Stockers(String name, Observable observable) {
        this.name = name;
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o,Object object) {
        StockData stockData = (StockData) o;
        System.out.println(name+" notice the price ! ");
    }
}

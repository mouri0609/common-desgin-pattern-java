package designPattern.Observer;

import java.util.Observable;

/**
 * Created by Mouri on 2019/2/15 20:38
 */
public class StockData extends Observable {

    float initPrice = 100;
    float currentPrice = 106;

    public void publishMessage(){
        if((currentPrice-initPrice)/initPrice>0.05){
            setChanged();
            System.out.println("the stockPrice  rise up to "+currentPrice+"!");
        }
        notifyObservers();
    }
}

package designPattern.Observer;

public class test {
    public static void main(String[] args) {
        StockData oneStock = new StockData();
        Stockers stockersA = new Stockers("observerA",oneStock);
        Stockers stockersB = new Stockers("observerB",oneStock);

        oneStock.publishMessage();
    }
}

package behavioural.observer.example2;

public class StockTradingManager extends Publisher{

    private final String stockName;
    private double currentPrice;
    private final double deltaThreshold;

    public StockTradingManager(String stockName, double initialPrice, double deltaThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.deltaThreshold = deltaThreshold;
    }

    public void updateStockPrice(double newPrice) {
        if (Math.abs(newPrice - currentPrice) > deltaThreshold) {
            notifyObservers(stockName, newPrice - currentPrice);
        }
        currentPrice = newPrice;
    }
}

package behavioural.observer.example2;

import behavioural.observer.example2.observers.AppService;
import behavioural.observer.example2.observers.EmailService;
import behavioural.observer.example2.observers.SmsService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) {
        StockTradingManager stockTradingManager = new StockTradingManager("Nvidia", 1000, 10);

        SmsService smsService = new SmsService();
        EmailService emailService = new EmailService();
        AppService appService = new AppService();

        stockTradingManager.registerObserver(smsService);
        stockTradingManager.registerObserver(emailService);
        stockTradingManager.registerObserver(appService);

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(() -> {
            double newPrice = 1000 - Math.random() * 100;
            stockTradingManager.updateStockPrice(newPrice);},
                0, 5, TimeUnit.SECONDS);



    }
}

package behavioural.observer.example2.observers;

import behavioural.observer.example2.utils.NotificationUtil;

public class AppService implements Observer{
    String changed;
    @Override
    public void notifyObserver(String stockName, double delta) {
        changed = delta > 0 ? "increased" : "decreased";
        NotificationUtil.sendNotification("Push Notification: Price of " + stockName + " has " + changed + " by " + Math.abs(delta));
    }
}

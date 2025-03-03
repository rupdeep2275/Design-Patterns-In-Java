package behavioural.observer.example2.observers;

import behavioural.observer.example2.utils.NotificationUtil;

public class SmsService implements Observer{
    String changed;
    @Override
    public void notifyObserver(String stockName, double delta) {
        changed = delta > 0 ? "increased" : "decreased";
        NotificationUtil.sendNotification("Sms: Price of " + stockName + " has " + changed + " by " + Math.abs(delta));
    }
}

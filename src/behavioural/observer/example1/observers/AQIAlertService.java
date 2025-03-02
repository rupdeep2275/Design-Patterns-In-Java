package behavioural.observer.example1.observers;

import behavioural.observer.example1.utils.NotificationUtil;

public class AQIAlertService implements Observer {

    private final int AQI_THRESHOLD = 100;
    private int AQI;
    private int temperature;
    private int humidity;

    @Override
    public void notifyObserver(int temperature, int AQI, int humidity) {
        this.AQI = AQI;
        this.temperature = temperature;
        this.humidity = humidity;
        if(AQI > AQI_THRESHOLD){
            NotificationUtil.sendNotification("AQI is above threshold");
        }
    }
}

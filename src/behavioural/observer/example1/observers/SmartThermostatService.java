package behavioural.observer.example1.observers;

import behavioural.observer.example1.utils.NotificationUtil;

public class SmartThermostatService implements Observer {

    private final int TEMPERATURE_THRESHOLD = 25;
    private int temperature;
    private int AQI;
    private int humidity;

    @Override
    public void notifyObserver(int temperature, int AQI, int humidity) {
        this.temperature = temperature;
        this.AQI = AQI;
        this.humidity = humidity;
        if (temperature > TEMPERATURE_THRESHOLD) {
            NotificationUtil.sendNotification("Adjusting indoor temperature as it is too hot");
        }
    }
}

package behavioural.observer.example1.observers;

import behavioural.observer.example1.utils.NotificationUtil;

public class WeatherDisplayService implements Observer {

    private int temperature;
    private int AQI;
    private int humidity;

    @Override
    public void notifyObserver(int temperature, int AQI, int humidity) {
        this.temperature = temperature;
        this.AQI = AQI;
        this.humidity = humidity;
        NotificationUtil.sendNotification("Temperature: " + temperature + " AQI: " + AQI + " Humidity: " + humidity);
    }
}

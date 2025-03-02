package behavioural.observer.example1;

public class WeatherMonitoringApp extends Publisher{
    private int temperature;
    private int AQI;
    private int humidity;

    public void updateWeatherConditions(int newTemperature, int newAQI, int newHumidity){
        this.temperature = newTemperature;
        this.AQI = newAQI;
        this.humidity = newHumidity;
        notifyObservers(newTemperature, newAQI, newHumidity);
    }

}

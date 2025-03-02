package behavioural.observer.example1;

import behavioural.observer.example1.observers.AQIAlertService;
import behavioural.observer.example1.observers.SmartThermostatService;
import behavioural.observer.example1.observers.WeatherDisplayService;

public class Client {
    public static void main(String[] args) {
        WeatherMonitoringApp weatherMonitoringApp = new WeatherMonitoringApp();

        AQIAlertService aqiAlertService = new AQIAlertService();
        SmartThermostatService smartThermostatService = new SmartThermostatService();
        WeatherDisplayService weatherDisplayService = new WeatherDisplayService();

        weatherMonitoringApp.registerObserver(aqiAlertService);
        weatherMonitoringApp.registerObserver(smartThermostatService);
        weatherMonitoringApp.registerObserver(weatherDisplayService);

        weatherMonitoringApp.updateWeatherConditions(30, 150, 70);

        weatherMonitoringApp.removeObserver(aqiAlertService);

        weatherMonitoringApp.updateWeatherConditions(35, 200, 80);
    }
}
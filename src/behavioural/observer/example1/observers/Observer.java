package behavioural.observer.example1.observers;

public interface Observer {

    void notifyObserver(int temperature, int AQI, int humidity);
}

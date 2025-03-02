package behavioural.observer.example1;

import behavioural.observer.example1.observers.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(int temperature, int AQI, int humidity);
}

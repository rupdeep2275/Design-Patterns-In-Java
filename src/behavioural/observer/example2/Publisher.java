package behavioural.observer.example2;

import behavioural.observer.example2.observers.Observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Publisher implements Subject{

    // this class can also be called as observer registry
    private final List<Observer> observers = Collections.synchronizedList(new ArrayList<>());

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockName, double currentPrice) {
        synchronized (observers){
            for (Observer observer : observers){
                observer.notifyObserver(stockName, currentPrice);
            }
        }
    }
}

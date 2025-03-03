package behavioural.observer.example2;

import behavioural.observer.example2.observers.Observer;

interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String stockName, double currentPrice);
}

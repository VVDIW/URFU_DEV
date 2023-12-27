package ru.urfu.pattern.observers;

public interface Observable {

    void attach(Observer observer);
    void dettach(Observer observer);
    void notifyObservers();

    void notifyObserver(Observer observer);
}

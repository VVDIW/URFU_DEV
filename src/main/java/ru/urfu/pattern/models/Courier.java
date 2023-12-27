package ru.urfu.pattern.models;

import lombok.Builder;
import lombok.val;
import ru.urfu.pattern.observers.Observable;
import ru.urfu.pattern.observers.Observer;

import java.util.List;

@Builder
public record Courier(List<Order> orders, List<Observer> clients) implements Observable {


    public void addOrder(Order order) {
        orders.add(order);
        notifyObservers();
    }

    public void removeOrder(Order order) {
        orders.remove(order);
        order.setStatusDelivered();
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        clients.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        clients.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (val client: clients) {
            client.handleEvent();
        }
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.handleEvent();
    }
}

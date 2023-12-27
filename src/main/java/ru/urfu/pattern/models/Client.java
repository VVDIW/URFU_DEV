package ru.urfu.pattern.models;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import ru.urfu.pattern.observers.Observer;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Builder
public class Client implements Observer {

    private final String name;
    private final List<Order> orders;

    @Override
    public void handleEvent() {
//        orders.forEach(order -> System.out.println("Dear " + name + " your order: " + order.getOrderCode() + " has status: " + order.getStatus()));
        System.out.println("Dear " + name + " your order's statuses : " + orders.toString());
    }
}

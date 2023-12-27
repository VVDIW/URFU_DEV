package ru.urfu.pattern.models;

import lombok.AllArgsConstructor;

import static ru.urfu.pattern.models.OrderStatus.*;

@AllArgsConstructor
public abstract class Order {

    private String orderCode;
    private DeliveryAddress address;

    private OrderStatus status;

    public String getOrderCode() {
        return orderCode;
    }

    public abstract OrderType getType();

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatusDelivered(){
        this.status = DELIVERED;
    }

    public DeliveryAddress getDeliveryAddress() {
        return address;
    }

    @Override
    public String toString() {
        return
                "orderCode='" + orderCode + '\'' +
                ", status=" + status ;
    }

}

package ru.urfu.pattern.models.orders;

import ru.urfu.pattern.models.DeliveryAddress;
import ru.urfu.pattern.models.Order;
import ru.urfu.pattern.models.OrderType;

import static ru.urfu.pattern.models.OrderStatus.IN_TRANSIT;
import static ru.urfu.pattern.models.OrderType.PARCEL;

public class Parcel extends Order {

    private final OrderType orderType;

    public Parcel(String name, DeliveryAddress address) {
        super(name, address, IN_TRANSIT);
        this.orderType = PARCEL;
    }

    @Override
    public OrderType getType() {
        return PARCEL;
    }
}

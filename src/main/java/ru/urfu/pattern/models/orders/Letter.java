package ru.urfu.pattern.models.orders;

import ru.urfu.pattern.models.DeliveryAddress;
import ru.urfu.pattern.models.Order;
import ru.urfu.pattern.models.OrderStatus;
import ru.urfu.pattern.models.OrderType;

import static ru.urfu.pattern.models.OrderStatus.*;
import static ru.urfu.pattern.models.OrderType.LETTER;

public class Letter extends Order {

    private final OrderType orderType;
    public Letter(String name, DeliveryAddress address) {
        super(name, address, IN_TRANSIT);
        this.orderType = LETTER;
    }

    @Override
    public OrderType getType() {
        return LETTER;
    }

}

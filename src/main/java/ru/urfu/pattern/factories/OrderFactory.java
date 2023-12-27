package ru.urfu.pattern.factories;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import ru.urfu.pattern.models.orders.Letter;
import ru.urfu.pattern.models.orders.Package;
import ru.urfu.pattern.models.*;
import ru.urfu.pattern.models.orders.Parcel;

public class OrderFactory implements Factory<Order, OrderType> {

    @Override
    public Order createOrder(OrderType type, String name, DeliveryAddress address) {
        return switch (type) {
            case PARCEL:
                yield new Parcel(name, address);
            case LETTER:
                yield new Letter(name, address);
            case PACKAGE:
                yield new Package(name, address);
        };
    }
}

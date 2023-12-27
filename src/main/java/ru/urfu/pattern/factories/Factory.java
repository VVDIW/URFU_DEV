package ru.urfu.pattern.factories;

import ru.urfu.pattern.models.DeliveryAddress;

public interface Factory<T, R> {
   T createOrder(R type, String name, DeliveryAddress address);
}

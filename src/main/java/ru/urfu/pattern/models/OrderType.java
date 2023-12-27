package ru.urfu.pattern.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum OrderType {
    PACKAGE(2.00),
    PARCEL(5.50),
    LETTER(0.50);

    private final Double shippingTariff;

}

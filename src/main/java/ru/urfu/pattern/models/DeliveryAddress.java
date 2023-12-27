package ru.urfu.pattern.models;

import lombok.Builder;

@Builder
public record DeliveryAddress(String city, String street, String house) {
}

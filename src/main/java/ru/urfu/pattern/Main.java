package ru.urfu.pattern;

import lombok.val;
import ru.urfu.pattern.factories.OrderFactory;
import ru.urfu.pattern.models.Client;
import ru.urfu.pattern.models.Courier;
import ru.urfu.pattern.models.DeliveryAddress;

import java.util.ArrayList;

import static java.util.List.of;
import static ru.urfu.pattern.models.OrderType.LETTER;
import static ru.urfu.pattern.models.OrderType.PACKAGE;

public class Main {

    public static void main(String[] args) {
        val orderFactory = new OrderFactory();
        val firstOrderForFirstClient = orderFactory.createOrder(
                LETTER,
                "568733565",
                DeliveryAddress.builder()
                        .city("Moscow")
                        .street("Pushkina")
                        .house("Kolotushkina")
                        .build()
        );

        val secondOrderForFirstClient = orderFactory.createOrder(
                PACKAGE,
                "123546871",
                DeliveryAddress.builder()
                        .city("Moscow")
                        .street("Pushkina")
                        .house("Kolotushkina")
                        .build()
        );

        val firstOrderForSecondClient = orderFactory.createOrder(
                LETTER,
                "257845654",
                DeliveryAddress.builder()
                        .city("Moscow")
                        .street("Gogolya")
                        .house("42A")
                        .build()
        );

        val client1 = Client.builder()
                .name("Billy Bob")
                .orders(of(firstOrderForFirstClient, secondOrderForFirstClient))
                .build();

        val client2 = Client.builder()
                .name("Vasya")
                .orders(of(firstOrderForSecondClient))
                .build();

        val courier = Courier.builder()
                .orders(new ArrayList<>())
                .clients(new ArrayList<>())
                .build();


       courier.attach(client1);
       courier.attach(client2);

        courier.addOrder(firstOrderForFirstClient);
        courier.addOrder(secondOrderForFirstClient);
        courier.addOrder(firstOrderForSecondClient);

        courier.removeOrder(firstOrderForFirstClient);
        courier.removeOrder(secondOrderForFirstClient);
        courier.removeOrder(firstOrderForSecondClient);

        courier.dettach(client1);
        courier.dettach(client2);
    }
}

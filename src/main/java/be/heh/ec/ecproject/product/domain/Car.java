package be.heh.ec.ecproject.product.domain;

import lombok.Getter;

import java.time.LocalDate;


public class Car {

    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private String mark;
    @Getter
    private int price;
    @Getter

    private String description;

    public Car(int id, String name, String mark, int price, String description) {

        this.id = id;
        this.name = name;
        this.mark = mark;
        if (price < 0) {
            this.price = price;
        }

        this.description = description;
    }
}

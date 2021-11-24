package be.heh.ec.ecproject.product.domain;

import lombok.Getter;

import java.time.LocalDate;


public class Car {

    @Getter
    private Long id;
    @Getter
    private String surname;
    @Getter
    private String mark;
    @Getter
    private int price;
    @Getter
    private String description;

    public Car(Long id, String surname, String mark, int price, String description) {

        this.id = id;
        this.surname = surname;
        this.mark = mark;
        if (price < 0) {
            this.price = price;
        }

        this.description = description;
    }
}

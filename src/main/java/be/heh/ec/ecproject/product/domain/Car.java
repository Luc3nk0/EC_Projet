package be.heh.ec.ecproject.product.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Car {

    @Getter
    private final int id;
    @Getter
    private final String surname;
    @Getter
    private final String mark;
    @Getter
    private final int price;
    @Getter
    private final String description;
    @Getter
    private final int orderid;

}

package be.heh.ec.ecproject.order.domain;

import be.heh.ec.ecproject.product.domain.Car;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Order {

    @Getter
    @Setter
    private final int Id;
    @Getter
    @Setter
    private final int customerId;
    @Getter
    @Setter
    private final String carListOrder;
}
package be.heh.ec.ecproject.order.domain;

import be.heh.ec.ecproject.product.domain.Car;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Order {

    @Getter
    private final int orderId;
    @Getter
    private final int customerId;
    @Getter
    private final ArrayList<Car> carListOrder = new ArrayList<>();
}

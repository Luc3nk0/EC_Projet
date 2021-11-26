package be.heh.ec.ecproject.order.domain;

import be.heh.ec.ecproject.product.domain.Car;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Order {

    @Setter
    private final int Id;
    @Setter
    private final int customerId;
    @Setter
    private final List<Car> carListId = new ArrayList<>();
}

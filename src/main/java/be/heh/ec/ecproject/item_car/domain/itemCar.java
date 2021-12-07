package be.heh.ec.ecproject.item_car.domain;

import be.heh.ec.ecproject.order.domain.Order;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@RequiredArgsConstructor
public class itemCar {
    @Getter
    @Setter
    private final int orderId;
    @Getter
    @Setter
    private final int carId;

}

package be.heh.ec.ecproject.item_car.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class itemCar {
    @Getter
    @Setter
    private final int orderId;
    @Getter
    @Setter
    private final int carId;
}

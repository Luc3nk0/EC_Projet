package be.heh.ec.ecproject.order.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

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
    private final UUID uuid;
}
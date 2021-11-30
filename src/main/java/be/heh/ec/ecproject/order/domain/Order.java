package be.heh.ec.ecproject.order.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
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
    private final String carListOrder;
    @Getter
    @Setter
    private UUID uuid;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + Id +
                ", id du client='" + customerId + '\'' +
                ", voiture(s)='" + carListOrder + '\'' +
                ", uuid=" + uuid +
                '}';
    }

}
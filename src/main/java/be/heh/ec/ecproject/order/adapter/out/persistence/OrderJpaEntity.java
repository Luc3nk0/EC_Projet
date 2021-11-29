package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.product.domain.Car;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Data
public class OrderJpaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "customerid")
    private int customerId;

    @Column(name = "carlistorder")
    private String carListOrder;

    @Column(name="uuid")
    private UUID uuid;
}

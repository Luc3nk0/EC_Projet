package be.heh.ec.ecproject.item_car.adapter.out.persistence;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "items_car")
@Data
public class itemCarJpaEntity {

    @Id
    @Column(name = "orderId")
    private int orderId;

    @Id
    @Column(name = "carId")
    private int carId;
}

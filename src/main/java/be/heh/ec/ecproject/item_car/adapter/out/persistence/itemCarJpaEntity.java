package be.heh.ec.ecproject.item_car.adapter.out.persistence;

import be.heh.ec.ecproject.item_car.domain.itemCar;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderJpaEntity;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "items_car")

@Data
public class itemCarJpaEntity {

    @Id
    @Column(name = "orderId")
    
    private int orderId;


    @Column(name = "carId")
    private int carId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private OrderJpaEntity order;

    // Ajouter order.getId

}

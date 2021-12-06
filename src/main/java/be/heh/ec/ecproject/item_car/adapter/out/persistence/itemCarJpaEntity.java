package be.heh.ec.ecproject.item_car.adapter.out.persistence;

import be.heh.ec.ecproject.order.domain.Order;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = "items_car")
@Data
public class itemCarJpaEntity<list> {

    @Id
    @Column(name = "orderId")
    private int orderId;

    @Column(name = "carId")
    private int carId;
}

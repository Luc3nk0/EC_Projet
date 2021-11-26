package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.product.adapter.out.persistence.CarJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderJpaEntity,Long> {

}

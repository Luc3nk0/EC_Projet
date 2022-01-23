package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.product.adapter.out.persistence.CarJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderJpaEntity,Long> {
}

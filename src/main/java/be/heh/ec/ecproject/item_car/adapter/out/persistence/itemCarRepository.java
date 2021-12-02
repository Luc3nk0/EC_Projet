package be.heh.ec.ecproject.item_car.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemCarRepository extends JpaRepository<itemCarJpaEntity,Long> {
}

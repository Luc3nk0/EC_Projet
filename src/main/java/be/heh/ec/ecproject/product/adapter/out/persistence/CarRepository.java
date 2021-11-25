package be.heh.ec.ecproject.product.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<CarJpaEntity,Long> {
    @Query("SELECT p FROM CarJpaEntity p WHERE p.id =5")
    public List<CarJpaEntity> search(String keyword);
}

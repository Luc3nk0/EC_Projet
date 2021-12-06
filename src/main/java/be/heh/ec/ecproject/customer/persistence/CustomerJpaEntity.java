package be.heh.ec.ecproject.customer.persistence;

import be.heh.ec.ecproject.order.adapter.out.persistence.OrderJpaEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customers")
@Data
public class CustomerJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "hibernate_sequence_customer")
    @Column(name = "id")
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    public void addOrder(OrderJpaEntity orderJpaEntity) {

    }
}

package be.heh.ec.ecproject.order.adapter.out.persistence;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderJpaEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "customerId")
    private String customerId;

    @Column(name = "mark")
    private String mark;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;
}

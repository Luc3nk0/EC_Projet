package be.heh.ec.ecproject.product.adapter.out.persistence;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Data
public class CarJpaEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "surname")
    private String surname;

    @Column(name = "mark")
    private String mark;

    @Column(name = "price")
    private int price;

    @Column(name = "description")
    private String description;
}
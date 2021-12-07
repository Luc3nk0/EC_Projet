package be.heh.ec.ecproject;

import be.heh.ec.ecproject.customer.persistence.CustomerJpaEntity;
import be.heh.ec.ecproject.customer.persistence.CustomerRepository;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderJpaEntity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@SpringBootApplication/*(exclude={DataSourceAutoConfiguration.class})*/
public class EcProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcProjectApplication.class, args);
    }
/*
    @Bean
    public CommandLineRunner demo(CustomerRepository repository){
            return (args) ->
    {
        CustomerJpaEntity customerJpaEntity = new CustomerJpaEntity();
        customerJpaEntity.setFirstName("Kevin");
        customerJpaEntity.setLastName("Gaussin");
        customerJpaEntity.setEmail("KevinGaussin@hotmail.com");
        OrderJpaEntity orderJpaEntity = new OrderJpaEntity();
        orderJpaEntity.setUuid(UUID.randomUUID());

        customerJpaEntity.addOrder(orderJpaEntity);
        repository.save(customerJpaEntity);
    };
    }*/
}

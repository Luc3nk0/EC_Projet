package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.customer.domain.Customer;
import be.heh.ec.ecproject.customer.persistence.CustomerJpaEntity;
import be.heh.ec.ecproject.customer.persistence.CustomerRepository;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderJpaEntity;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
@RequiredArgsConstructor
public class OrderPersistenceAdapter implements ManageOrderAdapterUseCase {

    private final CustomerRepository customerRepository;

    @Override
    public Map<String, Object> insertOrder(Order order, Customer customer, List carList) {

        CustomerJpaEntity customerJpaEntity = new CustomerJpaEntity();
        customerJpaEntity.setFirstname(customer.getFirstname());
        customerJpaEntity.setLastname(customer.getLastname());
        customerJpaEntity.setEmail(customer.getEmail());



        CustomerJpaEntity customerCompleted = customerRepository.save(customerJpaEntity);

        System.out.println(customerCompleted.getId());

        Map<String, Object> map = new HashMap<>();
        return map ;
    }
}

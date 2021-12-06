package be.heh.ec.ecproject.order.adapter.out.Persistence;

import be.heh.ec.ecproject.customer.domain.Customer;
import be.heh.ec.ecproject.customer.persistence.CustomerJpaEntity;
import be.heh.ec.ecproject.customer.persistence.CustomerRepository;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderPersistenceAdapter;
import be.heh.ec.ecproject.order.service.OrderService;
import be.heh.ec.ecproject.product.adapter.out.persistence.CarJpaEntity;
import be.heh.ec.ecproject.product.adapter.out.persistence.CarRepository;
import be.heh.ec.ecproject.product.adapter.out.persistence.EcCarPersistenceAdapter;
import be.heh.ec.ecproject.product.domain.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.shaded.com.google.common.util.concurrent.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("dev")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({OrderPersistenceAdapter.class})
public class PersistanceOrderTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    @Sql({"createTable.sql","CarPersistenceAdapterTests.sql"})
    public void SetClient()
    {

        CustomerJpaEntity customerJpaEntity = new CustomerJpaEntity();

        String firstName = "Mehdi";
        String lastName = "Fares";
        String email = "mehdifares@hotmail.com";

        customerJpaEntity.setFirstName(firstName);
        customerJpaEntity.setLastName(lastName);
        customerJpaEntity.setEmail(email);

        //customerRepository.save(customerJpaEntity);

        Map<String,Object> mapCar = new HashMap<>();
        List<CustomerJpaEntity> customerJpaList = customerRepository.findAll();
        List<Customer> carList = new ArrayList<Customer>();
        for (CustomerJpaEntity c: customerJpaList) {
            System.out.println(c);
        }
    };
}

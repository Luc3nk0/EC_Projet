package be.heh.ec.ecproject;

import be.heh.ec.ecproject.customer.persistence.CustomerRepository;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderPersistenceAdapter;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderRepository;
import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.service.OrderService;
import be.heh.ec.ecproject.product.adapter.out.persistence.CarRepository;
import be.heh.ec.ecproject.product.adapter.out.persistence.EcCarPersistenceAdapter;
import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile("prod")
@Configuration
@EnableJpaRepositories
public class PersistenceAdapterConfiguration {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ManageOrderAdapterUseCase orderPersistenceAdapter;
    @Primary
    @Bean
    ManageCarUseCase getManageCarUseCase(){
        return new EcCarPersistenceAdapter(carRepository);
    }
    @Primary
    @Bean
    ManageOrderUseCase getManageOrderUseCase(){return new OrderService(orderPersistenceAdapter);}
    @Primary
    @Bean
    ManageOrderAdapterUseCase getManageOrderAdapterUseCase()
    {
        return new OrderPersistenceAdapter(customerRepository, orderRepository, carRepository);
    }
}

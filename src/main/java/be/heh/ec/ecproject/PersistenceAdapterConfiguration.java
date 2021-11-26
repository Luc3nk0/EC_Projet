package be.heh.ec.ecproject;

import be.heh.ec.ecproject.order.adapter.out.persistence.OrderRepository;
import be.heh.ec.ecproject.product.adapter.out.persistence.CarRepository;
import be.heh.ec.ecproject.product.adapter.out.persistence.EcCarPersistenceAdapter;
import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Profile("prod")
@Configuration
@EnableJpaRepositories
public class PersistenceAdapterConfiguration {

    @Autowired
    private CarRepository carRepository;
    @Bean
    ManageCarUseCase getManageCarUseCase(){
        return new EcCarPersistenceAdapter(carRepository);
    }
}

package be.heh.ec.ecproject.order.application.port.out;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


public interface ManageOrderUseCase {

    public String setOrder(String order);
    public Map<String, Object> getOrderById(String order);
}

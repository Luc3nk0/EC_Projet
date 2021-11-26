package be.heh.ec.ecproject;

import be.heh.ec.ecproject.order.adapter.out.persistence.OrderRepository;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements ManageOrderUseCase {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public String setOrder(String order) {
        return "coucou";
    }
}

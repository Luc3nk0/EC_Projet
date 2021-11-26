package be.heh.ec.ecproject;

import be.heh.ec.ecproject.order.adapter.out.persistence.OrderRepository;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import be.heh.ec.ecproject.product.adapter.out.persistence.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
public class OrderService implements ManageOrderUseCase {

    private final OrderRepository orderRepository;
    @Override
    public String setOrder(String order) {
        System.out.println("TEST");
        return "coucou";
    }
}

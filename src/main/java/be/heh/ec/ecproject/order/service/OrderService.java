package be.heh.ec.ecproject.order.service;

import be.heh.ec.ecproject.order.adapter.out.persistence.OrderJpaEntity;
import be.heh.ec.ecproject.order.adapter.out.persistence.OrderRepository;
import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class OrderService implements ManageOrderUseCase {

    private final OrderRepository orderRepository;

    @Override
    public String setOrder(String order) {
        List<OrderJpaEntity> orderJpaList = orderRepository.findAll();

        return "Command received";
    }

    @Override
    public Map<String, Object> getOrderById(String orderId) {
        return null;
    }
}

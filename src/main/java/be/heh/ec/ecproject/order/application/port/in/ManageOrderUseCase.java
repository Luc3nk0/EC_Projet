package be.heh.ec.ecproject.order.application.port.in;

import be.heh.ec.ecproject.order.domain.Order;

import java.util.Map;

public interface ManageOrderUseCase {
    public Order setOrder(Order order);
    Map<String, Object> getOrderById(String orderId);
}

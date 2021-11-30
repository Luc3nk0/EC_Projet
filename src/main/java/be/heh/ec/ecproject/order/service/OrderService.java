package be.heh.ec.ecproject.order.service;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
@RequiredArgsConstructor
public class OrderService implements ManageOrderUseCase {

    private final ManageOrderAdapterUseCase manageOrderAdapterUseCase ;

    @Override
    public Order setOrder(Order order) {

        return manageOrderAdapterUseCase.insertOrder(order);
    }

    @Override
    public Map<String, Object> getOrderById(String orderId) {
        return null;
    }

}

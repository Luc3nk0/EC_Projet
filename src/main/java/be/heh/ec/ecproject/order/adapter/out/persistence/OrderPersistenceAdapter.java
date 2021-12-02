package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class OrderPersistenceAdapter implements ManageOrderAdapterUseCase {

    private final OrderRepository orderRepository;

    @Override
    public Map<String, Object> insertOrder(Map<String, Object> order) {

        return order;
    }
}

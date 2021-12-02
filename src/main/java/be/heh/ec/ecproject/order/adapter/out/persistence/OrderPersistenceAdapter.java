package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Array;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class OrderPersistenceAdapter implements ManageOrderAdapterUseCase {

    private final OrderRepository orderRepository;

    @Override
    public Map<String, Object> insertOrder(Map<String, Object> orderValue) {
        Order order = new Order((int)orderValue.get("id"),(int)orderValue.get("customerId"),(UUID)orderValue.get("UUID"));
        return orderValue;
    }
}

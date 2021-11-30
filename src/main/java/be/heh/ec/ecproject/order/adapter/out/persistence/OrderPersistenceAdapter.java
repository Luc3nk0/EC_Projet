package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderPersistenceAdapter implements ManageOrderAdapterUseCase {

    private final OrderRepository orderRepository;

    @Override
    public Order insertOrder(Order order) {
        System.out.println(order.toString());
        System.out.println(order.getCarListOrder());
        //System.out.println(order.getCarsId().toString());
        return order;
    }


}

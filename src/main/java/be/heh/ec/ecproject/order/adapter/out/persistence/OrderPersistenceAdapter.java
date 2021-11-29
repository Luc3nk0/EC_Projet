package be.heh.ec.ecproject.order.adapter.out.persistence;

import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderPersistenceAdapter implements ManageOrderAdapterUseCase {

    private final OrderRepository orderRepository;

    @Override
    public String insertOrder(String order) {

        return "Je suis l'adapter";
    }
}

package be.heh.ec.ecproject.order.application.port.out;

import be.heh.ec.ecproject.order.domain.Order;

public interface ManageOrderAdapterUseCase {
    public Order insertOrder(Order order);
}

package be.heh.ec.ecproject.order.application.port.out;

import be.heh.ec.ecproject.customer.domain.Customer;
import be.heh.ec.ecproject.order.domain.Order;

import java.util.Map;

public interface ManageOrderAdapterUseCase {
    public Map<String, Object> insertOrder(Order order, Customer customer);
}

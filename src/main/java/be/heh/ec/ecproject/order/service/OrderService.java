package be.heh.ec.ecproject.order.service;

import be.heh.ec.ecproject.customer.domain.Customer;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class OrderService implements ManageOrderUseCase {

    private final ManageOrderAdapterUseCase manageOrderAdapterUseCase ;

    @Override
    public Map<String, Object> setOrder(Map<String, Object> order) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();

        System.out.println("Your UUID is: " + uuidAsString);
        order.put("UUID", uuid);
        // test
        return manageOrderAdapterUseCase.insertOrder(new Order(1,2,uuid), new Customer(1,"a","b","c"));
    }

    @Override
    public Map<String, Object> getOrderById(String orderId) {
        return null;
    }

}

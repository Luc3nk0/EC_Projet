package be.heh.ec.ecproject.order.service;

import be.heh.ec.ecproject.customer.domain.Customer;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.order.application.port.out.ManageOrderAdapterUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import be.heh.ec.ecproject.order.domain.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class OrderService implements ManageOrderUseCase {

    private final ManageOrderAdapterUseCase manageOrderAdapterUseCase ;

    @Override
    public Map<String, Object> setPurchase(Purchase purchase) {
        UUID uuid = UUID.randomUUID();
        Order order = new Order(0,0,uuid);
        Customer customer = new Customer(0,purchase.getCustomerName(),purchase.getCustomerLastName(),purchase.getEmail());
        return manageOrderAdapterUseCase.insertOrder(order, customer, purchase.getCarlist());
    }

    @Override
    public Map<String, Object> getOrderById(String orderId) {
        return null;
    }

}


package be.heh.ec.ecproject.order.application.port.in;

import be.heh.ec.ecproject.order.domain.Purchase;

import java.util.Map;

public interface ManageOrderUseCase {
    public Map<String, Object> setPurchase(Purchase purchase);
    Map<String, Object> getOrderById(String orderId);
}

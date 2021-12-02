package be.heh.ec.ecproject.order.application.port.in;

import java.util.Map;

public interface ManageOrderUseCase {
    public Map<String, Object> setOrder(Map<String, Object> order);
    Map<String, Object> getOrderById(String orderId);
}

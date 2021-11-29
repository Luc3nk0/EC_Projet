package be.heh.ec.ecproject.order.application.port.in;

import java.util.Map;

public interface ManageOrderUseCase {
    public String setOrder(String order);

    Map<String, Object> getOrderById(String orderId);
}

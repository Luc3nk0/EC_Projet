package be.heh.ec.ecproject.order.application.port.out;

import java.util.Map;

public interface ManageOrderAdapterUseCase {
    public Map<String, Object> insertOrder(Map<String, Object> order);
}

package be.heh.ec.ecproject.product.application.port.in;

import java.util.Map;

public interface AllCarUseCase {
    public Map<String, Object> getCars();
    public Map<String, Object> getCarById(int index);
}

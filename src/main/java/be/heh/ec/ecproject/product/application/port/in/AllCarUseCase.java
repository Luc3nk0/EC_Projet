package be.heh.ec.ecproject.product.application.port.in;

import java.util.Map;

public interface AllCarUseCase {
    public Map<String, Object> getCars();
    public Map<String, Object> getCarById(int index);
    public Map<String, Object> getCarByMark(String mark);
    public Map<String, Object> getCarBySurname(String surname);
}

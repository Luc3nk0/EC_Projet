package be.heh.ec.ecproject.product.application.port.in;

import java.util.Map;

public interface ManageCarUseCase {
    Map<String, Object> getCars();
    Map<String, Object> getCarById(int index);
    Map<String, Object> getCarByMark(String mark);
    Map<String, Object> getCarBySurname(String surname);
}

package be.heh.ec.ecproject.product.adapter.out.persistence;

import be.heh.ec.ecproject.product.application.port.in.AllCarUseCase;
import be.heh.ec.ecproject.product.domain.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class EcCarPersistenceAdapter implements AllCarUseCase {

    private final CarRepository carRepository;

    @Override
    public Map<String, Object> getCars() {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        System.out.println(carRepository.findAll());
        //mapper
        List<Car> carList = new ArrayList<Car>();
        Map<String,Object> mapCar = new HashMap<>();
        for (CarJpaEntity c: carJpaList) {
            carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription()));
        }
        //---
        mapCar.put("cars",carList);
        return mapCar;
    }
}
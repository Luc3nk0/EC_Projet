package be.heh.ec.ecproject.product.adapter.out.persistence;

import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import be.heh.ec.ecproject.product.domain.Car;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class EcCarPersistenceAdapter implements ManageCarUseCase {

    private final CarRepository carRepository;

    @Override
    public Map<String, Object> getCars() {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<Car>();
        Map<String,Object> mapCar = new HashMap<>();
        for (CarJpaEntity c: carJpaList) {
            carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription()));
        }

        mapCar.put("cars",carList);
        return mapCar;
    }

    @Override
    public Map<String, Object> getCarById(int index)
    {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<Car>();
        for (CarJpaEntity c: carJpaList) {
            if (index == c.getId())
                carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription()));
        }
        Map<String,Object> mapCar = new HashMap<>();
        mapCar.put("cars",carList);
        return mapCar;
    }

    @Override
    public Map<String, Object> getCarByMark(String mark) {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<Car>();
        for (CarJpaEntity c: carJpaList) {
            if (c.getMark().toLowerCase().contains(mark.toLowerCase()))
                carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription()));
        }
        Map<String,Object> mapCar = new HashMap<>();
        mapCar.put("cars",carList);
        return mapCar;
    }

    @Override
    public Map<String, Object> getCarBySurname(String surname) {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<Car>();
        for (CarJpaEntity c: carJpaList) {
            if (c.getSurname().toLowerCase().contains(surname.toLowerCase()))
                carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription()));
        }
        Map<String,Object> mapCar = new HashMap<>();
        mapCar.put("cars",carList);
        return mapCar;
    }
}
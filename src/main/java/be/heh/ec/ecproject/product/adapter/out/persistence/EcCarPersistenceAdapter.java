package be.heh.ec.ecproject.product.adapter.out.persistence;

import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import be.heh.ec.ecproject.product.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class EcCarPersistenceAdapter implements ManageCarUseCase {

    private final CarRepository carRepository;
    @Autowired
    public EcCarPersistenceAdapter(CarRepository carRepository){
        this.carRepository= carRepository;
    }

    @Override
    public Map<String, Object> getCars() {
        Map<String,Object> mapCar = new HashMap<>();
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<>();
        for (CarJpaEntity c: carJpaList) {
            carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription(),c.getOrderid()));
        }

        mapCar.put("cars",carList);
        return mapCar;
    }

    @Override
    public Map<String, Object> getCarById(int index)
    {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<>();
        for (CarJpaEntity c: carJpaList) {
            if (index == c.getId())
                carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription(),c.getOrderid()));
        }
        Map<String,Object> mapCar = new HashMap<>();
        mapCar.put("cars",carList);
        return mapCar;
    }

    @Override
    public Map<String, Object> getCarByMark(String mark) {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<>();
        for (CarJpaEntity c: carJpaList) {
            if (c.getMark().toLowerCase().contains(mark.toLowerCase()))
                carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription(),c.getOrderid()));
        }
        Map<String,Object> mapCar = new HashMap<>();
        mapCar.put("cars",carList);
        return mapCar;
    }

    @Override
    public Map<String, Object> getCarBySurname(String surname) {
        List<CarJpaEntity> carJpaList = carRepository.findAll();
        List<Car> carList = new ArrayList<>();
        for (CarJpaEntity c: carJpaList) {
            if (c.getSurname().toLowerCase().contains(surname.toLowerCase()))
                carList.add(new Car(c.getId(),c.getSurname(),c.getMark(),c.getPrice(),c.getDescription(),c.getOrderid()));
        }
        Map<String,Object> mapCar = new HashMap<>();
        mapCar.put("cars",carList);
        return mapCar;
    }
}
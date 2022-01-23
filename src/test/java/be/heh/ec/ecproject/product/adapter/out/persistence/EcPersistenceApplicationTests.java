package be.heh.ec.ecproject.product.adapter.out.persistence;

import be.heh.ec.ecproject.product.domain.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ActiveProfiles("dev")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({EcCarPersistenceAdapter.class})
public class EcPersistenceApplicationTests {
    @Autowired
    private CarRepository carRepository;

    private EcCarPersistenceAdapter carPersistenceAdapter;

    @Test
    @Sql({"createTable.sql","CarPersistenceAdapterTests.sql"})
    void getAllCars(){
        carPersistenceAdapter = new EcCarPersistenceAdapter(carRepository);
        Map<String, Object> map = new HashMap<>();
        ArrayList<Car> cars;
        map = carPersistenceAdapter.getCars();
        cars = (ArrayList<Car>)map.get("cars");
        assertEquals("Panda",cars.get(0).getSurname());
    }

    @Test
    @Sql({"createTable.sql","CarPersistenceAdapterTests.sql"})
    void getProductById()
    {
        int id = 1;
        carPersistenceAdapter = new EcCarPersistenceAdapter(carRepository);
        Map<String, Object> map = new HashMap<>();
        ArrayList<Car> cars;
        map = carPersistenceAdapter.getCarById(id);
        cars = (ArrayList<Car>)map.get("cars");
        assertEquals("Panda",cars.get(0).getSurname());
    }

    @Test
    @Sql({"createTable.sql","CarPersistenceAdapterTests.sql"})
    void getProductByName()
    {
        String name = "anda";
        carPersistenceAdapter = new EcCarPersistenceAdapter(carRepository);
        Map<String, Object> map = new HashMap<>();
        ArrayList<Car> cars;
        map = carPersistenceAdapter.getCarBySurname(name);
        cars = (ArrayList<Car>)map.get("cars");
        assertEquals("Panda",cars.get(0).getSurname());
    }

    @Test
    @Sql({"createTable.sql","CarPersistenceAdapterTests.sql"})
    void getProductByMark()
    {
        String mark = "fi";
        carPersistenceAdapter = new EcCarPersistenceAdapter(carRepository);
        Map<String, Object> map = new HashMap<>();
        ArrayList<Car> cars;
        map = carPersistenceAdapter.getCarByMark(mark);
        cars = (ArrayList<Car>)map.get("cars");
        assertEquals("Fiat",cars.get(0).getMark());
    }
}
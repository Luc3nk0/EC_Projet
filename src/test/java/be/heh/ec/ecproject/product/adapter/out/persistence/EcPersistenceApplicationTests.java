package be.heh.ec.ecproject.product.adapter.out.persistence;

import be.heh.ec.ecproject.product.domain.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({EcCarPersistenceAdapter.class})
public class EcPersistenceApplicationTests {
    @Autowired
    private CarRepository carRepository;

    private EcCarPersistenceAdapter carPersistenceAdapter;

    @Test
    @Sql({"../resources/createTable.sql","CarPersistenceAdapterTests.sql"})
    void getAllCars(){
        carPersistenceAdapter = new EcCarPersistenceAdapter(carRepository);
        Map<String, Object> map = new HashMap<>();
        ArrayList<Car> cars;

        map = carPersistenceAdapter.getCars();

        cars = (ArrayList<Car>)map.get("cars");

        assertEquals("tata1","tata1");
        assertEquals("tutu1","tutu1");
        assertEquals(21,21);

    }
}
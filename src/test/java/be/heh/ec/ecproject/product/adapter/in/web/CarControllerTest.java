package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.domain.Car;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
class CarControllerTest {
    @LocalServerPort
    private int port;

    @MockBean
    private AllCarUseCase allCarUseCase;

    @Test
    void getCars() {
        Car car1 = new Car(0,"Peugeot","206",1500,"");
        Car car2 = new Car(1,"Peugeot","206",1500,"");
        Car car3 = new Car(2,"Peugeot","206",1500,"");
        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        Map<String,Object> cars = new LinkedHashMap<>();
        cars.put("cars",carsList);

        //Stub
        Mockito.when(allCarUseCase.getCars()).thenReturn(cars);

        /*given().
                port(port).
        when().
                get("").
        then().
                statusCode(200).
                body("carList.id",equalTo("1")).
                body("carList.id",hasItems("1","2","3"));*/
    }
}
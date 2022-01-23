package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import be.heh.ec.ecproject.product.domain.Car;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;


import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

@ActiveProfiles("dev")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
class CarControllerTest {
    @LocalServerPort
    private int port;
    @MockBean
    private ManageCarUseCase manageCarUseCase;

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
        Mockito.when(manageCarUseCase.getCars()).thenReturn(cars);

        baseURI ="http://localhost/api";
        given().
                port(port).
        when().
                get("/car").
        then().
                statusCode(200).
                body("cars[1].surname",equalTo("Peugeot")).
                body("cars.mark",hasItems("206","206","206"));
    }
    @Test
    void getCarsById() {
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
        Mockito.when(manageCarUseCase.getCarById(0)).thenReturn(cars);

        baseURI ="http://localhost/api";
        given().
                port(port).
                when().
                get("/car/4").
                then().
                statusCode(200).
                body("cars[4].surname",equalTo("Peugeot"));
    }

    @Test
    void getCarsByName() {
        Car car1 = new Car(0,"206","Peugeot",1500,"");
        Car car2 = new Car(1,"Panda","Fiat",1500,"");
        Car car3 = new Car(2,"306","Toyota",1500,"");
        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        Map<String,Object> cars = new LinkedHashMap<>();
        cars.put("cars",carsList);

        //Stub
        Mockito.when(manageCarUseCase.getCarBySurname("Panda")).thenReturn(cars);

        baseURI ="http://localhost/api";
        given().
                port(port).
                when().
                get("/car/name/Panda").
                then().
                statusCode(200).
                body("cars.surname",hasItems("206","306","Panda"));
                //body("cars[2].surname",equalTo("Panda"));
    }

    @Test
    void getCarsByMark() {
        Car car1 = new Car(0,"206","Peugeot",1500,"");
        Car car2 = new Car(1,"Panda","Fiat",1500,"");
        Car car3 = new Car(2,"306","Toyota",1500,"");
        //Car car4 = new Car(2,"306","Toyota",1500,"");
        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        Map<String,Object> cars = new LinkedHashMap<>();
        cars.put("cars",carsList);

        //Stub
        Mockito.when(manageCarUseCase.getCarByMark("Fiat")).thenReturn(cars);
        System.out.println(cars);
        baseURI ="http://localhost/api";
        given().
                port(port).
                when().
                get("/car/mark/Fiat").
                then().
                statusCode(200).
                body("cars.mark",hasItems("Fiat","Peugeot","Toyota"));
                //body("cars[4].surname",equalTo("Peugeot"));

    }
}
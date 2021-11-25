package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.application.port.in.AllCarUseCase;
import be.heh.ec.ecproject.product.domain.Car;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

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
        Car car1 = new Car(0L,"Peugeot","206",1500,"");
        Car car2 = new Car(1L,"Peugeot","206",1500,"");
        Car car3 = new Car(2L,"Peugeot","206",1500,"");
        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        Map<String,Object> cars = new LinkedHashMap<>();
        cars.put("cars",carsList);

        //Stub
        Mockito.when(allCarUseCase.getCars()).thenReturn(cars);

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
}
package be.heh.ec.ecproject.order.adapter.out.web;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import be.heh.ec.ecproject.product.domain.Car;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItems;

@ActiveProfiles("dev")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
class OrderControllerTest {
    @LocalServerPort
    private int port;
    @MockBean
    private ManageCarUseCase manageCarUseCase;
    @MockBean
    private ManageOrderUseCase manageOrderUseCase;

    @Test
    void setOrder()
    {
        Car car1 = new Car(0,"206","Peugeot",1500,"");
        Car car2 = new Car(1,"Panda","Fiat",1500,"");
        Car car3 = new Car(2,"306","Toyota",1500,"");
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        Map<String,Object> cars = new LinkedHashMap<>();
        cars.put("cars",carsList);

        ArrayList<Order> orderList = new ArrayList<>();
        Map<String,Object> orders = new LinkedHashMap<>();
        orders.put("orders",orderList);

        //Order order1 = new Order(2,6,carsList);

        Mockito.when(manageOrderUseCase.setOrder("")).thenReturn(String.valueOf(orders));
        baseURI ="http://localhost/api";
        given().
                port(port).
                when().
                get("/order").
                then().
                statusCode(200);
                /*body("cars[1].surname",equalTo("Peugeot")).
                body("cars.mark",hasItems("206","206","206"));*/
    }
}

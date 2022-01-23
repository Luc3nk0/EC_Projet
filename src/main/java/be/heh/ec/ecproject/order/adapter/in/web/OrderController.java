package be.heh.ec.ecproject.order.adapter.in.web;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.order.domain.Purchase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/response")
@Slf4j
public class OrderController {
    private final ManageOrderUseCase manageOrderUseCase;

    @PostMapping("/order")
    public Map<String, Object> postOrder(@RequestBody Purchase purchase) {
        log.info("Command recieved : First name : "+ purchase.getCustomerName()+
                "/ Last name :"+ purchase.getCustomerLastName()+
                "/ Email : "+ purchase.getEmail()+
                "/ CadID : "+ purchase.getCarlist());
        return manageOrderUseCase.setPurchase(purchase);
    }
/*
    @RequestMapping("/order/id/{orderId}")
    public Map<String, Object> getOrderById(@PathVariable String orderId){
        return manageOrderUseCase.getOrderById(orderId);
    }*/
}

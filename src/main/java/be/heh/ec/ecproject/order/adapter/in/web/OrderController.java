package be.heh.ec.ecproject.order.adapter.in.web;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/response")
public class OrderController {
    private final ManageOrderUseCase manageOrderUseCase;

    @PostMapping("/order")
    public String postOrder(@RequestBody String order) {
        return manageOrderUseCase.setOrder(order);
    }

    @RequestMapping("/order/id/{orderId}")
    public Map<String, Object> getOrderById(@PathVariable String orderId){
        return manageOrderUseCase.getOrderById(orderId);
    }
}

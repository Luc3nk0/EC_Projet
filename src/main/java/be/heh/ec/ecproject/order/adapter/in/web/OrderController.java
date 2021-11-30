package be.heh.ec.ecproject.order.adapter.in.web;

import be.heh.ec.ecproject.order.application.port.in.ManageOrderUseCase;
import be.heh.ec.ecproject.order.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/response")
public class OrderController {
    private final ManageOrderUseCase manageOrderUseCase;

    @PostMapping("/order")
    public Order postOrder(@RequestBody Order order) {

        return manageOrderUseCase.setOrder(order);
    }
/*
    @RequestMapping("/order/id/{orderId}")
    public Map<String, Object> getOrderById(@PathVariable String orderId){
        return manageOrderUseCase.getOrderById(orderId);
    }*/
}

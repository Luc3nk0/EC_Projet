package be.heh.ec.ecproject.order.adapter.out.web;

import be.heh.ec.ecproject.order.application.port.out.ManageOrderUseCase;
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
}

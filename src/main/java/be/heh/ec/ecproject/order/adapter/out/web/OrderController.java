package be.heh.ec.ecproject.order.adapter.out.web;

import be.heh.ec.ecproject.order.application.port.out.ManageOrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/response")
public class OrderController {
    private ManageOrderUseCase manageOrderUseCase;

    @PostMapping("/order")
    public String postBody(@RequestBody String order) {
        return manageOrderUseCase.setOrder(order);
    }
}

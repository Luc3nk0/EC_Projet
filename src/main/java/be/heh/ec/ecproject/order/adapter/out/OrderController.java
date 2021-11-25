package be.heh.ec.ecproject.order.adapter.out;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/response")
public class OrderController {

    @PostMapping("/order")
    public String postBody(@RequestBody String fullName) {
        return "Hello " + fullName;
    }

}

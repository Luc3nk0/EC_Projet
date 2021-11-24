package be.heh.ec.ecproject.product.adapter.in.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Bean;

import java.util.Map;

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor

public class CarController {
    private final AllCarUseCase allCarUseCase;

    @GetMapping("/car")
    public Map<String, Object> getCars()
    {
        return allCarUseCase.getCars();
    }
}

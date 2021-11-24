package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.application.port.in.AllCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
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

package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.adapter.out.persistence.CarJpaEntity;
import be.heh.ec.ecproject.product.application.port.in.AllCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.Bean;

import java.util.List;
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

    @RequestMapping("/car/{carId}")
    public Map<String, Object> getCarById(@PathVariable int carId){
        return allCarUseCase.getCarById(carId);

    }

}

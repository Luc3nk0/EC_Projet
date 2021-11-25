package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class CarController {
    private final ManageCarUseCase manageCarUseCase;

    @GetMapping("/car")
    public Map<String, Object> getCars()
    {
        return manageCarUseCase.getCars();
    }

    @RequestMapping("/car/{carId}")
    public Map<String, Object> getCarById(@PathVariable int carId){
        return manageCarUseCase.getCarById(carId);
    }
    @RequestMapping("/car/name/{carName}")
    public Map<String, Object> getCarBySurname(@PathVariable String carName){
        return manageCarUseCase.getCarBySurname(carName);
    }
    @RequestMapping("/car/mark/{carMark}")
    public Map<String, Object> getCarByMark(@PathVariable String carMark){
        return manageCarUseCase.getCarByMark(carMark);
    }
}

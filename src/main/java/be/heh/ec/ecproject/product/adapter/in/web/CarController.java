package be.heh.ec.ecproject.product.adapter.in.web;

import be.heh.ec.ecproject.product.application.port.in.ManageCarUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@Slf4j
public class CarController {
    private final ManageCarUseCase manageCarUseCase;


    @GetMapping("/car")
    public Map<String, Object> getCars()
    {
        log.info("Get cars");
        return manageCarUseCase.getCars();
    }

    @RequestMapping("/car/{carId}")
    public Map<String, Object> getCarById(@PathVariable int carId){
        log.info("Get cars by id");
        return manageCarUseCase.getCarById(carId);
    }
    @RequestMapping("/car/name/{carName}")
    public Map<String, Object> getCarBySurname(@PathVariable String carName){
        log.info("Get cars by surname");
        return manageCarUseCase.getCarBySurname(carName);
    }
    @RequestMapping("/car/mark/{carMark}")
    public Map<String, Object> getCarByMark(@PathVariable String carMark){
        log.info("Get cars by surname");
        return manageCarUseCase.getCarByMark(carMark);
    }
}

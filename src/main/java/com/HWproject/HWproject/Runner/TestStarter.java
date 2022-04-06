package com.HWproject.HWproject.Runner;

import com.HWproject.HWproject.entity.Car;
import com.HWproject.HWproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class TestStarter implements CommandLineRunner {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {

        Car car = new Car();
        car.setBrand("Mercedes");
        car.setModel("GLE");
        car.setYear(2018);

        carRepository.save(car);
    }
}

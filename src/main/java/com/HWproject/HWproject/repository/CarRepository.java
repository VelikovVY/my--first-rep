package com.HWproject.HWproject.repository;

import com.HWproject.HWproject.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}

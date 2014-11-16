package org.taxi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taxi.model.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}

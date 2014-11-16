package org.taxi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taxi.model.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
	
	public List<Driver> findByBusy(boolean busy);

}

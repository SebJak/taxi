package org.taxi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taxi.model.entity.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {

}

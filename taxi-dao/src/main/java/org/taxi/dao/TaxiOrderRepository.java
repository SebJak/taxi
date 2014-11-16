package org.taxi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.taxi.model.entity.TaxiOrder;

public interface TaxiOrderRepository extends JpaRepository<TaxiOrder, Long> {

}

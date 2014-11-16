package org.taxi.engine.core;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.taxi.dao.DriverRepository;
import org.taxi.dao.RegionRepository;
import org.taxi.dao.TaxiOrderRepository;
import org.taxi.model.Address;
import org.taxi.model.entity.Driver;
import org.taxi.model.entity.Region;
import org.taxi.model.entity.TaxiOrder;
import org.taxi.model.enums.Status;
import org.taxi.model.json.JsonResponse;
import org.taxi.service.TaxiOrderService;

@Service("taxiOrderService")
public class TaxiOrderServiceImpl implements TaxiOrderService {
	
	@Autowired
	private TaxiOrderRepository taxiOrderRepository;
	
	@Autowired
	private RegionRepository regionRepository;
	
	@Autowired
	private DriverRepository driverRepository;

	@Override
	public JsonResponse orderTaxi(JsonResponse response, String address, String addressLocation, String note, Date targetTime, String contactPhone) {
		//TODO
		//Method which will find the region from received address. It can be problem for finding solution in quick time, but never say never :)
		Random randomElement = new Random();
		List<Region> region = regionRepository.findAll();
		System.out.println(region.size());
		//TODO
		//Method which will looking for the nearest driver.
		List<Driver> drivers = driverRepository.findByBusy(false);
		
		System.out.println(address);
		TaxiOrder taxiOrder = new TaxiOrder(address, region.get(randomElement.nextInt(region.size())), contactPhone, note, new Date(), targetTime, null, Status.NEW);
		taxiOrderRepository.save(taxiOrder);
		
		response.setMessage("REQUEST_IN_VALIDATION");
		response.setSuccess(true);
		
		return response;
	}

}

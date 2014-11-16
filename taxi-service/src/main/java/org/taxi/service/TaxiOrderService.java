package org.taxi.service;

import java.util.Date;

import org.taxi.model.json.JsonResponse;

public interface TaxiOrderService {

	public JsonResponse orderTaxi(JsonResponse response, String address, String addressLocation, String note, Date targetTime, String contactPhone);
	
}

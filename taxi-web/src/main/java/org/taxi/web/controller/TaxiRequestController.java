package org.taxi.web.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.taxi.dao.CarRepository;
import org.taxi.model.json.JsonRequest;
import org.taxi.model.json.JsonResponse;
import org.taxi.service.TaxiOrderService;

@RestController
public class TaxiRequestController {

	@Autowired
	TaxiOrderService taxiOrderService;
	
	private final SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	@RequestMapping(value="/orderTaxi", produces={"application/json"})
	public JsonResponse orderTaxi(@RequestBody JsonRequest request){
		JsonResponse response = new JsonResponse();
		System.out.println("Taxi ordered");
		Date targetTime = new Date();
		if(request.getOrder().getTargetTime()!=null){
			try {
				targetTime = simpleFormatter.parse(request.getOrder().getTargetTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		response = taxiOrderService.orderTaxi(response, request.getOrder().getAddress(), request.getOrder().getAddressLocation(), request.getOrder().getNote(), targetTime, request.getOrder().getContactPhone());
		return response;
	}
	
}

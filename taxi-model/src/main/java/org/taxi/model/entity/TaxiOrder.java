package org.taxi.model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import org.taxi.model.enums.Status;

@Entity
public class TaxiOrder extends BaseEntity {

	private static final long serialVersionUID = -6520112390011077234L;
	
	private String adress;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="regionId")
	private Region region;
	
	private String telephoneNumber;
	
	private String note;
	
	private Date orderTime;
	
	private Date targetTime;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="driverId")
	private Driver driver;

	@Enumerated(EnumType.STRING)
	private Status status;
	


	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getTargetTime() {
		return targetTime;
	}

	public void setTargetTime(Date targetTime) {
		this.targetTime = targetTime;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public TaxiOrder() {
		super();
	}

	public TaxiOrder(String address, Region region, String telephoneNumber,
			String note, Date orderTime, Date targetTime, Driver driver,
			Status status) {
		super();
		this.adress = address;
		this.region = region;
		this.telephoneNumber = telephoneNumber;
		this.note = note;
		this.orderTime = orderTime;
		this.targetTime = targetTime;
		this.driver = driver;
		this.status = status;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}

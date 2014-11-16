package org.taxi.model.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.taxi.model.Address;

@Entity
public class Driver extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -2581393136172125361L;
	
	private String firstName;
	
	private String lastName;
	
	@Embedded
	private Address adress; 
	
	private String telephoneNumber;
	
	private boolean busy;
	
	@ManyToOne(targetEntity=Region.class)
	@JoinColumn(name="regionId")
	private Region region;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="currentCar")
	private Car car;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	

}

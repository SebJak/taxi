package org.taxi.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8699033253210643708L;

	private String street;
	
	private String city;
	
	private String no;
	
	private String postcode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public Address() {
		super();
	}

	public Address(String street, String city, String no, String postcode) {
		super();
		this.street = street;
		this.city = city;
		this.no = no;
		this.postcode = postcode;
	}
	
	
}

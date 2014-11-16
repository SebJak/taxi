package org.taxi.model.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Region extends BaseEntity {

	private static final long serialVersionUID = -7335800329942385886L;
	
	private String city;
	
	@Column(unique=true)
	private String district;
	
	@OneToMany(targetEntity=Driver.class, mappedBy="region")
	private Set<Driver> availableDrivers;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public Set<Driver> getAvailableDrivers() {
		return availableDrivers;
	}

	public void setAvailableDrivers(Set<Driver> availableDrivers) {
		this.availableDrivers = availableDrivers;
	}
	

}

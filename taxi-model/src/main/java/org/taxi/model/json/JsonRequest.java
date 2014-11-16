package org.taxi.model.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class JsonRequest {

	private TaxiOrder order;
	
	private String user;
	
	private String password;

	public TaxiOrder getOrder() {
		return order;
	}

	public void setOrder(TaxiOrder order) {
		this.order = order;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

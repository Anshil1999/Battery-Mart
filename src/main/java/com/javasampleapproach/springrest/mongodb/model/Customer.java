package com.javasampleapproach.springrest.mongodb.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {
	@Id
	private String id;

	public String srn;
	public String date;
	
	public String vrn;
	public String name;
	public String phone;

	public Customer() {
	}
	

	public Customer(String srn, String date, String vrn, String name, String phone) {
		super();
		this.srn = srn;
		this.date = date;
		this.vrn = vrn;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", srn=" + srn + ", date=" + date + ", vrn=" + vrn + ", name=" + name + ", phone="
				+ phone + "]";
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrn() {
		return srn;
	}

	public void setSrn(String srn) {
		this.srn = srn;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVrn() {
		return vrn;
	}

	public void setVrn(String vrn) {
		this.vrn = vrn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

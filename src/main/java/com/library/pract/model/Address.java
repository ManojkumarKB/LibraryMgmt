package com.library.pract.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "Address")
public class Address {
 
    @Id
    @GeneratedValue
    @Column(name = "Address_id")
    private long id;
 
    @Column(name = "Door_no")
    private String Door_no;
    
    @Column(name="Street")
    private String Street;
    
    @Column(name="place")
    private String place;
    
    @Column(name="District")
    private String District;
    
    @Column(name="Pincode")
    private String Pincode;
 
    public Address() { }
 
   
 
    public Address(String door_no, String street, String place, String district, String pincode) {
		Door_no = door_no;
		Street = street;
		this.place = place;
		District = district;
		Pincode = pincode;
	}
    
    
	public long getId() {
        return id;
    }
 
    public void setId(long id) {
        this.id = id;
    }



	public String getDoor_no() {
		return Door_no;
	}



	public void setDoor_no(String door_no) {
		this.Door_no = door_no;
	}



	public String getStreet() {
		return Street;
	}



	public void setStreet(String street) {
		this.Street = street;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getDistrict() {
		return District;
	}



	public void setDistrict(String district) {
		this.District = district;
	}



	public String getPincode() {
		return Pincode;
	}



	public void setPincode(String pincode) {
		Pincode = pincode;
	}
 
 
 
}
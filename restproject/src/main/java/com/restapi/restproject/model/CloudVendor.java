package com.restapi.restproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name="cloud_vendor_info") //if you dont want to name your table then dont use @Table annotation
public class CloudVendor {
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	// Default constructor
    public CloudVendor() {
    }
	
 // Parameterized constructor
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) {
		this.vendorId = vendorId;//vendor_id
		this.vendorName = vendorName;//vendor_name
		this.vendorAddress = vendorAddress;//vendor_address
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	// Getters and Setters
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	
	

}

package com.restapi.restproject.service;

import java.util.List;

import com.restapi.restproject.model.CloudVendor;

public interface CloudVendorService {
	public String createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String vendorId);
	public CloudVendor getCloudVendor(String cloudVendorId);
	public List<CloudVendor> getAllCloudVendors();
	
	
	

}

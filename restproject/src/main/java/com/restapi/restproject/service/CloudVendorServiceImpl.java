package com.restapi.restproject.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.restproject.Exception.CloudVendorNotFoundException;
import com.restapi.restproject.model.CloudVendor;
import com.restapi.restproject.repository.CloudVendorRepository;
import com.restapi.restproject.service.CloudVendorService;

@Service

public class CloudVendorServiceImpl implements CloudVendorService{
	
	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

//From line 10 to 14 makes sure that service layer connects to repository layer

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		// Lets write some code/logic inside so that it ca actually create data in the database with the help of repository layer.
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		// TODO Auto-generated method stub
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}
//Exception handling 
	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
			throw new CloudVendorNotFoundException("Requested cloud vendor does not exits");
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		// TODO Auto-generated method stub
		return cloudVendorRepository.findAll();
	}

}

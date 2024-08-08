package com.restapi.restproject.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restproject.model.CloudVendor;
import com.restapi.restproject.response.ResponseHandler;
import com.restapi.restproject.service.CloudVendorService;



// How will the Spring understand that this is a controller class?
@RestController 
@RequestMapping("/cloudvendor") //Give the context path inside the request mapping
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	
	 public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	//CloudVendor cloudVendor; //Create a cloudVendor object and directly return it 
	
	 //Read specific cloud vendor details
	@GetMapping("{vendorId}") //Give the context path inside the request mapping
	public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorId") String VendorId)
	{
		//return new CloudVendor("C1","Vendor 1","Address one","xxxx");
		//return cloudVendorService.getCloudVendor(VendorId);
		//we need to call our response handler as it is static method we need to declare it as below
		return ResponseHandler.responseBuilder("Requested vendor details are given here", HttpStatus.OK, cloudVendorService.getCloudVendor(VendorId));
	}
	
	//Read All cloud vendors details from DB
	@GetMapping() //Give the context path inside the request mapping
	
	public List<CloudVendor> getAllCloudVendorDetails()
	{
		//return new CloudVendor("C1","Vendor 1","Address one","xxxx");
		return cloudVendorService.getAllCloudVendors();
	}
	
	
	@PutMapping
	public String updatedCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud vendor updated successfully";
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud vendor created successfully";
	}
	
	 @DeleteMapping("/{vendorId}")
	    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	    {
	        cloudVendorService.deleteCloudVendor(vendorId);
	        return "Cloud Vendor Deleted Successfully";
	    }

}

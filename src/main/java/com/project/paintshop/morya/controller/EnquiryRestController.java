//package com.project.paintshop.morya.controller;
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.project.paintshop.morya.model.Enquiry;
//import com.project.paintshop.morya.service.EnquiryService;
//
//@RestController
//@CrossOrigin
//@RequestMapping("/enq")
//public class EnquiryRestController {
//
//	@Autowired
//	EnquiryService enquiryService;
//	
//	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//	public Collection<Enquiry> getAllEnquiry()
//	{
//		return enquiryService.getAllEnquiry();
//	}
//	
//	@PostMapping(value = "/save",consumes = MediaType.APPLICATION_JSON_VALUE)
//	public void saveEnquiry(@RequestBody Enquiry enquiry)
//	{
//		enquiryService.addEnquiry(enquiry);
//	}
//}

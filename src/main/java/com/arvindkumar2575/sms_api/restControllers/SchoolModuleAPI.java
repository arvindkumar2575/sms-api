package com.arvindkumar2575.sms_api.restControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arvindkumar2575.sms_api.Constants.CommonConstant;

@RestController
@RequestMapping("/api/school")
public class SchoolModuleAPI {


    @GetMapping("/setup")
	public String setup(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format(CommonConstant.template, name);
	}
    
}

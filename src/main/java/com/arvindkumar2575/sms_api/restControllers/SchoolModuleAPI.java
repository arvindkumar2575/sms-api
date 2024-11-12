package com.arvindkumar2575.sms_api.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.arvindkumar2575.sms_api.Constants.CommonConstant;
import com.arvindkumar2575.sms_api.models.ResponseModel;
import com.arvindkumar2575.sms_api.models.SchoolSetupModel;
import com.arvindkumar2575.sms_api.services.SchoolSetupService;
import com.google.gson.Gson;

@RestController
@RequestMapping("/api/school")
public class SchoolModuleAPI {

	@Autowired
	SchoolSetupService schoolSetupService;

	/*
	 * hello world example
	 */
    @GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format(CommonConstant.TEMPLATE_STRING, name);
	}


	/**
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping("/setup")
	public ResponseModel setup(@RequestBody() String name) {
		ResponseModel response = CommonConstant.DEFAULT_PAYLOAD_ERROR_JSON;
		SchoolSetupModel model = new Gson().fromJson(name, SchoolSetupModel.class);
		// System.out.println(model.toString());
		if(schoolSetupService.validateSchoolSetupData(model)) {
			response = schoolSetupService.schoolSetup(model);
		}
		return response;
	}
    
}

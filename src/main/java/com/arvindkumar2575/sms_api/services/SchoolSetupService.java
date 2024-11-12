package com.arvindkumar2575.sms_api.services;

import org.springframework.stereotype.Component;

import com.arvindkumar2575.sms_api.models.ResponseModel;
import com.arvindkumar2575.sms_api.models.SchoolSetupModel;

@Component
public interface SchoolSetupService {
    boolean validateSchoolSetupData(SchoolSetupModel model);

    ResponseModel schoolSetup(SchoolSetupModel model);
    
}

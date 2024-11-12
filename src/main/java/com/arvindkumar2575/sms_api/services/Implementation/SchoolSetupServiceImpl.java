package com.arvindkumar2575.sms_api.services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.arvindkumar2575.sms_api.models.ResponseModel;
import com.arvindkumar2575.sms_api.models.SchoolModel;
import com.arvindkumar2575.sms_api.models.SchoolSetupModel;
import com.arvindkumar2575.sms_api.models.UserModel;
import com.arvindkumar2575.sms_api.services.CommonService;
import com.arvindkumar2575.sms_api.services.SchoolSetupService;

@Service
public class SchoolSetupServiceImpl implements SchoolSetupService {
    
    @Autowired
    CommonService commonService;

    @Override
    public boolean validateSchoolSetupData(SchoolSetupModel model) {
        SchoolModel schoolModel = model.getSchool();
        UserModel adminModel = model.getAdmin();
        if (commonService.isNull(schoolModel.getName()) ||
            commonService.isNull(schoolModel.getAddress()) || 
            commonService.isNull(schoolModel.getState()) || 
            commonService.isNull(schoolModel.getCity()) || 
            commonService.isNull(schoolModel.getZip()) ||
            commonService.isNull(adminModel.getFirstName()) ||
            commonService.isNull(adminModel.getLastName()) ||
            commonService.isValidGender(adminModel.getGender())) {
                System.out.println("not valid");
                return false;
        }
        System.out.println("valid");
        return true;
    }

    @Override
    public ResponseModel schoolSetup(SchoolSetupModel model) {
        ResponseModel responseModel = new ResponseModel();
        SchoolModel schoolModel = model.getSchool();
        UserModel adminModel = model.getAdmin();
        responseModel.setResponse(model);

        return responseModel;
    }
    
}

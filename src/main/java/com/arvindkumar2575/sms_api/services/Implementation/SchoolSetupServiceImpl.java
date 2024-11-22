package com.arvindkumar2575.sms_api.services.Implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arvindkumar2575.sms_api.Constants.CommonConstant;
import com.arvindkumar2575.sms_api.entities.School;
import com.arvindkumar2575.sms_api.entities.User;
import com.arvindkumar2575.sms_api.models.ResponseModel;
import com.arvindkumar2575.sms_api.models.SchoolModel;
import com.arvindkumar2575.sms_api.models.SchoolSetupModel;
import com.arvindkumar2575.sms_api.models.UserModel;
import com.arvindkumar2575.sms_api.repositories.SchoolRespository;
import com.arvindkumar2575.sms_api.repositories.UserRespository;
import com.arvindkumar2575.sms_api.services.CommonService;
import com.arvindkumar2575.sms_api.services.SchoolSetupService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SchoolSetupServiceImpl implements SchoolSetupService {
    
    @Autowired
    CommonService commonService;

    @Autowired
    SchoolRespository schoolRespository;

    @Autowired
    UserRespository userRespository;

    @Override
    public boolean validateSchoolSetupData(SchoolSetupModel model) {
        SchoolModel schoolModel = model.getSchool();
        UserModel adminModel = model.getAdmin();
        if (commonService.isStringNull(schoolModel.getName()) || 
            commonService.isStringNull(schoolModel.getAddress()) || 
            commonService.isStringNull(schoolModel.getState()) || 
            commonService.isStringNull(schoolModel.getCity()) || 
            commonService.isStringNull(schoolModel.getZip()) ||
            commonService.isLongNull(adminModel.getId())) {
                return false;
        }
        return true;
    }

    @Override
    public ResponseModel schoolSetup(ResponseModel responseModel, SchoolSetupModel model) {
        boolean setError = false;
        SchoolModel schoolModel = model.getSchool();
        UserModel adminModel = model.getAdmin();

        if (adminModel != null) {
            responseModel.setResponse(model);
            // Optional<User> optional = userRespository.findById(adminModel.getId());
            // if (optional.isPresent()) {
            //     User user = optional.get();
            //     if (schoolModel != null) {
            //         responseModel.setResponse(user);
            //     } else {
            //         setError = true;
            //     }
            // }
        } else {
            setError = true;
        }
        
        
        // responseModel.setResponse(model);
        if (setError) {
            responseModel.setError(null);
        }
        return responseModel;
    }
    
}

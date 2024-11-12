package com.arvindkumar2575.sms_api.services.Implementation;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.arvindkumar2575.sms_api.Constants.CommonConstant;
import com.arvindkumar2575.sms_api.services.CommonService;

@Service
public class CommonServiceImpl implements CommonService {

    /**
     * check null of string value: true if value have, otherwise false
     * @param value
     * @return
     */
    @Override
    public boolean isNull(String value) {
        if (value.isBlank() || value.isEmpty()) {
            System.out.println("value is null");
            return true;
        }
        System.out.println("value is not null");
        return false;
    }

    @Override
    public boolean isValidGender(String gender) {
        if (!Arrays.stream(CommonConstant.GENDER).anyMatch(gender::equals)) {
            System.out.println("value is null");
            return true;
        }
        System.out.println("value is not null");
        return false;
    }
    
}

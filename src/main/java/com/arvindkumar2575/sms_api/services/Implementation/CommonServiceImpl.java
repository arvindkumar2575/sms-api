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
    public boolean isStringNull(String value) {
        if (value==null || value.isEmpty() || value.isBlank()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidGender(String gender) {
        if (!Arrays.stream(CommonConstant.GENDER).anyMatch(gender::equals)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isLongNull(Long value) {
        if (value==null || value.longValue()<1) {
            return true;
        }
        return false;
    }
    
}

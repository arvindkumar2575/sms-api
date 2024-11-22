package com.arvindkumar2575.sms_api.services;

import org.springframework.stereotype.Component;

@Component
public interface CommonService {
    boolean isStringNull(String value);
    
    boolean isLongNull(Long value);

    boolean isValidGender(String gender);
    
}

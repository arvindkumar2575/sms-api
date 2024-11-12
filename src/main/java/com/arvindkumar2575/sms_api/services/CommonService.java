package com.arvindkumar2575.sms_api.services;

import org.springframework.stereotype.Component;

@Component
public interface CommonService {
    boolean isNull(String value);

    boolean isValidGender(String gender);
    
}

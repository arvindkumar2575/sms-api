package com.arvindkumar2575.sms_api.models;

import com.arvindkumar2575.sms_api.models.errors.ErrorResponseModel;

import lombok.Data;

@Data
public class ResponseModel {
    private boolean valid;
    private ErrorResponseModel error;
    private Object response;
    
}

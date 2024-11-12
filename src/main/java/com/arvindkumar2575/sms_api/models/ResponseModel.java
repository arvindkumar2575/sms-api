package com.arvindkumar2575.sms_api.models;

import com.arvindkumar2575.sms_api.models.errors.ErrorModel;

import lombok.Data;

@Data
public class ResponseModel {
    private ErrorModel error;
    private Object response;
    
}

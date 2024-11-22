package com.arvindkumar2575.sms_api.models.errors;

import lombok.Data;

@Data
public class ErrorResponseModel {
    private Long status;
    private String message;
    private Object data;
}

package com.arvindkumar2575.sms_api.Constants;

import com.arvindkumar2575.sms_api.models.ResponseModel;
import com.google.gson.Gson;

public class CommonConstant {

    //  static values
    public static final String TEMPLATE_STRING = "Hello, %s!";
    public static final String[] GENDER = {"M","F","O"};

    //  static errors
    public static final ResponseModel DEFAULT_PAYLOAD_ERROR_JSON = new Gson().fromJson("{'error':{'status':404,'message':'Error in payload!'}}",ResponseModel.class);
    
}

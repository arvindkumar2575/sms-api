package com.arvindkumar2575.sms_api.models;

import lombok.Data;

@Data
public class SchoolSetupModel {
    private SchoolModel school;
    private UserModel admin;
}

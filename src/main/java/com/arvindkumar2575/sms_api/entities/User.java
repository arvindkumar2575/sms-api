package com.arvindkumar2575.sms_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private Long school_id;
    private Long user_type;
    private Long gender_id;
    private String username;
    private String password;
    private String verification_code;
    private boolean verified;
    private boolean status;
    private String first_name;
    private String last_name;
    private String created_at;
    private String modified_at;
    private String deleted_at;
}

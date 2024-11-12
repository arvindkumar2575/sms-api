package com.arvindkumar2575.sms_api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class School {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean verified;
    private boolean status;
    private String created_at;
    private String modified_at;
    private String deleted_at;

}

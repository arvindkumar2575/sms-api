package com.arvindkumar2575.sms_api.entities;


import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.stereotype.Indexed;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_users", indexes = {
    @Index(name = "school_id", columnList = "school_id"),
    @Index(name = "user_type", columnList = "user_type"),
    @Index(name = "gender_id", columnList = "gender_id"),
    @Index(name = "first_name", columnList = "first_name"),
    @Index(name = "last_name", columnList = "last_name")
})
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Date created_at;
    @Column(nullable = false, updatable = true)
    @CurrentTimestamp
    private Date modified_at;
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted_at;
}

package com.arvindkumar2575.sms_api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arvindkumar2575.sms_api.entities.User;

@Repository
public interface UserRespository extends CrudRepository<User, Long> {
    
}

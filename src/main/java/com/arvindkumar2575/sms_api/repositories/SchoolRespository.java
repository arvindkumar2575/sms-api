package com.arvindkumar2575.sms_api.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arvindkumar2575.sms_api.entities.School;

@Repository
public interface SchoolRespository extends CrudRepository<School, Long> {
    
}

package com.nouari.orm_jpa_hibernate_spring_data.repository;

import com.nouari.orm_jpa_hibernate_spring_data.base.BaseRepo;
import com.nouari.orm_jpa_hibernate_spring_data.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRep extends BaseRepo<Patient, Long> {

}

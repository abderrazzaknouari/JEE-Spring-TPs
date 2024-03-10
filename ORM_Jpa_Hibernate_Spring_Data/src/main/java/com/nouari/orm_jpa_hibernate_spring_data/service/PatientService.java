package com.nouari.orm_jpa_hibernate_spring_data.service;

import com.nouari.orm_jpa_hibernate_spring_data.base.BaseService;
import com.nouari.orm_jpa_hibernate_spring_data.model.Patient;
import com.nouari.orm_jpa_hibernate_spring_data.repository.PatientRep;
import org.springframework.stereotype.Service;


@Service
public class PatientService extends BaseService<PatientRep,Patient,Long> {

}

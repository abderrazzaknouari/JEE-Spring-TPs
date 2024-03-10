package com.nouari.orm_jpa_hibernate_spring_data.data;

import com.nouari.orm_jpa_hibernate_spring_data.model.Patient;
import com.nouari.orm_jpa_hibernate_spring_data.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class Data implements CommandLineRunner {
    @Autowired
    private PatientService patientService;

    @Override
    @Transactional()
    public void run(String... args) throws Exception {
        for (int i = 0; i < 10; i++) {
            String index = String.valueOf(i);
            Patient patient = new Patient();
            patient.setId(i);
            patient.setNom("Patient " + index);
            patient.setDateNaissance("2000-01-01");
            patient.setMalade(i % 2 == 0);
            patient.setScore(i * 10);
            patientService.save(patient);
        }
    }
}

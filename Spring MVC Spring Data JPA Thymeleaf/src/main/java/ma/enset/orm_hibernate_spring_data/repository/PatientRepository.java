package ma.enset.orm_hibernate_spring_data.repository;

import ma.enset.orm_hibernate_spring_data.dto.PatientDTO;
import ma.enset.orm_hibernate_spring_data.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends IRepository<Patient, Long> {
    Page<Patient> findPatientByNameContainsIgnoreCase(String name, Pageable pageable);

}

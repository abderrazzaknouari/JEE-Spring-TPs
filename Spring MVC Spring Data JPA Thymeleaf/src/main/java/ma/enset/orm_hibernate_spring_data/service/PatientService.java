package ma.enset.orm_hibernate_spring_data.service;

import jakarta.transaction.Transactional;
import ma.enset.orm_hibernate_spring_data.dto.PatientDTO;
import ma.enset.orm_hibernate_spring_data.entities.Patient;
import ma.enset.orm_hibernate_spring_data.mappers.PatientMapper;
import ma.enset.orm_hibernate_spring_data.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
@Transactional
public class PatientService implements IPatientService{
    private PatientRepository patientRepository;
    private PatientMapper patientMapper;
    public PatientService(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    @Override
    public void add(PatientDTO patient) {
        patientRepository.save(patientMapper.toPatient(patient));
    }
    //Retrieving patients by name
    public Page<PatientDTO> getPatients(String keyword, Pageable pageable) {
        return patientMapper.toPatientDTOs(patientRepository.findPatientByNameContainsIgnoreCase(keyword, pageable));
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public PatientDTO editPatient(Long id, String name, int score, Date birthDay, boolean sick) {
        Patient patient = patientRepository.findById(id).get();
        patient.setName(name);
        patient.setScore(score);
        patient.setBirthDay(birthDay);
        patient.setSick(sick);
        return patientMapper.toPatientDTO(patientRepository.save(patient));
    }

    public PatientDTO getPatient(Long id) {
        return patientMapper.toPatientDTO(patientRepository.findById(id).get());
    }
}

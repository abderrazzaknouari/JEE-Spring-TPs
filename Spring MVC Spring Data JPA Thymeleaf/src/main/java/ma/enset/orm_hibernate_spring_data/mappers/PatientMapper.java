package ma.enset.orm_hibernate_spring_data.mappers;

import ma.enset.orm_hibernate_spring_data.dto.PatientDTO;
import ma.enset.orm_hibernate_spring_data.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientMapper {
    public PatientDTO toPatientDTO(Patient patient) {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(patient.getId());
        patientDTO.setName(patient.getName());
        patientDTO.setBirthDay(patient.getBirthDay());
        patientDTO.setSick(patient.isSick());
        patientDTO.setScore(patient.getScore());
        return patientDTO;
    }
    public Patient toPatient(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setId(patientDTO.getId());
        patient.setName(patientDTO.getName());
        patient.setBirthDay(patientDTO.getBirthDay());
        patient.setSick(patientDTO.isSick());
        patient.setScore(patientDTO.getScore());
        return patient;
    }
    public List<PatientDTO> toPatientDTOs(List<Patient> patients) {
        return patients.stream().map(this::toPatientDTO).toList();
    }
    public List<Patient> toPatients(List<PatientDTO> patientDTOs) {
        return patientDTOs.stream().map(this::toPatient).toList();
    }
    public Page<PatientDTO> toPatientDTOs(Page<Patient> patients) {
        return patients.map(this::toPatientDTO);
    }
}

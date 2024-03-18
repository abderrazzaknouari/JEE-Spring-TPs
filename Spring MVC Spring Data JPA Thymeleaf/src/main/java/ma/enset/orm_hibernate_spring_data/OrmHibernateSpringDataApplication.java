package ma.enset.orm_hibernate_spring_data;

import ma.enset.orm_hibernate_spring_data.entities.Medecin;
import ma.enset.orm_hibernate_spring_data.entities.Patient;
import ma.enset.orm_hibernate_spring_data.repository.MedecinRepository;
import ma.enset.orm_hibernate_spring_data.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class OrmHibernateSpringDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrmHibernateSpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository, MedecinRepository medecinRepository){
        return args -> {
            //Adding A list of patients
            Stream.of("Abdellatif", "Hassani", "Abdeslam", "Hassan", "Abdellah", "Achraf").forEach(name -> {
                Patient patient = new Patient();
                patient.setName(name);
                patient.setBirthDay(new Date());
                patient.setSick(Math.random() > 0.5);
                patient.setScore((int) (Math.random()*10));
                patientRepository.save(patient);
            });
            //Adding A list of medecins
            Stream.of("Alami", "Tazi", "ELfizazi").forEach(name -> {
                Medecin medecin = new Medecin();
                medecin.setName(name);
                medecin.setEmail("medecin."+name+"@gmail.com");
                medecin.setSpeciality(Math.random() > 0.5? "Dentist" : "Generalist");
                medecinRepository.save(medecin);
            });
            //Getting list of patients and looping throw them
            List<Patient> patients = patientRepository.findAll();
            patients.forEach(p -> System.out.println(p.getName()+" "+p.getBirthDay()));
            System.out.println("+++++++++++++");
            //Searching for a patients by name

        };
    }

}

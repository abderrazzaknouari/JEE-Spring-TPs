package ma.enset.orm_hibernate_spring_data.repository;

import ma.enset.orm_hibernate_spring_data.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long>{

}

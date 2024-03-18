package ma.enset.orm_hibernate_spring_data.repository;

import ma.enset.orm_hibernate_spring_data.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends IRepository<Medecin, Long> {

}

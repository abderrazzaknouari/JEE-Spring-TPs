package ma.enset.orm_hibernate_spring_data.repository;

import ma.enset.orm_hibernate_spring_data.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface IRepository<T, U> extends JpaRepository<T, U> {

    @Query("select p from #{#entityName} p where p.name like :x")
    List<T> search(@Param("x") String keyword);
}

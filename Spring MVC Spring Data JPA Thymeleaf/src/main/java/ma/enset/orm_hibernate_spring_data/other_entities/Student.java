package ma.enset.orm_hibernate_spring_data.other_entities;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jdk.jfr.Enabled;
import lombok.*;

@Enabled
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
public class Student extends Person{
    private Double note;
}

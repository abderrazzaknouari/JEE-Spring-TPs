package ma.enset.orm_hibernate_spring_data.other_entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@DiscriminatorValue("person")
public class Person {
    @Id @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String birthDay;
}

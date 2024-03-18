package ma.enset.orm_hibernate_spring_data.dto;

import lombok.*;
import java.util.Date;

@AllArgsConstructor  @NoArgsConstructor @Setter @Getter
public class PatientDTO {
    private Long id;
    private String name;
    private Date birthDay;
    private boolean sick;
    private int score;
}

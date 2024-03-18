package ma.enset.orm_hibernate_spring_data.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@AllArgsConstructor  @NoArgsConstructor @Getter @Setter
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @Enumerated(EnumType.STRING)
    private RDVStatus status;
    @ManyToOne
    private Medecin medecin;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Patient patient;
    @OneToOne(mappedBy = "rendezVous", fetch = FetchType.LAZY)
    private Consultation consultation;
}

package com.nouari.orm_jpa_hibernate_spring_data.model;

import com.nouari.orm_jpa_hibernate_spring_data.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient extends BaseEntity{
    private String nom;
    private String dateNaissance;
    private Boolean malade;
    private Integer score;
}

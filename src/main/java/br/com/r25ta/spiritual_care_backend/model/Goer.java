package br.com.r25ta.spiritual_care_backend.model;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "goer")
@Data
public class Goer {
    @Id
    @UuidGenerator
    @JsonProperty("_id")
    private UUID id;
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "phone", length = 20)
    private String phone;
    
    @Column(name = "born", nullable = false)
    private LocalDate born;

}

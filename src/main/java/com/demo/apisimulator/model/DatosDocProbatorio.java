package com.demo.apisimulator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DatosDocProbatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String anioReg;
    private String claveEntidadRegistro;
    private String entidadRegistro;
    private String tomo;
    private String foja;
    private String numActa;
    private String libro;
    private String claveMunicipioRegistro;
    private String municipioRegistro;

    @OneToOne
    @JoinColumn(name = "catch_entity_id", unique = true)
    @JsonBackReference
    private CatchEntity catchEntity;
}
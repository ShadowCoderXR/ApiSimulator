package com.demo.apisimulator.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String estatus;
    private String codigoValidacion;
    @Column(unique = true)
    private String curp;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String fechaNacimiento;
    private String paisNacimiento;
    private String estadoNacimiento;
    private int docProbatorio;
    private String estatusCurp;
    private String estatusCurpDesc;
    private String documento;
    private String claveMensaje;

    @OneToOne(mappedBy = "catchEntity", cascade = CascadeType.ALL)
    @JsonManagedReference
    private DatosDocProbatorio datosDocProbatorio;


}
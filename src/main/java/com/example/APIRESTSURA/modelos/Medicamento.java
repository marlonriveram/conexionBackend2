package com.example.APIRESTSURA.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Spliterator;

@Entity
@Table(name = "Medicamentos")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraindicaiones;
    private String resgistroInvima;
    private String tieneCopago;

    // relacion hacia paciente
    @ManyToOne
    @JoinColumn(name = "fk_paciente",referencedColumnName = "id")
    @JsonBackReference
    private Pacientes paciente;

    public Medicamento() {
    }

    public Medicamento(Long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCaducidad, String contraindicaiones, String resgistroInvima, String tieneCopago) {
        this.id = id;
        this.nombre = nombre; // soldo debe tener letra y maximo 60 carateres
        this.presentacion = presentacion;
        this.dosis = dosis;
        this.laboratorio = laboratorio; // maximo 60 caracteres
        this.fechaCaducidad = fechaCaducidad; // debe ser mayor al año actual
        this.contraindicaiones = contraindicaiones;
        this.resgistroInvima = resgistroInvima;
        this.tieneCopago = tieneCopago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public Double getDosis() {
        return dosis;
    }

    public void setDosis(Double dosis) {
        this.dosis = dosis;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getContraindicaiones() {
        return contraindicaiones;
    }

    public void setContraindicaiones(String contraindicaiones) {
        this.contraindicaiones = contraindicaiones;
    }

    public String getResgistroInvima() {
        return resgistroInvima;
    }

    public void setResgistroInvima(String resgistroInvima) {
        this.resgistroInvima = resgistroInvima;
    }

    public String getTieneCopago() {
        return tieneCopago;
    }

    public void setTieneCopago(String tieneCopago) {
        this.tieneCopago = tieneCopago;
    }
}

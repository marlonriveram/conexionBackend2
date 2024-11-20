package com.example.APIRESTSURA.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "SignosVitales")
public class SignoVital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // maximo 50 caracteres y solo letra
    private String valor; // mayor a cero y no numeros negativos
    private LocalDate fechaMedida; // no debe ser mayor a 1920


    // relacion con pacinete
    @ManyToOne
    @JoinColumn(name = "fk_paciente",referencedColumnName = "id")
    @JsonBackReference
    private Pacientes paciente;
    public SignoVital() {
    }

    public SignoVital(Long id, String nombre, String valor, LocalDate fechaMedida) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.fechaMedida = fechaMedida;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public LocalDate getFechaMedida() {
        return fechaMedida;
    }

    public void setFechaMedida(LocalDate fechaMedida) {
        this.fechaMedida = fechaMedida;
    }
}

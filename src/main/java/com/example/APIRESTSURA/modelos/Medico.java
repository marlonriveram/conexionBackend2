package com.example.APIRESTSURA.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import javax.swing.text.StyledEditorKit;
import java.util.List;

@Entity
@Table(name = "Medicos")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre; // 50 caracteres solo letras
    private String matricula; // 20 caracteres
    private String especialidad; // 50 caracteres
    private Integer salario; // No puede ser negativo min 8millones max 30 millones
    private String ips; // 50 caracteres
    private String correo; // Formato @sura.com.co
    private String telefono; // 10 caracteres
    private String direccion; //100 caracteres
    private Boolean estadisponibleFinDeSemana;

    @OneToMany(mappedBy = "medico")
    @JsonManagedReference
    private List<Pacientes> paciente;

    public Medico() {
    }

    public Medico(Long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean estadisponibleFinDeSemana) {
        this.id = id;
        this.nombre = nombre;
        this.matricula = matricula;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadisponibleFinDeSemana = estadisponibleFinDeSemana;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstadisponibleFinDeSemana() {
        return estadisponibleFinDeSemana;
    }

    public void setEstadisponibleFinDeSemana(Boolean estadisponibleFinDeSemana) {
        this.estadisponibleFinDeSemana = estadisponibleFinDeSemana;
    }
}

package com.example.APIRESTSURA.repositorios;

import com.example.APIRESTSURA.modelos.Pacientes;
import com.example.APIRESTSURA.servicios.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

// JpaRepository es el convertidor de java a sql y viceversa
// se extiende JpaRepository <la tabla a la que vamosa usar,tipo de dato del id de la tabla
@Repository  // servicios son los que se encargan de hacer los consultas
public interface IRepositorioPaciente extends JpaRepository<Pacientes,Long> {
}

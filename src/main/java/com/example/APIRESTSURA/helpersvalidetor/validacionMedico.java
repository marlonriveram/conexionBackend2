package com.example.APIRESTSURA.helpersvalidetor;

import com.example.APIRESTSURA.Utilis;
import com.example.APIRESTSURA.modelos.Medico;
import com.example.APIRESTSURA.modelos.Pacientes;
import jakarta.persistence.criteria.CriteriaBuilder;

public class validacionMedico {
    //Inyeccion de dependencias llamar una clase dentro de otra
    Medico medico = new Medico();

    public Boolean validarNombre (String nombre){
        return Utilis.validarNumCaracteres(nombre,50);
    }

    public Boolean validarMatricula (String matricula){
        return Utilis.validarNumCaracteres(matricula,20);
    }

    public Boolean validarEspecialidad (String especialidad){
        return Utilis.validarNumCaracteres(especialidad,50);
    }

    public Boolean validarSalario(Integer salario){
        return salario >= 8000000 && salario <= 30000000;
    }

    public Boolean validarIps (String ips){
        return Utilis.validarNumCaracteres(ips,50);
    }

    public Boolean validarCorreo (String correo){
        return Utilis.validarRegex("^[a-zA-Z0-9._%+-]+@sura\\.com\\.co$",correo);
    }

    public Boolean validarTelefono (String telefono){
        return Utilis.validarNumCaracteres(telefono,10);
    }

    public Boolean validarDireccion (String direccion){
        return Utilis.validarNumCaracteres(direccion,100);
    }
}

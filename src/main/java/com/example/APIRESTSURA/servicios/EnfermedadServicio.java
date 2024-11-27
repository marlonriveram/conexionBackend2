package com.example.APIRESTSURA.servicios;

import com.example.APIRESTSURA.modelos.Enfermedad;
import com.example.APIRESTSURA.repositorios.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermedadServicio {
    // para usar un servico debo llamsr al repositorio

    // INYECCION DE UNA DEPENDENCIA
    @Autowired
    IRepositorioEnfermedad repositorioEnfermedad;

    //Listo las operaciones que voy a realizar en la base de datos

    // registrar un paciente
    public Enfermedad registrarEnfermedad (Enfermedad datosEnfermedad) throws Exception{
        try{
            // Guardar en bd los datos paciente
            return repositorioEnfermedad.save(datosEnfermedad);
        }catch (Exception error){
            throw new Exception (error.getMessage());
        }
    }
    // buscar los Enfermedades
    public List<Enfermedad> buscarEnfermedades() throws  Exception{
        try {
            return repositorioEnfermedad.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    // buscar un paciente por id
}

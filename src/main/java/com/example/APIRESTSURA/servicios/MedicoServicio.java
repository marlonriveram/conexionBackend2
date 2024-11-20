package com.example.APIRESTSURA.servicios;

import com.example.APIRESTSURA.modelos.Medico;
import com.example.APIRESTSURA.repositorios.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {
    @Autowired // Permite instanciar clases sin tiener que hacer lo de new
    IRepositorioMedico iRepositorioMedico;
    // para usar un servico debo llamsr al repositorio

    // INYECCION DE UNA DEPENDENCIA

    IRepositorioMedico repositorioMedico;

    //Listo las operaciones que voy a realizar en la base de datos

    // registrar un paciente
    public Medico registrarMedico (Medico datosMedico)throws Exception{
        try{
            // Guardar en bd los datos paciente
            return iRepositorioMedico.save(datosMedico);
        }catch (Exception error){
            throw new Exception (error.getMessage());
        }
    }
    // buscar los Medico
    public List<Medico> buscarMedico() throws  Exception{
        try {
            return  iRepositorioMedico.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }
    // buscar un paciente por id

}

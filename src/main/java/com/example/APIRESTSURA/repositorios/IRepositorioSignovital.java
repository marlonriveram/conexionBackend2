package com.example.APIRESTSURA.repositorios;

import com.example.APIRESTSURA.modelos.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository es el convertidor de java a sql y viceversa
// se extiende JpaRepository <la tabla a la que vamosa usar,tipo de dato del id de la tabla
@Repository
public interface IRepositorioSignovital extends JpaRepository<SignoVital,Long> {
}

package com.example.APIRESTSURA.controllers;

import com.example.APIRESTSURA.modelos.Enfermedad;
import com.example.APIRESTSURA.servicios.EnfermedadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enfermedad")
public class EnfermedadControlador {
    @Autowired
    EnfermedadServicio enfermedadServicio;

    @PostMapping
    public ResponseEntity<?> guardar (@RequestBody Enfermedad dato){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(enfermedadServicio.registrarEnfermedad(dato));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> busdorTodo(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(enfermedadServicio.buscarEnfermedades());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}

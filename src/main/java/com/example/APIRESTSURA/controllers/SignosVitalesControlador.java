package com.example.APIRESTSURA.controllers;

import com.example.APIRESTSURA.modelos.SignoVital;
import com.example.APIRESTSURA.servicios.SignoVitalServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signosvitales")
public class SignosVitalesControlador {
    @Autowired
    SignoVitalServicio signoVitalServicio;

    @PostMapping
    public ResponseEntity<?> guardar(@RequestBody SignoVital dato){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(signoVitalServicio.registrarSignoVital(dato));
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }


    //buscarSignosVitales
    @GetMapping
    public ResponseEntity<?> busdorTodo(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(signoVitalServicio.buscarSignosVitales());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }
    }
}

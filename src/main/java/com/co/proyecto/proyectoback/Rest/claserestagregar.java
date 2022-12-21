package com.co.proyecto.proyectoback.Rest;

import com.co.proyecto.proyectoback.Model.ClaseModel;
import com.co.proyecto.proyectoback.Service.ClaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;


@RequestMapping
@RestController("/ClASE/")
public class claserestagregar {


        @Autowired
        private ClaseServices claseServices;


        @PostMapping("/Agregar informacion")
        private ResponseEntity<ClaseModel> saveClase(@RequestBody ClaseModel clasemodel) {

            try {
                ClaseModel claseGuardar = claseServices.save(clasemodel);
                return ResponseEntity.created(new URI("/Clase/" + claseGuardar.getId())).body(claseGuardar);

            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }
        }












package com.co.proyecto.proyectoback.Rest;

import com.co.proyecto.proyectoback.Model.ClaseModel;
import com.co.proyecto.proyectoback.Service.ClaseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RequestMapping
@RestController("CLASE MOSTRAR")
public class claseRestMostrar {


    @Autowired
    private ClaseServices claseServices;



    @GetMapping ("/Mostrar el Listado")
    private ResponseEntity<List<ClaseModel>> getAllClases (){
        return ResponseEntity.ok(claseServices.findAll());
    }


}

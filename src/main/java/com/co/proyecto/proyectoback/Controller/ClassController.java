package com.co.proyecto.proyectoback.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tags({ @Tag(name = "Mostrar", description = "API para el serivicio relacionado con las Clases") })
@CrossOrigin
@RestController("v1/api/Class")

public class ClassController {

    @Operation(summary = "SALONES DE CLASE",description = "API Relacionada con la gestion de salones de clase")
    @ApiResponses(value = { @ApiResponse(responseCode = "Mensaje", description = "Mostrar informacion", content = {
            @Content(mediaType = "application/json") }) })

    @GetMapping("/Mostrar Todo el listado")
    public String Informacion(){ return ("Informacion");
    }



}

package com.co.proyecto.proyectoback.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;


@Tags({ @Tag(name = "Usuarios", description = "API para el serivicio relacionado con usuarios") })
@CrossOrigin
@RestController ("v1/api/User")
public class UserController {


    @Operation(summary = "Mensaje", description = "Método que Muestra un mensaje de bienvenida ")
    @ApiResponses(value = { @ApiResponse(responseCode = "Mensaje", description = "hola", content = {
            @Content(mediaType = "application/json") }) })
    @GetMapping ("/hello")
    public String hola(){
        return ("Hola prueba");
    }

}

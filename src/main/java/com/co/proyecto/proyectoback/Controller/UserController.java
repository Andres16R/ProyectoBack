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


@Tags({ @Tag(name = "Clases", description = "API para el serivicio relacionado con las Clases") })
@CrossOrigin
@RestController ("v1/api/hola")
public class UserController {


    @Operation(summary = "Notificacion", description = "Método Que muestra la informacion Solicitada ")
    @ApiResponses(value = { @ApiResponse(responseCode = "Mensaje", description = "hola", content = {
            @Content(mediaType = "application/json") }) })
    @GetMapping ("/Notificacion de Prueba")
    public String prueba(){
        return ("Hola ester es un nuevo mensaje de prueba que estoy relizando");
    }

}

package com.co.proyecto.proyectoback.Controller;

import com.co.proyecto.proyectoback.Model.UserModel;
import com.co.proyecto.proyectoback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.util.List;


@Tags({ @Tag(name = "Usuarios", description = "API para el serivicio relacionado con usuarios") })
@CrossOrigin
@RestController ("v1/api/User")
public class UserController {

    @Autowired
    private UserService userService;

    @Operation(summary = "Mensaje", description = "Método que Muestra un mensaje de bienvenida ")
    @ApiResponses(value = { @ApiResponse(responseCode = "Mensaje", description = "hola", content = {
            @Content(mediaType = "application/json") }) })
    @GetMapping ("/hello")
    public String hola(){
        return ("Hola prueba");
    }


    @Operation(summary = "Guardar Usuario", description = "Método que guarda un usuario nuevo")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Objeto", content = {
            @Content(mediaType = "application/json", schema = @Schema(implementation = UserModel.class)) }) })
    @PostMapping ("/saveUser")
    public ResponseEntity<UserModel> saveNewUser(@RequestBody UserModel userModel){
       return new ResponseEntity<UserModel>(userService.saveUser(userModel), HttpStatus.CREATED);
    }

    @Operation(summary = "Mensaje", description = "Método que Muestra un mensaje de bienvenida ")
    @ApiResponses(value = { @ApiResponse(responseCode = "Mensaje", description = "hola", content = {
            @Content(mediaType = "application/json") }) })
    @GetMapping ("/findUsers")
    public ResponseEntity<List<UserModel>> findAllUsers() {
        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.ACCEPTED);
    }

    @Operation(summary = "Eliminar usuario", description = "Método que Elimina un usuario por ID")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Eliminado", content = {
            @Content(mediaType = "application/json") }) })
    @DeleteMapping ("/deleteUserById/{identificacion}")
    public String deleteUserById(@PathVariable String identificacion) {
        return (userService.deleteUser(identificacion));
    }
}

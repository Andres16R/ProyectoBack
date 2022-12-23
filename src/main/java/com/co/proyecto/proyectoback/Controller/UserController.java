package com.co.proyecto.proyectoback.Controller;

import com.co.proyecto.proyectoback.Model.UserModel;
import com.co.proyecto.proyectoback.Repository.UserRepository;
import com.co.proyecto.proyectoback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Tags({ @Tag(name = "Facultades", description = "API para el serivicio relacionado con facultades") })
@CrossOrigin
@RestController
@RequestMapping(value = "/Facultades")
public class UserController {

    //@Operation(summary = "Mensaje", description = "Método que Muestra un mensaje de bienvenida ")
    //@ApiResponses(value = { @ApiResponse(responseCode = "Mensaje", description = "hola", content = {
      //      @Content(mediaType = "application/json") }) })
    //@GetMapping ("/hello")
    //public String hola(){
     //   return ("Hola prueba");
    //}
    @Autowired
    UserService userService;
    @Autowired
    private UserRepository userRepository;

@PostMapping
public String AddFacultad(@RequestBody UserModel user)
{
    userService.SaveFacultad(user);
    return "Facultad Guardada Con Exito";
}
@GetMapping
public List<UserModel> ListFacultad()
{
    return userService.GetAllFacultad();
}
@GetMapping(path = "/{identificador}")
    public Optional<UserModel> ListFacultadID(@PathVariable("identificador")String identificador)
{
    return userService.GetByIdFacultad(identificador);
}

@DeleteMapping(path = "/{identificador}")
    public String DeleteFacultad(@PathVariable("identificador")String identificador)
{
    boolean ok = this.userService.DeleteByIdFacultad(identificador);
    if (ok){
    return "Se Elimino La Facultad" + identificador;
    } else {
        return "No Se Puedo Eliminar La Facultad" + identificador;
    }


}


}

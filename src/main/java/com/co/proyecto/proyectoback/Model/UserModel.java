package com.co.proyecto.proyectoback.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "USUARIOS")
public class UserModel {


    @Column (name= "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Id
    @Column (name = "IDENTIFICACION")
    private String identificacion;

    @Column (name = "ESTADO")
    private String estado;

    @Column (name = "NOMBRES")
    private String nombres;

    @Column (name = "APELLIDOS")
    private String apellidos;

    @Column (name = "ROL")
    private String rol;

}

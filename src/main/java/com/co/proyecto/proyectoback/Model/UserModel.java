package com.co.proyecto.proyectoback.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "USUARIOS")
public class UserModel {

    @Id
    @Column (name= "ID")
    private Integer id;

    @Column (name = "IDENTIDICACION")
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

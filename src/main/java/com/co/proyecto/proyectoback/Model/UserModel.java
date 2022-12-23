package com.co.proyecto.proyectoback.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "FACULTADES")
public class UserModel {


    @Id
    @GeneratedValue (generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column (name= "ID", updatable = false, nullable = false)
    private UUID id;
    @Column (name = "IDENTIFICADOR")
    private String identificador;

    @Column (name = "NOMBRE")
    private String nombre;

    @Column (name = "CARRERA")
    private String carrera;

    @Column (name = "SEDE")
    private String sede;

    @Column (name = "TELEFONO")
    private String telefono;

    @Column (name = "ALTA_ACREDITACION")
    private String alta_acreditacion;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlta_acreditacion() {
        return alta_acreditacion;
    }

    public void setAlta_acreditacion(String alta_acreditacion) {
        this.alta_acreditacion = alta_acreditacion;
    }


}

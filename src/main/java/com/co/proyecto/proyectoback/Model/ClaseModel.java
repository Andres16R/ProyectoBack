package com.co.proyecto.proyectoback.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import lombok.Getter;
import lombok.Setter;




import javax.persistence.*;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "public", name = "CLASES")
@Getter
@Setter

public class ClaseModel {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(

            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "UNIC", updatable = false, nullable = false)
    private UUID unic;


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "SALON")
    private int Salon;
    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "JORNADA")
    private String jornada;

    @Column(name = "AFORO")
    private String aforo;

    public ClaseModel(int salon, String nombre, String jornada, String aforo) {
        Salon = salon;
        this.nombre = nombre;
        this.jornada = jornada;
        this.aforo = aforo;
    }

}

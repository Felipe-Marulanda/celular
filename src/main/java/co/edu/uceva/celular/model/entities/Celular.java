package co.edu.uceva.celular.model.entities;

/**
 * ORM: Object Relational Mapping
 * JPA: Java Persistence API (Especificación) -> Hibernate, EclipseLink, TopLink, OpenJPA, DataNucleus
 */


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * La clase Pais es una entidad que se mapea con la tabla pais en la base de datos.
 */

@Data
@Entity
public class Celular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private int memoria;
}

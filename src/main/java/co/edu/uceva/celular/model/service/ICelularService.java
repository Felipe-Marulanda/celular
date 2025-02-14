package co.edu.uceva.celular.model.service;

import co.edu.uceva.celular.model.entities.Celular;

import java.util.List;

public interface ICelularService {
    List<Celular> listar();
    void delete(Celular celular); //Elimina un pais de la base de datos
    Celular save(Celular celular); //Guarda un pais y me retorna un objeto de tipo Pais
    Celular findById(Long id); //Busca un pais por su id y me retorna un objeto de tipo Pais
    Celular update(Celular celular); //Actualiza un pais y me retorna un objeto de tipo Pais
}

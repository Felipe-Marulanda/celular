package co.edu.uceva.celular.model.dao;

// DAO: Data Access Object: Manejar las operaciones CRUD de la entidad

import co.edu.uceva.celular.model.entities.Celular;
import org.springframework.data.repository.CrudRepository;

/**
 * Esta interfaz hereda de CrudRepository y se encarga de realizar las operaciones CRUD de la entidad Pais
 */

public interface CelularDao extends CrudRepository<Celular, Long> {
}

package co.edu.uceva.celular.model.service;

import co.edu.uceva.celular.model.dao.CelularDao;
import co.edu.uceva.celular.model.entities.Celular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Esta interfaz define los metodos que se van a implementar en la clase PaisServiceImpl
 */
@Service
public class CelularServiceImpl implements ICelularService {

    @Autowired
    CelularDao celularDao;

    /**
     * Este metodo se encarga de listar los paises
     * @return retorna una lista de paises
     */
    @Override
    public List<Celular> listar(){
    return (List<Celular>) celularDao.findAll();
    }

    /**
     * Este metodo se encarga de eliminar un pais
     * @param celular pais a eliminar
     */
    @Override
    public void delete(Celular celular) {
        celularDao.delete(celular);
    }

    /**
     * Este metodo se encarga de guardar un pais
     * @param celular pais a guardar
     * @return retorna el objeto pais guardado incluyendo el id
     */
    @Override
    public Celular save(Celular celular) {
        return celularDao.save(celular);
    }

    /**
     * Este metodo se encarga de buscar un pais por su id
     * @param id id del pais a buscar
     * @return retorna un pais por su id
     */
    @Override
    public Celular findById(Long id) {
        return celularDao.findById(id).orElse(null);
    }

    /**
     * Este metodo se encarga de actualizar un pais
     * @param celular pais a actualizar
     * @return retorna el objeto pais actualizado
     */
    @Override
    public Celular update(Celular celular) {
        return celularDao.save(celular);
    }

}

package co.edu.uceva.celular.controller;

import co.edu.uceva.celular.model.entities.Celular;
import co.edu.uceva.celular.model.service.CelularServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/Celular")
public class CelularRestController {

    @Autowired
    private CelularServiceImpl celularService;

    /**
     * Este metodo se encarga de retornar una lista de todos los paises
     * @return retorna una lista de todos los paises
     */
    @GetMapping("celulares")
    public List<Celular> listar() {
        return this.celularService.listar();
    }

    /**
     * Este metodo se encarga de retornar un pais por su id y se mapea con la url /api/pais-service/celulares/{id}
     * @param id es el id del pais a buscar
     * @return retorna un pais por su id
     */
    @GetMapping("/celulares/{id}")
    public Celular buscarCelular(@PathVariable Long id) {
        return this.celularService.findById(id);
    }

    /**
     * Este metodo guarda un pais y me retorna el objeto de tipo Pais ya guardado con su id asignado
     * @param celular es el objeto de tipo Pais a guardar (sin el id)
     * @return retorna el objeto de tipo Pais guardado con su id asignado
     */
    @PostMapping("/celular")
    public Celular guardarCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este metodo actualiza un pais y me retorna el objeto de tipo Pais ya actualizado
     * @param celular es el objeto de tipo Pais a actualizar (con el id)
     * @return retorna el objeto de tipo Pais actualizado
     */
    @PutMapping("/celular")
    public Celular actializaCelular(@RequestBody Celular celular) {
        return this.celularService.save(celular);
    }

    /**
     * Este metodo elimina un pais por su id
     * @param id es el id del pais a eliminar
     */
    @DeleteMapping("/celulares/{id}")
    public void eliminarCelular(@PathVariable Long id) {
        Celular celular = this.celularService.findById(id); // Encuentro un pais por su id
        this.celularService.delete(celular);
    }
}

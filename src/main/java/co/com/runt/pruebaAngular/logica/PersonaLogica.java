package co.com.runt.pruebaAngular.logica;

import java.util.List;
import java.util.Date;
import javax.ejb.EJB;
import co.com.runt.pruebaAngular.persistencia.entidad.Persona;
import co.com.runt.pruebaAngular.persistencia.dao.PersonaDAO;
import co.com.runt.pruebaAngular.dto.PersonaDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class PersonaLogica {

    @EJB
    private PersonaDAO persistencia;

    /**
     * Retorna una lista con los Persona que se encuentran en la base de datos.
     * @return lista de Persona
     * @generated
     */
    public List<Persona> obtenerTodos(){
    	return persistencia.obtenerTodos();
    }
    
    /**
     * Obtiene Persona dado su identificador. 	
     * @param id identificador del elemento Persona
     * @return Persona del id dado
     * @generated
     */
    public Persona obtener(Long id){
    	return persistencia.obtener(id);
    }
    
    /**
     * Almacena la informacion de Persona
     * @param entidad Persona a guardar
     * @return Persona con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Persona guardar(Persona entidad){
    	return persistencia.guardar(entidad);
    }
    
    /**
     * Actualiza la informacion de Persona.
     * @param entidad Persona a actualizar
     * @generated
     */
    public void actualizar(Persona entidad){
    	persistencia.actualizar(entidad);
    }
    
    /**
     * Elimina el registro Persona con el identificador dado.
     * @param id identificador del Persona
     * @generated 
     */
    public void borrar(Long id){
    	persistencia.borrar(id);
    }
	
}

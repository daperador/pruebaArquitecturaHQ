package co.com.runt.pruebaAngular.servicios;

import java.util.List;
import java.util.Date;
import javax.ejb.EJB;
import co.com.runt.pruebaAngular.logica.PersonaLogica;
import co.com.runt.pruebaAngular.dto.PersonaDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class PersonaLogica {

    @EJB
    private PersonaLogica logica;

    /**
     * Retorna una lista con los Persona que se encuentran en la base de datos.
     * @return lista de Persona
     * @generated
     */
    public List<PersonaDTO> obtenerTodos(){
    	return logcia.obtenerTodos();
    }
    
    /**
     * Obtiene Persona dado su identificador. 	
     * @param id identificador del elemento Persona
     * @return Persona del id dado
     * @generated
     */
    public PersonaDTO obtener(Long id){
    	return logica.obtener(id);
    }
    
    /**
     * Almacena la informacion de Persona
     * @param entidad Persona a guardar
     * @return Persona con los cambios realizados por el proceso de guardar
     * @generated
     */
    public PersonaDTO guardar(PersonaDTO dto){
    	return logica.guardar(dto);
    }
    
    /**
     * Actualiza la informacion de Persona.
     * @param entidad Persona a actualizar
     * @generated
     */
    public void actualizar(PersonaDTO dto){
    	logica.actualizar(dto);
    }
    
    /**
     * Elimina el registro Persona con el identificador dado.
     * @param id identificador del Persona
     * @generated 
     */
    public void borrar(Long id){
    	logica.borrar(id);
    }
	
}

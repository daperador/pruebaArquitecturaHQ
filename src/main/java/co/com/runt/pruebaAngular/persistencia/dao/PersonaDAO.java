package co.com.runt.pruebaAngular.persistencia.dao;

import java.util.List;
import java.util.Date;
import javax.persistence.*;
import javax.ejb.Stateless;
import co.com.runt.pruebaAngular.persistencia.entidad.Persona;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class PersonaDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna una lista con los Persona que se encuentran en la base de datos.
     * @return lista de Persona
     * @generated
     */
    public List<Persona> obtenerTodos(){
    	return em.createNamedQuery("Persona.obtenerTodos").getResultList();
    }
    
    /**
     * Obtiene Persona dado su identificador. 	
     * @param id identificador del elemento Persona
     * @return Persona del id dado
     * @generated
     */
    public Persona obtener(Long id){
    	return em.find(Persona.class, id);
    }
    
    /**
     * Almacena la informacion de Persona
     * @param entidad Persona a guardar
     * @return Persona con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Persona guardar(Persona entidad){
    	em.persist(entidad);
    	return entidad;
    }
    
    /**
     * Actualiza la informacion de Persona.
     * @param entidad Persona a actualizar
     * @generated
     */
    public void actualizar(Persona entidad){
    	em.merge(entidad);
    }
    
    /**
     * Elimina el registro Persona con el identificador dado.
     * @param id identificador del Persona
     * @generated 
     */
    public void borrar(Long id){
    	em.find(Persona.class, id).setEsActivo(false);
    }
	
}

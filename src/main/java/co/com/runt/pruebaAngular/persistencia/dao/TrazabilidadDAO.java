package co.com.runt.pruebaAngular.persistencia.dao;

import java.util.Date;
import javax.persistence.*;
import javax.ejb.Stateless;
import co.com.runt.pruebaAngular.persistencia.entidad.Trazabilidad;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless
@stateless 
public class TrazabilidadDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna una lista con los Trazabilidad que se encuentran en la base de datos.
     * @return lista de Trazabilidad
     * @generated
     */
    public List<Trazabilidad> obtenerTodos(){
    	return em.createNamedQuery("Trazabilidad.obtenerTodos").getResultList();
    }
    
    /**
     * Obtiene Trazabilidad dado su identificador. 	
     * @param id identificador del elemento Trazabilidad
     * @return Trazabilidad del id dado
     * @generated
     */
    public Trazabilidad obtener(Long id){
    	return em.find(Trazabilidad.class, id);
    }
    
    /**
     * Almacena la informacion de Trazabilidad
     * @param entidad Trazabilidad a guardar
     * @return Trazabilidad con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Trazabilidad guardar(Trazabilidad entidad){
    	em.persist(entidad);
    	return entidad;
    }
    
    /**
     * Actualiza la informacion de Trazabilidad.
     * @param entidad Trazabilidad a actualizar
     * @generated
     */
    public void actualizar(Trazabilidad entidad){
    	em.merge(entidad);
    }
    
    /**
     * Elimina el registro Trazabilidad con el identificador dado.
     * @param id identificador del Trazabilidad
     * @generated 
     */
    public void borrar(Long id){
    	em.find(Trazabilidad.class, id).setEsActivo(false);
    }
	
}

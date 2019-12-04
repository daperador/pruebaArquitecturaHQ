package co.com.runt.pruebaAngular.persistencia.dao;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;
import co.com.runt.pruebaAngular.persistencia.entidad.Aplicacion;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@stateless 
public class AplicacionDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna una lista con los Aplicacion que se encuentran en la base de datos.
     * @return lista de Aplicacion
     * @generated
     */
    public List<Aplicacion> obtenerTodos(){
    	return em.createNamedQuery("Aplicacion.obtenerTodos").getResultList();
    }
    
    /**
     * Obtiene Aplicacion dado su identificador. 	
     * @param id identificador del elemento Aplicacion
     * @return Aplicacion del id dado
     * @generated
     */
    public Aplicacion obtener(Long id){
    	return em.find(Aplicacion.class, id);
    }
    
    /**
     * Almacena la informacion de Aplicacion
     * @param entidad Aplicacion a guardar
     * @return Aplicacion con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Aplicacion guardar(Aplicacion entidad){
    	em.persist(entidad);
    	return entidad;
    }
    
    /**
     * Actualiza la informacion de Aplicacion.
     * @param entidad Aplicacion a actualizar
     * @generated
     */
    public void actualizar(Aplicacion entidad){
    	em.merge(entidad);
    }
    
    /**
     * Elimina el registro Aplicacion con el identificador dado.
     * @param id identificador del Aplicacion
     * @generated 
     */
    public void borrar(Long id){
    	em.find(Aplicacion.class, id).setEstado(false);
    }
	
}

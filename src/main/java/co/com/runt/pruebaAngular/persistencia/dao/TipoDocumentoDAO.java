package co.com.runt.pruebaAngular.persistencia.dao;

import javax.persistence.*;
import javax.ejb.Stateless;
import co.com.runt.pruebaAngular.persistencia.entidad.TipoDocumento;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless
@stateless 
public class TipoDocumentoDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * Retorna una lista con los TipoDocumento que se encuentran en la base de datos.
     * @return lista de TipoDocumento
     * @generated
     */
    public List<TipoDocumento> obtenerTodos(){
    	return em.createNamedQuery("TipoDocumento.obtenerTodos").getResultList();
    }
    
    /**
     * Obtiene TipoDocumento dado su identificador. 	
     * @param id identificador del elemento TipoDocumento
     * @return TipoDocumento del id dado
     * @generated
     */
    public TipoDocumento obtener(Long id){
    	return em.find(TipoDocumento.class, id);
    }
    
    /**
     * Almacena la informacion de TipoDocumento
     * @param entidad TipoDocumento a guardar
     * @return TipoDocumento con los cambios realizados por el proceso de guardar
     * @generated
     */
    public TipoDocumento guardar(TipoDocumento entidad){
    	em.persist(entidad);
    	return entidad;
    }
    
    /**
     * Actualiza la informacion de TipoDocumento.
     * @param entidad TipoDocumento a actualizar
     * @generated
     */
    public void actualizar(TipoDocumento entidad){
    	em.merge(entidad);
    }
    
    /**
     * Elimina el registro TipoDocumento con el identificador dado.
     * @param id identificador del TipoDocumento
     * @generated 
     */
    public void borrar(Long id){
    	em.find(TipoDocumento.class, id).setEstado(false);
    }
	
}

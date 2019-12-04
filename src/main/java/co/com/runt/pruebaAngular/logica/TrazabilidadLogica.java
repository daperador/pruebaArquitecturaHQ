package co.com.runt.pruebaAngular.logica;

import java.util.Date;
import javax.ejb.EJB;
import co.com.runt.pruebaAngular.persistencia.entidad.Trazabilidad;
import co.com.runt.pruebaAngular.persistencia.dao.TrazabilidadDAO;
import co.com.runt.pruebaAngular.dto.TrazabilidadDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class TrazabilidadLogica {

    @EJB
    private TrazabilidadDAO persistencia;

    /**
     * Retorna una lista con los Trazabilidad que se encuentran en la base de datos.
     * @return lista de Trazabilidad
     * @generated
     */
    public List<Trazabilidad> obtenerTodos(){
    	return persistencia.obtenerTodos();
    }
    
    /**
     * Obtiene Trazabilidad dado su identificador. 	
     * @param id identificador del elemento Trazabilidad
     * @return Trazabilidad del id dado
     * @generated
     */
    public Trazabilidad obtener(Long id){
    	return persistencia.obtener(id);
    }
    
    /**
     * Almacena la informacion de Trazabilidad
     * @param entidad Trazabilidad a guardar
     * @return Trazabilidad con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Trazabilidad guardar(Trazabilidad entidad){
    	return persistencia.guardar(entidad);
    }
    
    /**
     * Actualiza la informacion de Trazabilidad.
     * @param entidad Trazabilidad a actualizar
     * @generated
     */
    public void actualizar(Trazabilidad entidad){
    	persistencia.actualizar(entidad);
    }
    
    /**
     * Elimina el registro Trazabilidad con el identificador dado.
     * @param id identificador del Trazabilidad
     * @generated 
     */
    public void borrar(Long id){
    	persistencia.borrar(id);
    }
	
}

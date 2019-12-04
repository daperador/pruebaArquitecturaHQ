package co.com.runt.pruebaAngular.logica;

import java.util.List;
import javax.ejb.EJB;
import co.com.runt.pruebaAngular.persistencia.entidad.Aplicacion;
import co.com.runt.pruebaAngular.persistencia.dao.AplicacionDAO;
import co.com.runt.pruebaAngular.dto.AplicacionDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class AplicacionLogica {

    @EJB
    private AplicacionDAO persistencia;

    /**
     * Retorna una lista con los Aplicacion que se encuentran en la base de datos.
     * @return lista de Aplicacion
     * @generated
     */
    public List<Aplicacion> obtenerTodos(){
    	return persistencia.obtenerTodos();
    }
    
    /**
     * Obtiene Aplicacion dado su identificador. 	
     * @param id identificador del elemento Aplicacion
     * @return Aplicacion del id dado
     * @generated
     */
    public Aplicacion obtener(Long id){
    	return persistencia.obtener(id);
    }
    
    /**
     * Almacena la informacion de Aplicacion
     * @param entidad Aplicacion a guardar
     * @return Aplicacion con los cambios realizados por el proceso de guardar
     * @generated
     */
    public Aplicacion guardar(Aplicacion entidad){
    	return persistencia.guardar(entidad);
    }
    
    /**
     * Actualiza la informacion de Aplicacion.
     * @param entidad Aplicacion a actualizar
     * @generated
     */
    public void actualizar(Aplicacion entidad){
    	persistencia.actualizar(entidad);
    }
    
    /**
     * Elimina el registro Aplicacion con el identificador dado.
     * @param id identificador del Aplicacion
     * @generated 
     */
    public void borrar(Long id){
    	persistencia.borrar(id);
    }
	
}

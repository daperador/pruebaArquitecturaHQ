package co.com.runt.pruebaAngular.servicios;

import java.util.Date;
import javax.ejb.EJB;
import co.com.runt.pruebaAngular.logica.TrazabilidadLogica;
import co.com.runt.pruebaAngular.dto.TrazabilidadDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class TrazabilidadLogica {

    @EJB
    private TrazabilidadLogica logica;

    /**
     * Retorna una lista con los Trazabilidad que se encuentran en la base de datos.
     * @return lista de Trazabilidad
     * @generated
     */
    public List<TrazabilidadDTO> obtenerTodos(){
    	return logcia.obtenerTodos();
    }
    
    /**
     * Obtiene Trazabilidad dado su identificador. 	
     * @param id identificador del elemento Trazabilidad
     * @return Trazabilidad del id dado
     * @generated
     */
    public TrazabilidadDTO obtener(Long id){
    	return logica.obtener(id);
    }
    
    /**
     * Almacena la informacion de Trazabilidad
     * @param entidad Trazabilidad a guardar
     * @return Trazabilidad con los cambios realizados por el proceso de guardar
     * @generated
     */
    public TrazabilidadDTO guardar(TrazabilidadDTO dto){
    	return logica.guardar(dto);
    }
    
    /**
     * Actualiza la informacion de Trazabilidad.
     * @param entidad Trazabilidad a actualizar
     * @generated
     */
    public void actualizar(TrazabilidadDTO dto){
    	logica.actualizar(dto);
    }
    
    /**
     * Elimina el registro Trazabilidad con el identificador dado.
     * @param id identificador del Trazabilidad
     * @generated 
     */
    public void borrar(Long id){
    	logica.borrar(id);
    }
	
}

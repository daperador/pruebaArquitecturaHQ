package co.com.runt.pruebaAngular.servicios;

import java.util.List;
import javax.ejb.EJB;
import co.com.runt.pruebaAngular.logica.AplicacionLogica;
import co.com.runt.pruebaAngular.dto.AplicacionDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class AplicacionLogica {

    @EJB
    private AplicacionLogica logica;

    /**
     * Retorna una lista con los Aplicacion que se encuentran en la base de datos.
     * @return lista de Aplicacion
     * @generated
     */
    public List<AplicacionDTO> obtenerTodos(){
    	return logcia.obtenerTodos();
    }
    
    /**
     * Obtiene Aplicacion dado su identificador. 	
     * @param id identificador del elemento Aplicacion
     * @return Aplicacion del id dado
     * @generated
     */
    public AplicacionDTO obtener(Long id){
    	return logica.obtener(id);
    }
    
    /**
     * Almacena la informacion de Aplicacion
     * @param entidad Aplicacion a guardar
     * @return Aplicacion con los cambios realizados por el proceso de guardar
     * @generated
     */
    public AplicacionDTO guardar(AplicacionDTO dto){
    	return logica.guardar(dto);
    }
    
    /**
     * Actualiza la informacion de Aplicacion.
     * @param entidad Aplicacion a actualizar
     * @generated
     */
    public void actualizar(AplicacionDTO dto){
    	logica.actualizar(dto);
    }
    
    /**
     * Elimina el registro Aplicacion con el identificador dado.
     * @param id identificador del Aplicacion
     * @generated 
     */
    public void borrar(Long id){
    	logica.borrar(id);
    }
	
}

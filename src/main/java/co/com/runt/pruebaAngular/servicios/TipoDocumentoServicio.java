package co.com.runt.pruebaAngular.servicios;

import javax.ejb.EJB;
import co.com.runt.pruebaAngular.logica.TipoDocumentoLogica;
import co.com.runt.pruebaAngular.dto.TipoDocumentoDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class TipoDocumentoLogica {

    @EJB
    private TipoDocumentoLogica logica;

    /**
     * Retorna una lista con los TipoDocumento que se encuentran en la base de datos.
     * @return lista de TipoDocumento
     * @generated
     */
    public List<TipoDocumentoDTO> obtenerTodos(){
    	return logcia.obtenerTodos();
    }
    
    /**
     * Obtiene TipoDocumento dado su identificador. 	
     * @param id identificador del elemento TipoDocumento
     * @return TipoDocumento del id dado
     * @generated
     */
    public TipoDocumentoDTO obtener(Long id){
    	return logica.obtener(id);
    }
    
    /**
     * Almacena la informacion de TipoDocumento
     * @param entidad TipoDocumento a guardar
     * @return TipoDocumento con los cambios realizados por el proceso de guardar
     * @generated
     */
    public TipoDocumentoDTO guardar(TipoDocumentoDTO dto){
    	return logica.guardar(dto);
    }
    
    /**
     * Actualiza la informacion de TipoDocumento.
     * @param entidad TipoDocumento a actualizar
     * @generated
     */
    public void actualizar(TipoDocumentoDTO dto){
    	logica.actualizar(dto);
    }
    
    /**
     * Elimina el registro TipoDocumento con el identificador dado.
     * @param id identificador del TipoDocumento
     * @generated 
     */
    public void borrar(Long id){
    	logica.borrar(id);
    }
	
}

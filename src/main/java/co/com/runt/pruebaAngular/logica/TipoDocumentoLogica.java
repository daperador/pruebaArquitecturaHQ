package co.com.runt.pruebaAngular.logica;

import javax.ejb.EJB;
import co.com.runt.pruebaAngular.persistencia.entidad.TipoDocumento;
import co.com.runt.pruebaAngular.persistencia.dao.TipoDocumentoDAO;
import co.com.runt.pruebaAngular.dto.TipoDocumentoDTO;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Stateless 
public class TipoDocumentoLogica {

    @EJB
    private TipoDocumentoDAO persistencia;

    /**
     * Retorna una lista con los TipoDocumento que se encuentran en la base de datos.
     * @return lista de TipoDocumento
     * @generated
     */
    public List<TipoDocumento> obtenerTodos(){
    	return persistencia.obtenerTodos();
    }
    
    /**
     * Obtiene TipoDocumento dado su identificador. 	
     * @param id identificador del elemento TipoDocumento
     * @return TipoDocumento del id dado
     * @generated
     */
    public TipoDocumento obtener(Long id){
    	return persistencia.obtener(id);
    }
    
    /**
     * Almacena la informacion de TipoDocumento
     * @param entidad TipoDocumento a guardar
     * @return TipoDocumento con los cambios realizados por el proceso de guardar
     * @generated
     */
    public TipoDocumento guardar(TipoDocumento entidad){
    	return persistencia.guardar(entidad);
    }
    
    /**
     * Actualiza la informacion de TipoDocumento.
     * @param entidad TipoDocumento a actualizar
     * @generated
     */
    public void actualizar(TipoDocumento entidad){
    	persistencia.actualizar(entidad);
    }
    
    /**
     * Elimina el registro TipoDocumento con el identificador dado.
     * @param id identificador del TipoDocumento
     * @generated 
     */
    public void borrar(Long id){
    	persistencia.borrar(id);
    }
	
}

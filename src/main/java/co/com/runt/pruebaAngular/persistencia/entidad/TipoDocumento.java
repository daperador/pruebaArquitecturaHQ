package co.com.runt.pruebaAngular.persistencia.entidad;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Getter
@Setter
@Entity
@Table(name="TipoDocumento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="TipoDocumento.obtenerTodos", query="select e from TipoDocumento e where e.estado=true")
})
public class TipoDocumento {

	/**
	 * Identificador de la tabla TipoDocumento. 	
	 */
	@Id
    //@Column(name = "TipoDocumento_id")
    @GeneratedValue(generator = "TipoDocumentoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoDocumentoGen", sequenceName = "TipoDocumento_SEQ",allocationSize = 1)
	private Long id;

    

    
    private boolean esActivo=true;




				private boolean estado=true;




				/**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    
}

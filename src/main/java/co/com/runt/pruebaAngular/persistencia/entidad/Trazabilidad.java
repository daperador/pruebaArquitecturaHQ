package co.com.runt.pruebaAngular.persistencia.entidad;

import java.util.Date;
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
@Table(name="Trazabilidad")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Trazabilidad.obtenerTodos", query="select e from Trazabilidad e")
})
public class Trazabilidad {

	/**
	 * Identificador de la tabla Trazabilidad. 	
	 */
	@Id
    //@Column(name = "Trazabilidad_id")
    @GeneratedValue(generator = "TrazabilidadGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TrazabilidadGen", sequenceName = "Trazabilidad_SEQ",allocationSize = 1)
	private Long id;

    

    
    private boolean esActivo=true;




				private boolean estado=true;




				/**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "usuario")
    private String usuario;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "accion")
    private String accion;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fecha")
    private Date fecha;
    
    
}

package co.com.runt.pruebaAngular.persistencia.entidad;

import java.util.List;
import java.util.ArrayList;
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
@Table(name="Persona")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Persona.obtenerTodos", query="select e from Persona e")
})
public class Persona {

	/**
	 * Identificador de la tabla Persona. 	
	 */
	@Id
    //@Column(name = "Persona_id")
    @GeneratedValue(generator = "PersonaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PersonaGen", sequenceName = "Persona_SEQ",allocationSize = 1)
	private Long id;

    

    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "primerNombre")
    private String primerNombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "edad")
    private Integer edad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "estado")
    private Boolean estado;
    
    /**
    * @generated
    * 1-1-false
    */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoDocumento tipoDocumento;
    
}

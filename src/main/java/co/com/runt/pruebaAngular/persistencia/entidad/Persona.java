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
	@NamedQuery(name="Persona.obtenerTodos", query="select e from Persona e where e.estado=true")
})
public class Persona {

	/**
	 * @generated
	 * Identificador de la tabla Persona. 	
	 */
	@Id
    //@Column(name = "Persona_id")
    @GeneratedValue(generator = "PersonaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PersonaGen", sequenceName = "Persona_SEQ",allocationSize = 1)
	private Long id;

    //@Column(name = "Persona_estado")
    private boolean estado=true;

    
    //@Column(name = "primerNombre")
    private String primerNombre;
    
    //@Column(name = "edad")
    private Integer edad;
    
    //@Column(name = "migrado")
    private Boolean migrado;
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoDocumento tipoDocumento;
    
}

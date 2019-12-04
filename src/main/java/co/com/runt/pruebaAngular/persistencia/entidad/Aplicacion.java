package co.com.runt.pruebaAngular.persistencia.entidad;

import java.util.List;
import java.util.ArrayList;
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
@Table(name="Aplicacion")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Aplicacion.obtenerTodos", query="select e from Aplicacion e")
})
public class Aplicacion {

	/**
	 * Identificador de la tabla Aplicacion. 	
	 */
	@Id
    //@Column(name = "Aplicacion_id")
    @GeneratedValue(generator = "AplicacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AplicacionGen", sequenceName = "Aplicacion_SEQ",allocationSize = 1)
	private Long id;

    

    
    private boolean estado=true;




				/**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Persona> personas;
    
}

package co.com.runt.pruebaAngular.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Getter
@Setter
public class AplicacionDTO {

	private Long id;

    
    //@Column(name = "nombre")
    private String nombre;
    
    
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Persona> personas;
    
}

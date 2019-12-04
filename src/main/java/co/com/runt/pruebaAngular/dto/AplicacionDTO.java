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

    private String nombre;
    private List<Persona> personas;
}

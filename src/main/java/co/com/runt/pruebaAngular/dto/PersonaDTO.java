package co.com.runt.pruebaAngular.dto;

import java.util.List;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
  *  
  *  @author daperador
  *  @generated	  
*/
@Getter
@Setter
public class PersonaDTO {

	private Long id;

    private String primerNombre;private Integer edad;private Boolean migrado;private Date fechaNacimiento;
    private TipoDocumento tipoDocumento;
}

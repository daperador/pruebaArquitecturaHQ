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

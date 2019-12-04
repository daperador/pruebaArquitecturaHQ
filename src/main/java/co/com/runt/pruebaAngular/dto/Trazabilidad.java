package co.com.runt.pruebaAngular.dto;

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
public class TrazabilidadDTO {

	private Long id;

    
    //@Column(name = "usuario")
    private String usuario;
    
    //@Column(name = "accion")
    private String accion;
    @Temporal(TemporalType.DATE)
    //@Column(name = "fecha")
    private Date fecha;
    
    
}

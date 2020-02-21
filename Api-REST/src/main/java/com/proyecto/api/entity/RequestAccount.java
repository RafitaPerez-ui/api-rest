

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("RequestAccount")
public class RequestAccount {
	
	@ApiModelProperty(name = "cuentaOrijen", example = "1234567890123456")
	@NotBlank(message = "la cuenta origen es requerido para la operaci\u00F3n.")
	private String cuentaOrijen;

	@NotBlank(message = "la cuenta destino es requerido para la operaci\u00F3n.")
	@ApiModelProperty(name = "cuentaDestino", example = "2585")
	private String cuentaDestino;
	
	@NotBlank(message = "El monto es requerido para la operaci\u00F3n.")
	@ApiModelProperty(name = "monto", example = "2585")
	private String monto;

	public String getCuentaOrijen() {
		return cuentaOrijen;
	}

	public void setCuentaOrijen(String cuentaOrijen) {
		this.cuentaOrijen = cuentaOrijen;
	}

	public String getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}
	
	
	
}

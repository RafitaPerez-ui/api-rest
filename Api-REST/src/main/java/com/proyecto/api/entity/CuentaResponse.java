

import bean.ResponseTO;


public class CuentaResponse extends ResponseTO{
	

	private String cuentaOrijen;


	private String cuentaDestino;
	

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

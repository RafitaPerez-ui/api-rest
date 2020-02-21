


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import CuentaResponse;
import RequestAccount;
import annotation.Servicio;

@Service
public class MoneyTransferBI {
	
	private static Logger log = LoggerFactory.getLogger(MoneyTransferBI.class);
	CuentaResponse response = new CuentaResponse();
	@Servicio(codeCircuitBreaker = 1101, projectName = "Creditos")
	public ResponseEntity<Object> tranfiere(RequestAccount request) {
		// TODO Auto-generated method stub
		try {
			log.info("Ingreso al metodo tranfiere");
			response.setCuentaDestino(request.getCuentaDestino());
			response.setCuentaOrijen(request.getCuentaOrijen());
			response.setMonto(request.getMonto());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}

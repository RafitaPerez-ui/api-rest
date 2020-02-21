


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import entity.HistorialResponse;
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
	
	
		public ResponseEntity<Object> ObtenHistorial(@NotBlank String cuenta) {
		HistorialResponse response = new HistorialResponse();
		try {
			log.info("Ingreso al metodo ObtenHistorial con la cuenta: " + cuenta);
			String respuesta = "{\"balance\":{ \"acount\":\"1234567889\", \"balance\":\"542.00\",\"owner\":\"7894563\",  \"creacion\":\"2020-01-01\"  }}"; 
			response = UtileriaServicio.jsonAObjeto(respuesta,HistorialResponse.class);
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
		public ResponseEntity<Object> obtenerCuenta(@NotBlank String cuenta) {
		String respuesta = null ;
		try {
			log.info("Ingreso al metodo obtenerCuenta con la cuenta: " + cuenta);
			 respuesta = "{\"transacciones\":[ {\"cuentaOrigen\":\"55542\",\"cuentaDestino\":\"6742341\",\"monto\":\"66156.20\",\"fechaEnvio\":\"2020-01-01\"},{\"cuentaOrigen\":\"55542\",\"cuentaDestino\":\"6742341\",\"monto\":\"66156.20\",\"fechaEnvio\":\"2020-01-01\"}]}";
		
		} catch (Exception e) {
			e.getMessage();
		}
		return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}

}

package com.bancoazteca.api.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@RestController
@Api(value="Ap")
@RequestMapping("/test/v1")
public class Controller
{
   @ApiOperation(value="Metodo para transferir dinero", nickname="Transferencias", 
          response=ResponseTO.class, tags={"Api-Rest"})
      @ApiResponses({@ApiResponse(code=200, message="Ok", response = ResponseTO.class),
              @ApiResponse(code=400, message="Entrada incorrecta", response=ResponseError.class),
              @ApiResponse(code=404, message="No encontrado", response=ResponseError.class),
              @ApiResponse(code=500, message="Internal server error", response=ResponseError.class)})
      @PostMapping(value="/tranfiere/dinero", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    @SeguridadAsimetrica
      public ResponseEntity<Object> TranfiereDinero(
          @Valid @RequestHeader(defaultValue="eyJhbGciOiJSUzM4NCIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyLCJIYXNoQ29kZSI6IjY0NTVlMDBjYjgxMWY5MjhhMjgwODNlNzQ1YTcxYjQ5MGYyYzRlYTY4MzE1MGU3MWY4NmQ1NjY4Y2VlODgyOTdkODVmM2ExZTNjZGY2ZTkxZmQ2NGI0YWZkYjEzMDg5M2Q4ZjI3MDY5YmZhNGQ2ZWZlZmM5ZWU1ZTNlZjE1YzBlIn0.bGDQoQTibydo10-EIOnI9cfSJUI2SsA3UUYbnn-0K9qRzL-kstxbe4cqBirh3-Gayjw0rrqkDKkeZi-4MCrGDx4tf2eaABQPsrbD0IixydOKT2DuIHOk383OkigCq9ppr1o9OUrwpsVn_W9QROIQRpQcWqgHsMdzY73j2Qv9oNI", name="Token", required=true) String token,
          @Valid @RequestHeader(defaultValue="5d5c8af08e86041746197249", required=true) String idAcceso,
          @Valid @RequestHeader(name = "X-Aplicacion", required = true) String aplicacion,
          @Valid @RequestBody RequestAccount request)
      {
        LOG.info("Controller - Transferencias");
        return this.moneyTransferBI.tranfiere(request);
      }

}

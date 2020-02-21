# api-rest
Funcionalidad de transferir dinero y mostrar todas las transacciones realizadas
## Comenzando 🚀
_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._
### Pre-requisitos 📋

_Que cosas necesitas para instalar el software y como instalarlas_

```
Necesitas..

java 8 
Spring boot
swagger
Eclipse IDE
Gradle

```
## Ejecutando las pruebas ⚙️

_las pruebas se realizan a travez de swagger  con la url:
https://localhost:puerto/proyecto/swagger-ui.html#/endpoint


### Analisis de pruebas🔩
_Las pruebas consisten en tres faces la primera es realizar una transferencia de dinero, la segunda es ver la lista de transacciones y por ultimo obtener el saldo actual_

_Metodos creados para el proyecto_
![la imagen siguiente muestra los metodos que se crearon para el proyecto](https://github.com/RafitaPerez-ui/api-rest/blob/master/img%20de%20pruebas%20locales/FireShot%20Capture%20003%20-%20Swagger%20UI%20-%20localhost.png)

## Despliegue 📦

_Para desplegar la aplicacion es necesario colocar en la clase que contiene el main  System.setProperty("ambiente", "desarrollo"); para poder realizar el despliegue en nuestro ambiente local_

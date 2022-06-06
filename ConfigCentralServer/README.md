# Servicio centralizado de configuraciones

## Definición
Servicio construido en Spring boot encargado de centralizar y distribuir los archivos yaml de configuración. 

## Consideraciones generales
* Java 17 es necesario para compilar y ejecutar el servicio
* La propiedad server.port indica el puerto que debe estar abierto para tener comunicación http.
* La propiedad spring.clud.config.server.native.search-locations indica la ruta local de los archivos yaml. Mientras que spring.clud.config.server.git.uri el url que referencial al repositorio de git.
* La propiedad compuesta spring.security.user determina las credenciales que los servicios nodos deben enviar para conectarse exitosamente al servicio.

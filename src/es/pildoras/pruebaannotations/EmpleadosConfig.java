package es.pildoras.pruebaannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.pildoras.pruebaannotations")
public class EmpleadosConfig {

}



















/*
@Configuration
@ComponentScan("es.pildora.pruebaannotations")

La anotacion @Configuration nos permite utilizar la clase como archivo de configuración, reemplazando el .xml.

La anotacion @ComponentScan configura el scanner para cooperar con @Autowired, requiere que se le indique donde escaneará.

*/
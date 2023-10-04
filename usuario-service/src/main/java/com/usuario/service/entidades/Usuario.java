package com.usuario.service.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;



@Data
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nombre;
    private String email;
    
}


/* **************************
        minuto 2:20:38  config-service - yaml ¿?

desde   57:08 RestTemplate   hasta 1:20:50  (comunicar servicios)
desde 1:20:50 Feing client                  (comunicar servicios)
desde 1:57:00 Servidor de configuracion Git: server-config
desde 2:48:35 Servidor Eureka
desde 3:14:06 Configuracion de los microservicios para tener multiples instancias
desde 3:32:25 Gateway
desde 3:59:50 Implementación de Circuit breaker por medio de la libreria Resilience4j (tolerancia de fallos)
desde 4:51:40 Implementación de Zipkin (rastreo de microservicios)

**************************** */
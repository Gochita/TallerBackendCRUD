package com.example.demo.models;

import javax.persistence.*;

@Entity//Etiqueta que identifica que es un modelo real
@Table(name="usuario") //Etiqueta para indicar que la tabla se llama usuario

//Atributos de tabla usuario
public class UsuarioModel {
    
    @Id//etiqueta para identificar que este atributo será un id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //etiqueta que indica que el atributo se generará automaticamente
    @Column(unique=true, nullable=false)//etiqueta para identificar que sera unico y no puede ser falso
    private Long id;


    private String nombre;
    private String apellido;
    private String email;
    private Integer prioridad;

//Metodos setters y getters para cada atributo
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

}

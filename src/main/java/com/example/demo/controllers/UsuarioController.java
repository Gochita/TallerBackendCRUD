package com.example.demo.controllers;


import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/usuario") //Define la ruta donde se van a encontrar los usuarios
public class UsuarioController {
    @Autowired //etiqueta que busca el objeto usuario que implementa la interfazpar hacer referencia a el
    UsuarioService usuarioService;


    @GetMapping
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioService.obtenerPorId(id);
    }

    @GetMapping(path = "/nombre")
    public ArrayList<UsuarioModel> obtenerUsuarioPorNombre(@RequestParam("nombre") String nombre) {
        return this.usuarioService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/apellido")
    public ArrayList<UsuarioModel> obtenerUsuarioPorApellido(@RequestParam("apellido") String apellido) {

        return this.usuarioService.obtenerPorApellido(apellido);
    }

    //http://localhost:8080/usuario/query?prioridad=5
    @GetMapping("/query")
    public ArrayList<UsuarioModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.usuarioService.obtenerPorPrioridad(prioridad);
    }

    @GetMapping("/email")
    public ArrayList<UsuarioModel> obtenerUsuarioPorEmail(@RequestParam("email") String email) {

        return this.usuarioService.obtenerPorEmail(email);
    }


    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok) {
            return "Se elimino el usuario con id " + id;
        } else {
            return "No se pudo eliminar el usuario con id " + id;
        }


    }


}














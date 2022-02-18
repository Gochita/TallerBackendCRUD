package com.example.demo.services;


import com.example.demo.models.UsuarioModel;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service    //etiqueta que indica que la clase corresponde a un servicio
public class UsuarioService {
    @Autowired //etiqueta que busca el objeto usuario que implementa la interfazpar hacer referencia a el
    UsuarioRepository usuarioRepository;

    //Metodo para traer todos los usuarios
    public ArrayList<UsuarioModel> obtenerUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();

    }

    //metodo para agregar usuario
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    //metodo para obtener usuarios mediante el id
    public Optional<UsuarioModel> obtenerPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    //metodo para obtener usuarios mediante prioridad
    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad) {
        return usuarioRepository.findByPrioridad(prioridad);
    }

    //metodo para traer todos los usuarios con cierto nombre
    public ArrayList<UsuarioModel> obtenerPorNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }

    //Metodo para traer los datos de un usuario con cierto email
    public ArrayList<UsuarioModel> obtenerPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    //Metodo para traer los datos de un usuario con cierto apellido
    public ArrayList<UsuarioModel> obtenerPorApellido(String apellido) {
        return usuarioRepository.findByApellido(apellido);
    }

    //metodo para eliminar usuario por id
    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;


        }
    }


}

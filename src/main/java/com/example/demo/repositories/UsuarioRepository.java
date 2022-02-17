package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> { //Interfaaz de metodos que utiliza el servicio
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad); //hallar por prioridad
    public abstract ArrayList<UsuarioModel> findByNombre(String nombre); //hallar por nombre
    public abstract ArrayList<UsuarioModel> findByEmail(String email); //hallar por email
}

package com.example.reto322.Reto322.repository;


import java.util.List;
import java.util.Optional;

import com.example.reto322.Reto322.entity.Categoria;
import com.example.reto322.Reto322.interface1.InterfaceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RepositorioCategoria {

    @Autowired
    private InterfaceCategoria crud;
    public List<Categoria> getAll(){
        return (List<Categoria>) crud.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return crud.findById(id);
    }

    public Categoria save(Categoria Categoria){
        return crud.save(Categoria);
    }
    public void delete(Categoria Categoria){
        crud.delete(Categoria);
    }

}

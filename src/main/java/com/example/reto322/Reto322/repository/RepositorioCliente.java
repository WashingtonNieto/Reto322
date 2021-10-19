package com.example.reto322.Reto322.repository;

import java.util.List;
import java.util.Optional;

import com.example.reto322.Reto322.entity.Cliente;
import com.example.reto322.Reto322.interface1.InterfaceCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository

public class RepositorioCliente {

    @Autowired
    private InterfaceCliente crud1;

    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll();
    }
    public Optional<Cliente> getCliente(int id){
        return crud1.findById(id);
    }

    public Cliente save(Cliente cliente){
        return crud1.save(cliente);
    }
    public void delete(Cliente cliente){
        crud1.delete(cliente);
    }

}

package com.example.reto322.Reto322.repository;



import java.util.List;
import java.util.Optional;

import com.example.reto322.Reto322.entity.Reservaciones;
import com.example.reto322.Reto322.interface1.InterfaceReservaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class RepositorioReservaciones {

    @Autowired
    private InterfaceReservaciones crud4;

    public List<Reservaciones> getAll(){
        return (List<Reservaciones>) crud4.findAll();
    }
    public Optional<Reservaciones> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservaciones save(Reservaciones reservation){
        return crud4.save(reservation);
    }
    public void delete(Reservaciones reservation){
        crud4.delete(reservation);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.challenge.end.Repository.CrudRepository;


import com.challenge.end.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{
    
}

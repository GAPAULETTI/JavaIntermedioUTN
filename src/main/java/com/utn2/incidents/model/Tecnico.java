/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn2.incidents.model;

import java.util.List;

/**
 *
 * @author Gaston
 */
public class Tecnico {
    
    private int id;
    private String nombreCompleto;
    private String email;
    private List<Servicio> prestaciones;

    public Tecnico() {
    }

    public Tecnico(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    
    

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public List<Servicio> getPrestaciones() {
        return prestaciones;
    }
    public void addPrestacion(Servicio servicio){
        this.prestaciones.add(servicio);
    }
    
    
    
}

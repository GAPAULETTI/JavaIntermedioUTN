/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utn2.incidents.model;

import java.time.LocalDateTime;

/**
 *
 * @author Gaston
 */
public class Incidente {
    
    private int id;
    private String direccion;
    private String tipoProblema;
    private String descripcion;
    private LocalDateTime fechaEstimada;
    private Boolean estado;
}

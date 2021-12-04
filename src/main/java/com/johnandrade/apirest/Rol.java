/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.johnandrade.apirest;

import javax.persistence.*;

@Entity
@Table(name="rol")
public class Rol {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
    @Column
    private String nombre;
    
    
}

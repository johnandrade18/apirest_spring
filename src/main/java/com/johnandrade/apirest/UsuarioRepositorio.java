/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.johnandrade.apirest;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface UsuarioRepositorio extends Repository<Usuario, Integer>{
    List<Usuario>findAll();
    Usuario findOne(int id);
    Usuario save(Usuario u);
    void delete(Usuario u);
}

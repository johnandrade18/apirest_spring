package com.johnandrade.apirest;

import java.util.List;


public interface UsuarioService {
    
    List<Usuario>listar();
    Usuario listarId(int id);
    Usuario add(Usuario u);
    Usuario edit(Usuario u);
    Usuario delete(int id);
    
}

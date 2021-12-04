package com.johnandrade.apirest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/usuarios"})
@CrossOrigin(origins = "*", maxAge = 3600)
public class Controller {
    @Autowired
    UsuarioService service;
    
    @GetMapping
    public List<Usuario> listar(){
        return service.listar();
    };
}

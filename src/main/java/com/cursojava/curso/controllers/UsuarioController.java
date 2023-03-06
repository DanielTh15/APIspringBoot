package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Daniel");
        usuario.setApellido("Thevenin");
        usuario.setEmail("gonfidaniel@gmail.com");
        usuario.setTelefono("3005965069");
        return usuario;
    }
    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Thevenin");
        usuario.setEmail("gonfidaniel@gmail.com");
        usuario.setTelefono("3005965069");
        return usuario;
    }
    @RequestMapping(value = "usuario0")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Thevenin");
        usuario.setEmail("gonfidaniel@gmail.com");
        usuario.setTelefono("3005965069");
        return usuario;
    }
    @RequestMapping(value = "usuario2")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Daniel");
        usuario.setApellido("Thevenin");
        usuario.setEmail("gonfidaniel@gmail.com");
        usuario.setTelefono("3005965069");
        return usuario;
    }
}

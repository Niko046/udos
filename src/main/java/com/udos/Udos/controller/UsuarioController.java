/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.controller;

import com.udos.Udos.model.UsuarioModel;
import com.udos.Udos.service.UsuarioService;
import com.udos.Udos.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Niko
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    @Autowired 
    private UsuarioService usuarioService;
    
    @PostMapping("/")
    public CustomResponse registrarUsuario(@RequestBody UsuarioModel usuario) {
        CustomResponse customeResponse = new CustomResponse();
        usuarioService.createUsuario(usuario);        
        return customeResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getUsuarios(){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(usuarioService.getUsuarios());
        return customeResponse;
    }
    
    @GetMapping("/{id}")
    public CustomResponse getUsuario(@RequestBody UsuarioModel usuario, @PathVariable String id){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(usuarioService.getUsuario(id));
        return customeResponse;
    }
    
    @GetMapping("/name/{username}")
    public CustomResponse getUsuarioo(@RequestBody UsuarioModel usuario, @PathVariable String username){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(usuarioService.getUsuarioo(username));
        return customeResponse;
    }
    
    
    
    @PutMapping("/{id}")
    public CustomResponse updateUsuario(@RequestBody UsuarioModel usuario, @PathVariable String id){
        CustomResponse customResponse = new CustomResponse();
        usuarioService.updateUsuario(usuario, id);        
        return customResponse;       
    
    }
    
    @DeleteMapping("/{id}")
    public CustomResponse deleteUsuario(@PathVariable String id){
        CustomResponse customeResponse = new CustomResponse();
        usuarioService.deleteUsuario(id);        
        return customeResponse;       
    
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.implement.service;

import com.udos.Udos.model.UsuarioModel;
import com.udos.Udos.repository.UsuarioRepository;
import com.udos.Udos.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Niko
 */
@Service
public class UsuarioServiceImplement implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void createUsuario(UsuarioModel usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public List getUsuarios() {
      return usuarioRepository.findAll();
    }

    @Override
    public UsuarioModel getUsuario(String id) {
        return usuarioRepository.findByid(id);
    }

    @Override
    public void updateUsuario(UsuarioModel usuario, String id) {
       usuario.setId(id);
        usuarioRepository.save(usuario);
    }

    @Override
    public void deleteUsuario(String id) {
         usuarioRepository.deleteById(id); 
    }

    @Override
    public UsuarioModel getUsuarioo(String username) {
        return usuarioRepository.findByUsername(username);
    }


   

   
}

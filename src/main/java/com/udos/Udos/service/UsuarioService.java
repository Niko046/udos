/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udos.Udos.service;

import com.udos.Udos.model.UsuarioModel;
import java.util.List;

/**
 *
 * @author Niko
 */
public interface UsuarioService {
    public void createUsuario(UsuarioModel usuario);
    public List getUsuarios();
    public UsuarioModel getUsuario(String id);
    public UsuarioModel getUsuarioo(String username);
    public void updateUsuario(UsuarioModel usuario, String id);
    public void deleteUsuario(String id);
  
    
}

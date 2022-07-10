/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udos.Udos.service;

import com.udos.Udos.model.LiderModel;
import java.util.List;

/**
 *
 * @author Niko
 */
public interface LiderService {
    public void createLider(LiderModel lider);
    
    public List getLideres();
    public LiderModel getLider(String username);
    public void updateLider(LiderModel LiderModel, String username);
    public void deleteLider(String username);
    public List getLideresCoordinador(String coordinador);
    
  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udos.Udos.service;

import com.udos.Udos.model.PromovidoModel;
import java.util.List;

/**
 *
 * @author Niko
 */
public interface PromovidoService {
    public void createPromovido(PromovidoModel promovido);
    
    public List getPromovidos();
    public PromovidoModel getPromovido(String curp);
    
    public List getPromovidosLider(String identificador);
    public void updatePromovido(PromovidoModel promovido, String curp);
    public void deletePromovido(String curp);
    
  
    
}

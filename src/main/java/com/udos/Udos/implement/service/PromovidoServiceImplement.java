/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.implement.service;

import com.udos.Udos.model.PromovidoModel;
import com.udos.Udos.repository.PromovidoRepository;
import com.udos.Udos.service.PromovidoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Niko
 */
@Service
public class PromovidoServiceImplement implements PromovidoService {

    @Autowired
    private PromovidoRepository promovidoRepository;
    
    @Override
    public void createPromovido(PromovidoModel promovido) {
        promovidoRepository.save(promovido);
    }

    @Override
    public List getPromovidos() {
        return promovidoRepository.findAll();
    }

    @Override
    public PromovidoModel getPromovido(String curp) {
        return promovidoRepository.findByCurp(curp);
    }

    @Override
    public void updatePromovido(PromovidoModel promovido, String curp) {
        promovido.setCurp(curp);
        promovidoRepository.save(promovido);
    }

    @Override
    public void deletePromovido(String curp) {
        promovidoRepository.deleteById(curp); 
    }

    @Override
    public List getPromovidosLider(String identificador) {
        return promovidoRepository.findByidentificador(identificador);
    }

   



   
}

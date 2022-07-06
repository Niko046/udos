/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.implement.service;

import com.udos.Udos.model.LiderModel;
import com.udos.Udos.repository.LiderRepository;
import com.udos.Udos.service.LiderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Niko
 */
@Service
public class LiderServiceImplement implements LiderService {

    @Autowired
    private LiderRepository liderRepository;


    @Override
    public void createLider(LiderModel lider) {
        liderRepository.save(lider);
    }

   
    @Override
    public void updateLider(LiderModel liderModel, Integer identificador) {
        liderModel.setIdentificador(identificador);
        liderRepository.save(liderModel);
    }

    @Override
    public void deleteLider(Integer identificador) {
       liderRepository.deleteById(identificador);  
    }
    

    @Override
    public List getLideres() {
        return liderRepository.findAll();
    }

    @Override
    public LiderModel getLider(Integer identificador) {
        return liderRepository.findByIdentificador(identificador);
    }

   
}

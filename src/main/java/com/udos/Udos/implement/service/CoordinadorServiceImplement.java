/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.implement.service;

import com.udos.Udos.model.CoordinadorModel;
import com.udos.Udos.repository.CoordinadorRepository;
import com.udos.Udos.service.CoordinadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Niko
 */
@Service
public class CoordinadorServiceImplement implements CoordinadorService {

    @Autowired
    private CoordinadorRepository coordinadorRepository;


    @Override
    public void createCoordinador(CoordinadorModel coordinador) {
        coordinadorRepository.save(coordinador);
    }

   
    @Override
    public void updateCoordinador(CoordinadorModel coordinadorModel, String username) {
        coordinadorModel.setUsername(username);
        coordinadorRepository.save(coordinadorModel);
    }

    @Override
    public void deleteCoordinador(String username) {
       coordinadorRepository.deleteById(username);  
    }
    

    @Override
    public List getCoordinadores() {
        return coordinadorRepository.findAll();
    }

    @Override
    public CoordinadorModel getCoordinador(String username) {
        return coordinadorRepository.findByUsername(username);
    }



   
}

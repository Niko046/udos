/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.controller;

import com.udos.Udos.model.CoordinadorModel;
import com.udos.Udos.service.CoordinadorService;
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
@RequestMapping("/api/v1/coordinador")
public class CoordinadorController {
    @Autowired 
    private CoordinadorService coordinadorService;
    
    @PostMapping("/")
    public CustomResponse registrarCoordinador(@RequestBody CoordinadorModel coordinador) {
        CustomResponse customeResponse = new CustomResponse();
        coordinadorService.createCoordinador(coordinador);        
        return customeResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getCoordinadores(){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(coordinadorService.getCoordinadores());
        return customeResponse;
    }
    
    @GetMapping("/{username}")
    public CustomResponse getLider(@RequestBody CoordinadorModel coordinador, @PathVariable String username){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(coordinadorService.getCoordinador(username));
        return customeResponse;
    }
    
    
    
    @PutMapping("/{username}")
    public CustomResponse updateCoordinador(@RequestBody CoordinadorModel coordinador, @PathVariable String username){
        CustomResponse customResponse = new CustomResponse();
        coordinadorService.updateCoordinador(coordinador, username);        
        return customResponse;       
    
    }
    
    @DeleteMapping("/{username}")
    public CustomResponse deleteCoordinador(@PathVariable String username){
        CustomResponse customeResponse = new CustomResponse();
        coordinadorService.deleteCoordinador(username);        
        return customeResponse;       
    
    }
    

}
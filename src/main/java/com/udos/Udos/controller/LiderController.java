/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.controller;

import com.udos.Udos.model.LiderModel;
import com.udos.Udos.service.LiderService;
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
@RequestMapping("/api/v1/lider")
public class LiderController {
    @Autowired 
    private LiderService liderService;
    
    @PostMapping("/")
    public CustomResponse registrarFactura(@RequestBody LiderModel lider) {
        CustomResponse customeResponse = new CustomResponse();
        liderService.createLider(lider);        
        return customeResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getLideres(){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(liderService.getLideres());
        return customeResponse;
    }
    
    @GetMapping("/{identificador}")
    public CustomResponse getLider(@RequestBody LiderModel lider, @PathVariable Integer identificador){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(liderService.getLider(identificador));
        return customeResponse;
    }
    
    
    
    @PutMapping("/{identificador}")
    public CustomResponse updateFactura(@RequestBody LiderModel lider, @PathVariable Integer identificador){
        CustomResponse customResponse = new CustomResponse();
        liderService.updateLider(lider, identificador);        
        return customResponse;       
    
    }
    
    @DeleteMapping("/{identificador}")
    public CustomResponse deleteFactura(@PathVariable Integer identificador){
        CustomResponse customeResponse = new CustomResponse();
        liderService.deleteLider(identificador);        
        return customeResponse;       
    
    }

}
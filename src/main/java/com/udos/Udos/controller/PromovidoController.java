/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udos.Udos.controller;

import com.udos.Udos.model.PromovidoModel;
import com.udos.Udos.service.PromovidoService;
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
@RequestMapping("/api/v1/promovido")
public class PromovidoController {
    @Autowired 
    private PromovidoService promovidoService;
    
    @PostMapping("/")
    public CustomResponse registrarPromovido(@RequestBody PromovidoModel promovido) {
        CustomResponse customeResponse = new CustomResponse();
        if(promovidoService.getPromovido(promovido.getCurp())!=null){
        customeResponse.setMensaje("El promovido ya se encuentra registrado por el lider " +promovidoService.getPromovido(promovido.getCurp()).getNombrelider());
        return customeResponse;
        }
        
        else{
        promovidoService.createPromovido(promovido);        
        return customeResponse;}
    }
    
    @GetMapping("/")
    public CustomResponse getPromovidos(){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(promovidoService.getPromovidos());
        return customeResponse;
    }
    
    @GetMapping("/{curp}")
    public CustomResponse getPromovido(@RequestBody PromovidoModel promovido, @PathVariable String curp){
        CustomResponse customeResponse = new CustomResponse();
        customeResponse.setData(promovidoService.getPromovido(curp));
        return customeResponse;
    }
    
 
    
    
    
    @PutMapping("/{curp}")
    public CustomResponse updatePromovido(@RequestBody PromovidoModel promovido, @PathVariable String curp){
        CustomResponse customResponse = new CustomResponse();
        promovidoService.updatePromovido(promovido, curp);        
        return customResponse;       
    
    }
    
    @DeleteMapping("/{curp}")
    public CustomResponse deletePromovido(@PathVariable String curp){
        CustomResponse customeResponse = new CustomResponse();
        promovidoService.deletePromovido(curp);        
        return customeResponse;       
    }
    
    @GetMapping("/promovidos/{identificador}")
    public CustomResponse getPromovidosLider(@PathVariable String identificador){
       CustomResponse customResponse = new CustomResponse(); 
       customResponse.setData(promovidoService.getPromovidosLider(identificador));
       return customResponse;
    }

}
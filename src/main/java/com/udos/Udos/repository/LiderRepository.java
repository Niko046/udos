/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.udos.Udos.repository;

import com.udos.Udos.model.LiderModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Niko
 */
@Repository
public interface LiderRepository extends JpaRepository<LiderModel,Integer> {
    public LiderModel findByIdentificador(Integer identificador);
}

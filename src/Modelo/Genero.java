/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author martin
 */
@Entity
@Table (name="Genero")
public class Genero {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //indica que el id es autoincrementado en la base
    @Column(name="idGenero")
    private int idGenero;
    
    @Column(name = "Genero")
    private String genero;
    

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}

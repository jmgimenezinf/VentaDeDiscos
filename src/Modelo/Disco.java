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
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 *
 * @author martin
 */

@Entity
@Table(name="Disco")
public class Disco {
    
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="idDisco")
   private int idDisco;
   
   @Column(name="Titulo")
   private String titulo;
   
   @Column(name="Autor")   
   private String autor;  
   
   @Column(name="Formato")
   private String formato;
   
   @Column(name="ISMN")   
   private String ismn;
   
   @Column(name="Sello_discografico")
   private String selloDiscografico;
   
   @Column(name="Clasificacion")   
   private String clasificacion;
   
   
   @ManyToOne 
   private Genero genero;
   
 

   
    public int getIdDisco() {
        return idDisco;
    }

    public void setIdDisco(int idDisco) {
        this.idDisco = idDisco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }



    public String getIsmn() {
        return ismn;
    }

    public void setIsmn(String ismn) {
        this.ismn = ismn;
    }

    public String getSelloDiscografico() {
        return selloDiscografico;
    }

    public void setSelloDiscografico(String selloDiscografico) {
        this.selloDiscografico = selloDiscografico;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
   

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class Disco {
   private int idDisco;
   private String titulo;
   private String autor;  
   private String formato;
   private String genero;
   private String ismn;
   private String selloDiscografico;
   private String clasificacion;
   private ArrayList<Stock> stockArray; 


   
   public Disco(int idDisco,String titulo,String autor,String formato,String genero,String ismn,
           String selloDiscografico,String clasificacion){
       this.setIdDisco(idDisco);
       this.setTitulo(titulo);
       this.setAutor(autor);
       this.setFormato(formato);
       this.setGenero(genero);
       this.setIsmn(ismn);
       this.setSelloDiscografico(selloDiscografico);
       this.setClasificacion(clasificacion);
      
   }
    public ArrayList<Stock> getStockArray() {
        return stockArray;
    }

    public void setStockArray(ArrayList<Stock> stockArray) {
        this.stockArray = stockArray;
    }
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
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

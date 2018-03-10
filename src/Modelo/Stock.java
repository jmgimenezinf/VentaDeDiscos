/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author martin
 */
public class Stock {
    private int cantidad;
    private Date fecha_ingreso;
    
    public Stock(int cantidad,Date fecha_ingreso) {
       this.setCantidad(cantidad);
       this.setFecha_ingreso(fecha_ingreso);
 
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
    
}

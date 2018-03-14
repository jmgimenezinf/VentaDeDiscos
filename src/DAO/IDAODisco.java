/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Disco;
import java.util.List;

/**
 *
 * @author martin
 */
public interface IDAODisco {
    public List consultar();
    public void guardar(Disco disco);
    
}

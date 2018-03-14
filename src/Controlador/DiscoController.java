/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAODiscoHibernate;
import DAO.IDAODisco;
import Modelo.Disco;
import Vista.Administrador;
import java.util.Iterator;

/**
 *
 * @author martin
 */
public class DiscoController {
    
    private IDAODisco iDAODisco;
    private Administrador administradorUI;
   
    
    public static void main(String args[]) {
        DiscoController controller = new DiscoController();
    }
    
    public DiscoController(){
        this.setiDAODisco(new DAODiscoHibernate());
        this.setAdministradorUI(new Administrador());
        Iterator iterator = this.getiDAODisco().consultar().iterator();
        int i =0;
        while(iterator.hasNext()){
            Disco disco = (Disco) iterator.next();
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getTitulo(),i, 1);
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getAutor(),i, 2);
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getFormato(),i, 3);
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getGenero(),i, 4);
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getIsmn(),i, 5);
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getSelloDiscografico(),i, 6);
            this.getAdministradorUI().getTabla_disco().setValueAt(disco.getClasificacion(),i, 7);
            
            i++;
        }
        this.getAdministradorUI().setVisible(true);

        
    }
    public IDAODisco getiDAODisco() {
        return iDAODisco;
    }

    public void setiDAODisco(IDAODisco iDAODisco) {
        this.iDAODisco = iDAODisco;
    }

    public Administrador getAdministradorUI() {
        return administradorUI;
    }

    public void setAdministradorUI(Administrador administradorUI) {
        this.administradorUI = administradorUI;
    }
    
    
    
}

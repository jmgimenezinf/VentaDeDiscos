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
    private Disco disco;
    
    public static void main(String args[]) {
        DiscoController controller = new DiscoController();
    }
    
    public DiscoController(){
        this.setiDAODisco(new DAODiscoHibernate());
        this.setAdministradorUI(new Administrador());
        this.loadDataTable();
        this.getAdministradorUI().setVisible(true);
        this.getAdministradorUI().getFormCrearDisco().addActionListener((event)-> actionBtnCrear(this.getAdministradorUI(),this.getiDAODisco()));
        
    }
    private void actionBtnCrear(Administrador administradorUI,IDAODisco daoDisco){
       String autor =  administradorUI.getFormCrearDisco().getInputAutor().getText();
       String titulo  = administradorUI.getFormCrearDisco().getInputTitulo().getText();
       String formato = administradorUI.getFormCrearDisco().getInputFormato().getText();
       String genero = administradorUI.getFormCrearDisco().getInputGenero().getText();
       String ismn = administradorUI.getFormCrearDisco().getInputISMN().getText();
       String selloDiscografico = administradorUI.getFormCrearDisco().getInputSelloDiscografico().getText();
       Disco disco = new Disco();
       disco.setAutor(autor);
       disco.setTitulo(titulo);
       disco.setFormato(formato);
       disco.setGenero(genero);
       disco.setIsmn(ismn);
       disco.setSelloDiscografico(selloDiscografico);
       daoDisco.guardar(disco);
       administradorUI.getFormCrearDisco().getModalFrame().dispose();
       this.loadDataTable();
    }
    private void loadDataTable(){
         Iterator iterator = this.getiDAODisco().consultar().iterator();
        int i = 0;
        while(iterator.hasNext()){
            Disco disco = (Disco) iterator.next();
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getIdDisco(),i, 0);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getTitulo(),i, 1);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getAutor(),i, 2);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getFormato(),i, 3);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getGenero(),i, 4);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getIsmn(),i, 5);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getSelloDiscografico(),i, 6);
            this.getAdministradorUI().getTablaDisco().setValueAt(disco.getClasificacion(),i, 7);
            
            i++;
        }
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import Modelo.Disco;
import Modelo.Stock;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;


/**
 *
 * @author martin
 */
public class TestHibernate {

    /**
     * @param args the command line arguments
     * @throws org.hibernate.HibernateException
     */
    public static void main(String[] args)  {
        System.out.println("Hibernate Example XML");
        Session session = SingletonConection.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Criteria criteriaDisco = session.createCriteria(Disco.class);
       // Criteria criteriaStock = session.createCriteria(Stock.class);
        List discos = criteriaDisco.list();

        Iterator itr = discos.iterator();
        while(itr.hasNext()){
            Disco disco = (Disco) itr.next();
            System.out.println("Titulo : "+ disco.getTitulo() + "Genero :" + disco.getGenero().getGenero());
        }
        
        session.getTransaction().commit();
    }
    
}

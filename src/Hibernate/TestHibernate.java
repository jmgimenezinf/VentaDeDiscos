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
        Criteria criteria = session.createCriteria(Disco.class);
        Criteria criteriaStock = session.createCriteria(Stock.class);
        List stocks = criteriaStock.list();

        Iterator itr = stocks.iterator();
        while(itr.hasNext()){
            Stock stock = (Stock) itr.next();
            System.out.println("Titulo Disco : " + stock.getDisco().getAutor() + "Stock disponible: " + stock.getCantidad());
        }
        session.getTransaction().commit();
    }
    
}
